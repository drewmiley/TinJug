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
        return 0;
    }
}
