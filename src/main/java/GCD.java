import static java.lang.Float.NaN;

public class GCD {

    private int x;
    private int y;

    GCD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float calculate() {
        if (x < 0 || y < 0) {
            return NaN;
        }
        if (x == 0 || y == 0) {
            return 0;
        }
        if (x == 1 || y == 1) {
            return 1;
        }
        return iterator();
    }

    private float iterator() {
        if (y == 0) {
            return Float.valueOf(x);
        } else {
            int xMem = x;
            int yMem = y;
            this.y = xMem % yMem;
            this.x = yMem;
            return iterator();
        }
    }

}
