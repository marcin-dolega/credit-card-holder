package pl.dolega.creditcardmultidb.domain.cardholder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dolega.creditcardmultidb.domain.cardholder.CreditCardHolder;

import java.util.Optional;

@Repository
public interface CreditCardHolderRepository extends JpaRepository<CreditCardHolder, Long> {
    Optional<CreditCardHolder> findByCreditCardId(Long id);
}