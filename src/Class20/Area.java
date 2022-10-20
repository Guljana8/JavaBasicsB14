package Class20;

public class Area {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    int area;
    int volume;
    int length;
    int width;
    int height;

     void Area(int length) {
       System.out.println("Area of Square "+(length*2));

    }

     void Area(int length, int width) {

        System.out.println("Area of Rectangle "+(width*length));

    }

      void Volume(int height, int length, int width) {
        System.out.println("Volume of Box is "+(length*width*height));

    }

    public static void main(String[] args) {

        Area square=new Area();
        square.Area(5);
        Area rectangle=new Area();
        rectangle.Area(9,8);
        Area box=new Area();
        box.Volume(10,30,18);



    }
}