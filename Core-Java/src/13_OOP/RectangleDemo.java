class Rectangle {
    int lenght ;
    int width ;

    Rectangle(int lenght, int width){
        this.lenght = lenght;
        this.width = width;

    }
    int area(){
        return lenght * width;

    }
    int parimeter (){
        return 2 * (lenght+width);
    }
    void  display(){
        System.out.println("Legth : "+ lenght);
        System.out.println("Width : "+ width);
        System.out.println("Area : "+area());
        System.out.println("Perimeter : " +parimeter());

    }
}
public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);

        r.display();
    }
}