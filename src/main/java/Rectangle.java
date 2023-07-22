public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        if (height >= 0 & width >= 0) {
            this.height = height;
            this.width = width;
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
