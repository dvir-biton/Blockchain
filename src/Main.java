import di.DependencyInjection;
import entities.Block;
import factory.BlockFactory;
import services.MiningService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DependencyInjection.setup();

        final List<Block> blockchain = new ArrayList<>();
        final MiningService miningService = DependencyInjection.getMiningService(5); // Adjust for harder mining

        Block genesisBlock = BlockFactory.createBlock("0", "Hi I'm the first block");
        genesisBlock = miningService.mineBlock(genesisBlock);
        blockchain.add(genesisBlock);
        System.out.println("Hash for block 1: " + genesisBlock.getHash());

        Block secondBlock = BlockFactory.createBlock(genesisBlock.getHash(), "Yo I'm the second block");
        secondBlock = miningService.mineBlock(secondBlock);
        blockchain.add(secondBlock);
        System.out.println("Hash for block 2: " + secondBlock.getHash());

        Block thirdBlock = BlockFactory.createBlock(secondBlock.getHash(), "Hey I'm the third block");
        thirdBlock = miningService.mineBlock(thirdBlock);
        blockchain.add(thirdBlock);
        System.out.println("Hash for block 3: " + thirdBlock.getHash());

        boolean isChainValid = DependencyInjection.getBlockchainService().isChainValid(blockchain);
        System.out.println("Blockchain is valid: " + isChainValid);
    }

}