package factory;

import di.DependencyInjection;
import entities.Block;

public class BlockFactory {
    public static Block createBlock(
        final String previousHash,
        final String data
    ) {
        final long timestamp = System.currentTimeMillis();

        return new Block(
            DependencyInjection.getBlockchainService().calculateHash(
                previousHash,
                data,
                timestamp
            ),
            previousHash,
            data,
            timestamp
        );
    }
}
