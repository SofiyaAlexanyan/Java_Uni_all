package Pr_7._1_;

import Pr_7._1_.MovablePoint;
import Pr_7._1_.MovableRectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты x и y верхней левой точки прямоугольника, а потом скорость точки по x и y:\n>>");

        MovablePoint topLeft = new MovablePoint(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.print("Введите координаты x и y нижней правой точки прямоугольника, а потом скорость точки по x и y:\n>>");
        MovablePoint bottomRight = new MovablePoint(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        Movable rectangle = new MovableRectangle(topLeft, bottomRight);
        System.out.println("START");
        System.out.println(rectangle.toString());
        System.out.println("Скорость по x: " + bottomRight.xSpeed + "\nСкорость по y: " + bottomRight.ySpeed);
        System.out.println();

        System.out.println("Сдвиг вниз:");
        rectangle.moveDown();
        System.out.println(rectangle.toString());
        System.out.println();

        System.out.println("Сдвиг вверх:");
        rectangle.moveUp();
        System.out.println(rectangle.toString());
        System.out.println();

        System.out.println("Сдвиг вправо:");
        rectangle.moveRight();
        System.out.println(rectangle.toString());
        System.out.println();

        System.out.println("Сдвиг влево:");
        rectangle.moveLeft();
        System.out.println(rectangle.toString());
        System.out.println();

    }

}

