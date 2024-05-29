package ma.enset.blockchainwork.mining;

import ma.enset.blockchainwork.entities.Block;

public class ProofOfWork {
    public ProofOfWork() {}

    public static void mineBlock(Block block, int difficulty) {
        block.mineBlock(difficulty);
    }

    public static boolean validateBlock(Block block, int difficulty) {
        String target = (new String(new char[difficulty])).replace('\u0000', '0');
        return block.getCurrentHash().substring(0, difficulty).equals(target);
    }
}