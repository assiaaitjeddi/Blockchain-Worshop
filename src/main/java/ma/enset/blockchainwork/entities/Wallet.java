package ma.enset.blockchainwork.entities;


import lombok.Getter;
import lombok.Setter;
import ma.enset.blockchainwork.exemples.AsymmetricEncryption;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

@Getter
@Setter
public class Wallet {
    private PrivateKey privateKey;
    private PublicKey publicKey;
    private String address;

    public Wallet() throws Exception {
        KeyPair keyPair = AsymmetricEncryption.generateKeyPair();
        this.privateKey = keyPair.getPrivate();
        this.publicKey = keyPair.getPublic();
        this.address = generateAddress();
    }

    private String generateAddress() {
        // Logic to generate address based on the public key
        return publicKey.toString(); // Simplified for this example
    }
}

