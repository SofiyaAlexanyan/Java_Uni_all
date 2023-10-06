package Pr_7._7_;

public class Test {
    public static void main(String[] args) {

        Printable[] set = new Printable[3];
        set[0] = new Book("The Stand");
        set[1] = new Magazine("New York Times");
        set[2] = new Book("White Fang");

        System.out.println("Журналы:");
        Magazine.printMagazines(set);
        System.out.println();

        System.out.println("Книги:");
        Book.printBooks(set);
    }
}
