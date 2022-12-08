package pl.dolega.creditcardmultidb;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import pl.dolega.creditcardmultidb.config.SpringContextHelper;
import pl.dolega.creditcardmultidb.service.EncryptionService;

@Converter
public class CreditCardConverter implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String attribute) {
        return getEncryptionService().encrypt(attribute);
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return getEncryptionService().decrypt(dbData);
    }

    private EncryptionService getEncryptionService(){
        return SpringContextHelper.getApplicationContext().getBean(EncryptionService.class);
    }
}
