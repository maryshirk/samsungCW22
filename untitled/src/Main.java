import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        f(500, 500, 100);
    }

    private static void f(int x, int y, int r) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(r);
        if (r > 15) {
            f(x + r, y, r / 2);
            f(x - r, y, r / 2);
            f(x, y - r, r / 2);
            f(x, y + r, r / 2);
        }
    }
}