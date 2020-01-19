package pl.sdacademy.intermediate.basic.basic10;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be higher than 0");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void updateHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }

    }

    public void updateWidth(int width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    public int calculateArea() {
        return height * width;
    }

    public int calculatePerimeter() {
        return 2 * width + 2 * height;
    }


}
