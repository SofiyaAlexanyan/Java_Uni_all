package Pr_7._7_;

public class Book implements Printable{
    String name;

    public Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Book)
                p.print();
        }

        }
    public Printable print () {
        System.out.println(name);
        return null;
    }

}

