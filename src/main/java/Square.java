public class Square implements Shape {
    private int length;

    public Square(int length) {
        setLength(length);
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
        validateLength(length);
        this.length = length;
    }

    @Override
    public int computeArea() {
        return getLength() * getLength();
    }
}
