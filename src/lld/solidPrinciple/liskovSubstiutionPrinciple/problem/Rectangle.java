package lld.solidPrinciple.liskovSubstiutionPrinciple.problem;

//Problem:
//
//The Square class breaks LSP because it modifies the expected behavior of Rectangle.
//A rectangle allows independent width and height, but a square forces them to be the same.
//This can lead to unexpected behavior in client code:
class Rectangle {
    public int width, height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;  // Ensuring width = height
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;  // Ensuring width = height
    }
}

