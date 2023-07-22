public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        validate(height, width);

        this.height = height;
        this.width = width;
    }

    private static void validate(int height, int width) {
        validateHeight(height);
        validateWidth(width);
    }

    private static void validateWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateHeight(int height) {
        if (height < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int computeArea() {
        return getHeight() * getWidth();
    }
}
