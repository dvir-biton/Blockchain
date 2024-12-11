package entities;

public class Block {
    private final String hash;
    private final String previousHash;
    private final String data;
    private final long timestamp;

    public Block(
        final String hash,
        final String previousHash,
        final String data
    ) {
        this.hash = hash;
        this.previousHash = previousHash;
        this.data = data;
        timestamp = System.currentTimeMillis();
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }
}
