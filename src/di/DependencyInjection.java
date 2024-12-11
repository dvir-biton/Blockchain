package di;

import services.BlockchainService;
import services.hash.HashService;
import services.hash.SHA256HashService;

public class DependencyInjection {
    private static HashService hashService = null;
    private static BlockchainService blockchainService = null;

    public static void setup() {
        hashService = new SHA256HashService();
        blockchainService = new BlockchainService();
    }

    public static HashService getHashService() {
        return hashService;
    }

    public static BlockchainService getBlockchainService() {
        return blockchainService;
    }
}
