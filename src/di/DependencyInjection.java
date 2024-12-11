package di;

import services.hash.HashService;
import services.hash.SHA256HashService;

public class DependencyInjection {
    private static HashService hashService = null;

    public static void setup() {
        hashService = new SHA256HashService();
    }

    public static HashService getHashService() {
        return hashService;
    }
}
