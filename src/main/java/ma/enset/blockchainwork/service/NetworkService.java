package ma.enset.blockchainwork.service;

import ma.enset.blockchainwork.entities.Block;
import ma.enset.blockchainwork.entities.Blockchain;
import ma.enset.blockchainwork.entities.Node;
import ma.enset.blockchainwork.entities.Transaction;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class NetworkService {
   //Manage peer-to-peer network
    private Set<Node> nodes = new HashSet<>();
    private Blockchain blockchain;

    public NetworkService(Blockchain blockchain) {
        this.blockchain = blockchain;
    }

    public void registerNode(String address) {
        nodes.add(new Node(address));
    }

    public void broadcastTransaction(Transaction transaction) {
        nodes.forEach(node -> {
            // Logic to broadcast transaction to each node
        });
    }

    public void broadcastBlock(Block block) {
        nodes.forEach(node -> {
            // Logic to broadcast block to each node
        });
    }

    // Additional methods for handling incoming transactions and blocks
}