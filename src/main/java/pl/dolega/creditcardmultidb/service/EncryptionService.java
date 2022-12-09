package pl.dolega.creditcardmultidb.service;

import org.springframework.stereotype.Service;

@Service
public interface EncryptionService {

    String encrypt(String freeText);

    String decrypt(String encryptedText);

}
