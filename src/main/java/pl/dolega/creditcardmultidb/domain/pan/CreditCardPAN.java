package pl.dolega.creditcardmultidb.domain.pan;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.dolega.creditcardmultidb.CreditCardConverter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCardPAN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = CreditCardConverter.class)
    private String creditCardNumber;
}
