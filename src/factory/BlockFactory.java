package factory;

import di.DependencyInjection;
import entities.Block;

public class BlockFactory {
    public static Block createBlock(
        final String previousHash,
        final String data
    ) {
        final long currentMillis = System.currentTimeMillis();

        return new Block(
            DependencyInjection.getHashService().hash(
                previousHash +
                currentMillis +
                data
            ),
            previousHash,
            data,
            currentMillis
        );
    }
}
