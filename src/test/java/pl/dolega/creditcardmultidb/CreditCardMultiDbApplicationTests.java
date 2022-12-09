package pl.dolega.creditcardmultidb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.dolega.creditcardmultidb.domain.creditcard.CreditCard;
import pl.dolega.creditcardmultidb.service.CreditCardService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CreditCardMultiDbApplicationTests {

	@Autowired
	CreditCardService creditCardService;

	@Test
	void testSaveAndGetCreditCard() {
		CreditCard cc = CreditCard.builder()
				.firstName("Marcin")
				.lastName("Dolega")
				.zipCode("80351")
				.creditCardNumber("1234567890")
				.cvv("666")
				.expirationDate("12/24")
				.build();

		CreditCard savedCC = creditCardService.saveCreditCard(cc);

		assertThat(savedCC).isNotNull();
		assertThat(savedCC.getId()).isNotNull();
		assertThat(savedCC.getCreditCardNumber()).isNotNull();

		CreditCard fetchedCC = creditCardService.getCreditCardById(savedCC.getId());

		assertThat(fetchedCC).isNotNull();
		assertThat(fetchedCC.getId()).isNotNull();
		assertThat(fetchedCC.getCreditCardNumber()).isNotNull();
	}

	@Test
	void contextLoads() {
	}

}
