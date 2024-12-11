import di.DependencyInjection;
import entities.Block;
import factory.BlockFactory;

public class Main {
    public static void main(String[] args) {
        DependencyInjection.setup();

        Block genesisBlock = BlockFactory.createBlock("0", "Hi im the first block");
        System.out.println("Hash for block 1: " + genesisBlock.getHash());

        Block secondBlock = BlockFactory.createBlock(genesisBlock.getHash(), "Yo im the second block");
        System.out.println("Hash for block 2: " + secondBlock.getHash());

        Block thirdBlock = BlockFactory.createBlock(secondBlock.getHash(), "Hey im the third block");
        System.out.println("Hash for block 3: " + thirdBlock.getHash());
    }
}