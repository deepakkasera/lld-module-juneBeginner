package synchronisation.syncmethod;

public class Count {
    private int value = 0;

    public synchronized void incrementValue(int i) {
        //Only one thread at one time can execute this method on one object.
        this.value += i;
    }
    public int getValue() {
        return value;
    }
}
