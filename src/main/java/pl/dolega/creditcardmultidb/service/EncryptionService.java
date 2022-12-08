package pl.dolega.creditcardmultidb.service;

public interface EncryptionService {

    String encrypt(String freeText);

    String decrypt(String encryptedText);

}
