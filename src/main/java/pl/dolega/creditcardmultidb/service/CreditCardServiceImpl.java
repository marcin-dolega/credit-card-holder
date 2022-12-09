package pl.dolega.creditcardmultidb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.dolega.creditcardmultidb.domain.cardholder.CreditCardHolder;
import pl.dolega.creditcardmultidb.domain.cardholder.CreditCardHolderRepository;
import pl.dolega.creditcardmultidb.domain.creditcard.CreditCard;
import pl.dolega.creditcardmultidb.domain.creditcard.CreditCardRepository;
import pl.dolega.creditcardmultidb.domain.pan.CreditCardPAN;
import pl.dolega.creditcardmultidb.domain.pan.CreditCardPANRepository;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository;
    private final CreditCardHolderRepository creditCardHolderRepository;
    private final CreditCardPANRepository creditCardPANRepository;

    @Override
    public CreditCard getCreditCardById(Long id) {
        return null;
    }

    @Transactional
    @Override
    public CreditCard saveCreditCard(CreditCard cc) {
        CreditCard savedCC = creditCardRepository.save(cc);
        savedCC.setFirstName(cc.getFirstName());
        savedCC.setLastName(cc.getLastName());
        savedCC.setZipCode(cc.getZipCode());
        savedCC.setCreditCardNumber(cc.getCreditCardNumber());

        creditCardHolderRepository.save(CreditCardHolder.builder()
                .creditCardId(savedCC.getId())
                .firstName(savedCC.getFirstName())
                .lastName(savedCC.getLastName())
                .zipCode(savedCC.getZipCode())
                .build());

        creditCardPANRepository.save(CreditCardPAN.builder()
                .creditCardNumber(savedCC.getCreditCardNumber())
                .creditCardId(savedCC.getId())
                .build());

        return savedCC;
    }
}
