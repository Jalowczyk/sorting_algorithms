package codecool.sort;

public class BinarySort {

    private int low;
    private int high;
    private int[] array;

    public BinarySort(int[] array) {
        this.array = array;
        this.low = 0;
        this.high = array.length - 1;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    private void setup() {
        this.low = 0;
        this.high = array.length - 1;
    }

    public boolean search(int item) {
        int medIndex = (this.low + this.high) / 2;
        int med = this.array[medIndex];

        if (this.low <= this.high) {

            if (item < med) {
                setHigh(medIndex - 1);
                return search(item);
            } else if (item > med) {
                setLow(medIndex + 1);
                return search(item);
            } else {
                setup();
                return true;
            }
        }

        setup();
        return false;
    }
}
