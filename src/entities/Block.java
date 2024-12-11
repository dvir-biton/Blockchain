package entities;

public class Block {
    private final String hash;
    private final String previousHash;
    private final String data;
    private final long timestamp;
    private final int nonce;

    public Block(
            final String hash,
            final String previousHash,
            final String data,
            final long timestamp,
            final int nonce
    ) {
        this.hash = hash;
        this.previousHash = previousHash;
        this.data = data;
        this.timestamp = timestamp;
        this.nonce = nonce;
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getData() {
        return data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getNonce() {
        return nonce;
    }
}
