package pl.dolega.creditcardmultidb.domain.creditcard;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}