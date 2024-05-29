package ma.enset.blockchainwork.controller;


import lombok.RequiredArgsConstructor;
import ma.enset.blockchainwork.entities.Block;
import ma.enset.blockchainwork.entities.Blockchain;
import ma.enset.blockchainwork.entities.Transaction;
import ma.enset.blockchainwork.service.NetworkService;
import ma.enset.blockchainwork.service.WalletService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlockchainController {

    private final Blockchain blockchain;
    private final NetworkService networkService;
    private final WalletService walletService;

    @GetMapping("/blockchain")
    public List<Block> getBlockchain() {
        return blockchain.getChain();
    }

    @PostMapping("/blockchain/transaction")
    public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
        blockchain.addTransaction(transaction);
        networkService.broadcastTransaction(transaction);
        return ResponseEntity.ok("Transaction added successfully.");
    }

    @PostMapping("/blockchain/mine")
    public ResponseEntity<String> mineBlock() {
        Block newBlock = blockchain.mineBlock();
        networkService.broadcastBlock(newBlock);
        return ResponseEntity.ok("Block mined successfully. Block hash: " + newBlock.getCurrentHash());
    }

    @GetMapping("/blockchain/block/{index}")
    public ResponseEntity<Block> getBlockByIndex(@PathVariable int index) {
        if (index >= 0 && index < blockchain.getChain().size()) {
            Block block = blockchain.getChain().get(index);
            return ResponseEntity.ok(block);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/blockchain/transaction-pool")
    public List<Transaction> getTransactionPool() {
        return blockchain.getTransactionPool().getPendingTransactions();
    }

    @GetMapping("/blockchain/validate")
    public ResponseEntity<String> validateChain() {
        boolean isValid = blockchain.validateChain();
        if (isValid) {
            return ResponseEntity.ok("Blockchain is valid.");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Blockchain is invalid.");
        }
    }
}
