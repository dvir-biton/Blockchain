package services;

import di.DependencyInjection;
import entities.Block;

import java.util.List;

public class BlockchainService {
    public boolean isChainValid(final List<Block> blockchain) {
        Block currentBlock;
        Block previousBlock;

        for (int i = 1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);

            final String currentBlockHash = calculateHash(currentBlock.getPreviousHash(), currentBlock.getData(), currentBlock.getTimestamp());
            if(!currentBlock.getHash().equals(currentBlockHash) || !previousBlock.getHash().equals(currentBlock.getPreviousHash())){
                return false;
            }
        }

        return true;
    }

    public String calculateHash(
        final String previousHash,
        final String data,
        final long currentMillis
    ) {
        return DependencyInjection.getHashService().hash(
            previousHash +
            currentMillis +
            data
        );
    }
}
