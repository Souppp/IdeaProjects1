package Ru.psv.project;

public class Main {


    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("Площадь квадрата - " + s.l + " = " + s.area() );

        Rectangle r = new Rectangle(5, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area() );




    }




}
