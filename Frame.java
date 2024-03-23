public class Frame {
    //Holds one file (one disk block).
    private byte [] blockContentArr = new byte[4000];
    private boolean dirty;
    private boolean pinned;
    private int blockId;

    public byte[] getBlockContentArr() {
        return blockContentArr;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isPinned() {
        return pinned;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockContentArr(byte[] blockContentArr) {
        this.blockContentArr = blockContentArr;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public String getRecord(int recordNumber) {
        return "";
    }

    public void updateRecord(int recordNumber, String newContent) {
        setDirty(true);
    }
}