package Pr_7._7_;

public class Magazine implements Printable{
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public Printable print(){
        System.out.println(name);
        return null;
    }
    public static void printMagazines(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Magazine)
                p.print();
        }

    }

}
