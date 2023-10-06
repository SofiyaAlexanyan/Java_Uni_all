package Pr_7._5_;

public class Test {
    public static void main(String[] args) {
        Processable string = new ProcessStrings("Hello World!");
        System.out.println("Количество символов");
        System.out.println(string.count_symb());
        System.out.println();

        System.out.println("Символы на нечётных местах");
        System.out.println(string.new_string());
        System.out.println();


        System.out.println("Перевёрнутая строка");
        System.out.println(string.inverse_string());
    }
}
