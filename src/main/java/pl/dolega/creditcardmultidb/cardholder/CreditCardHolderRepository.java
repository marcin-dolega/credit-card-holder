package pl.dolega.creditcardmultidb.cardholder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardHolderRepository extends JpaRepository<CreditCardHolder, Long> {
}