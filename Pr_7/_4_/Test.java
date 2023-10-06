package Pr_7._4_;

public class Test {
    public static void main(String[] args) {
        MathCalculable tool = new MathFunc();
        System.out.println("Возведение в степень: ");
        System.out.println(tool.power(2,3));
        System.out.println();

        System.out.println("Модуль комплексного числа: ");
        System.out.println(tool.module(3,6));
        System.out.println();

        System.out.println("Длина окружности: ");
        System.out.println(tool.circle_length(5));
        System.out.println();

    }
}
