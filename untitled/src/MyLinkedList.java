public class Set100int {

    private boolean array[] = new boolean[101];

    public boolean add(int e) {
        if (e > 100)
            return false;
        else {
            array[e] = true;
            return true;
        }
    }

    public void clear() {
        Arrays.fill(array, false);

    }

    public boolean contains(int e) {
        if (e <= 100)
            return array[e];
        else
            return false;
    }

    public boolean remove(int e) {
        if (e > 100)
            return false;
        else {
            array[e] = false;
            return true;
        }
    }
}