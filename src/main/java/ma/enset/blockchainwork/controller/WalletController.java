package ma.enset.blockchainwork.controller;


import lombok.RequiredArgsConstructor;
import ma.enset.blockchainwork.entities.Wallet;
import ma.enset.blockchainwork.service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
@RequiredArgsConstructor
public class WalletController {
    private final WalletService walletService;

    @PostMapping("/create")
    public ResponseEntity<Wallet> createWallet() throws Exception {
        Wallet wallet = walletService.createWallet();
        return ResponseEntity.ok(wallet);
    }

    @PostMapping("/sign")
    public ResponseEntity<String> signTransaction(@RequestParam String transactionData, @RequestBody Wallet wallet) {
        String signedTransaction = walletService.signTransaction(wallet, transactionData);
        return ResponseEntity.ok(signedTransaction);
    }
}

