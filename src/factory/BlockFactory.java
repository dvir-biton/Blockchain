package factory;

import di.DependencyInjection;
import entities.Block;

public class BlockFactory {
    public static Block createBlock(
        final String previousHash,
        final long timestamp,
        final String data
    ) {
        return new Block(
            DependencyInjection.getHashService().hash(
                previousHash +
                timestamp +
                data
            ),
            previousHash,
            data
        );
    }
}
