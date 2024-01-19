import javax.swing.*;

public class criptazione{
    public static void main(String[]args){
        String frase, out;
        //A – B – C – D – E – F – G – H – I – J – K – L – M – N – O – P – Q – R – S – T – U – V – W – X – Y – Z.
        frase = JOptionPane.showInputDialog("inserisci una parola da criptare");
        frase = frase.replace("a","5")
        .replace("b","7")
        .replace("c","0")
        .replace("d","3")
        .replace("e","!")
        .replace("f","6")
        .replace("g","£")
        .replace("h","|")
        .replace("i","<")
        .replace("j",">")
        .replace("k","2")
        .replace("l","9")
        .replace("m","8")
        .replace("n","(")
        .replace("o","-")
        .replace("p","=")
        .replace("q","?")
        .replace("r","%")
        .replace("s","1")
        .replace("t","4")
        .replace("u","^")
        .replace("v","@")
        .replace("w","§")
        .replace("x","*")
        .replace("y","[")
        .replace("z","]");
        System.out.println(frase);
    }
}