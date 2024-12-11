package services;

import di.DependencyInjection;
import entities.Block;

public class MiningService {
    private final int difficulty;

    public MiningService(int difficulty) {
        this.difficulty = difficulty;
    }

    public Block mineBlock(Block block) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        int nonce = 0;
        String hash;

        do {
            hash = DependencyInjection.getHashService().hash(
            block.getPreviousHash() +
                block.getTimestamp() +
                nonce +
                block.getData()
            );
            nonce++;
        } while (!hash.substring(0, difficulty).equals(target));

        return new Block(hash, block.getPreviousHash(), block.getData(), block.getTimestamp(), nonce - 1);
    }
}
