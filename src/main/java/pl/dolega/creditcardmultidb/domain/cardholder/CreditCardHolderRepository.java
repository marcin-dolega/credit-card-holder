package pl.dolega.creditcardmultidb.domain.cardholder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dolega.creditcardmultidb.domain.cardholder.CreditCardHolder;

@Repository
public interface CreditCardHolderRepository extends JpaRepository<CreditCardHolder, Long> {
}