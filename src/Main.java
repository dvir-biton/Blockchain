import di.DependencyInjection;
import entities.Block;
import factory.BlockFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DependencyInjection.setup();

        final List<Block> blockchain = new ArrayList<>();

        Block genesisBlock = BlockFactory.createBlock("0", "Hi im the first block");
        blockchain.add(genesisBlock);
        System.out.println("Hash for block 1: " + genesisBlock.getHash());

        Block secondBlock = BlockFactory.createBlock(genesisBlock.getHash(), "Yo im the second block");
        blockchain.add(secondBlock);
        System.out.println("Hash for block 2: " + secondBlock.getHash());

        Block thirdBlock = BlockFactory.createBlock(secondBlock.getHash(), "Hey im the third block");
        blockchain.add(thirdBlock);
        System.out.println("Hash for block 3: " + thirdBlock.getHash());

        System.out.println(DependencyInjection.getBlockchainService().isChainValid(blockchain));
    }
}