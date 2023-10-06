package Pr_7._5_;

public class ProcessStrings implements Processable{
    String string;
    ProcessStrings(String string)
    {
        this.string = string;
    }
    public int count_symb(){
        int c = 0;
        for (int i=0; i<string.length(); i++){
            if ((string.charAt(i)) != ' ') {
                c++;
            }
        }
        return c;
    }

    public String new_string(){
        String newString = "";
        for (int i = 0; i<string.length();i++){
            if (i%2 == 1){
                newString += string.charAt(i) ;
            }
        }
    return newString;
    }

    public String inverse_string(){
        String newString = "";
        for (int i = 0; i < string.length();i++){
            newString += string.charAt(string.length()- 1 - i); //-1 т.к. например "Hi" имеет длину 2
            //length = 2, при первой итерации i=0, length = 2 => charAt(2), что выходит за диапазон => -1
        }
        return newString;
    }
}
