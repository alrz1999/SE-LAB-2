public class Square {
    private int length;

    public Square(int length) {
        validateLength(length);

        this.length = length;
    }

    private static void validateLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int computeArea() {
        return length * length;
    }
}
