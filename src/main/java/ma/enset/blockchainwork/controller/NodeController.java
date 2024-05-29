package ma.enset.blockchainwork.controller;

import lombok.RequiredArgsConstructor;
import ma.enset.blockchainwork.service.NetworkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/network")
@RequiredArgsConstructor
public class NodeController {
    private final NetworkService networkService;

    @PostMapping("/register")
    public ResponseEntity<String> registerNode(@RequestParam String address) {
        networkService.registerNode(address);
        return ResponseEntity.ok("Node registered successfully.");
    }
}
