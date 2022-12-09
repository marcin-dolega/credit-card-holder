package pl.dolega.creditcardmultidb.service;

import pl.dolega.creditcardmultidb.domain.creditcard.CreditCard;

public interface CreditCardService {

    CreditCard getCreditCardById(Long id);

    CreditCard saveCreditCard(CreditCard cc);
}
