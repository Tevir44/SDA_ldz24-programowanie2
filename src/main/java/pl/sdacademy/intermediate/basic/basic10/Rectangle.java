package pl.sdacademy.intermediate.basic.basic10;

class Rectangle {

    private int width;
    private int height;

    Rectangle(int width, int height) {

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be higher than 0");
        }
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    void updateHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }

    }

    void updateWidth(int width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    int calculateArea() {
        return height * width;
    }

    int calculatePerimeter() {
        return 2 * width + 2 * height;
    }


}
