package ma.enset.blockchainwork.entities;


import lombok.Getter;
import lombok.Setter;
import ma.enset.blockchainwork.helper.HashUtil;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
public class Block {

    private int index;

    private Instant timestamp;

    private String previousHash;

    private String currentHash;


    private List<Transaction> transactions;

    private int nonce;

    public Block(int index, String previousHash, List<Transaction> transactions, int nonce) {
        this.index = index;
        this.timestamp = Instant.now();
        this.previousHash = previousHash;
        this.transactions = transactions;
        this.nonce = nonce;
        this.currentHash = calculateHash();
    }

    public void incrementNonce() {
        nonce++;
    }

    public String calculateHash() {
        // Hash calculation logic using the block's attributes and HashUtil
        // Example implementation:
        String data = index + timestamp.toString() + previousHash + transactions.toString() + nonce;
        return HashUtil.calculateSHA256(data);
    }


    public void mineBlock(int difficulty) {
        for(String target = (new String(new char[difficulty])).replace('\u0000', '0'); !this.currentHash.substring(0, difficulty).equals(target); this.currentHash = this.calculateHash()) {
            ++this.nonce;
        }

        System.out.println("Block Mined! : " + this.currentHash);
    }


}