package lesson26_DZ26;

public class Rectangle implements Interface1 {
    public Rectangle(int width, int height) {

        System.out.println("Width: " + width + ", Height: " + height);

    }

    @Override
    public int resizeWidth(int width) {
        return width;
    }

    @Override
    public int resizeHeight(int height) {
        return height;
    }

}




