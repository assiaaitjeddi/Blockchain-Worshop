package ma.enset.blockchainwork.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private String address;

    public Node(String address) {
        this.address = address;
    }
}

