package entities;

public class Block {
    private final String hash;
    private final String previousHash;
    private final String data;
    private final long timestamp;

    public Block(
        final String hash,
        final String previousHash,
        final String data,
        final long timestamp
    ) {
        this.hash = hash;
        this.previousHash = previousHash;
        this.data = data;
        this.timestamp = timestamp;
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }
}
