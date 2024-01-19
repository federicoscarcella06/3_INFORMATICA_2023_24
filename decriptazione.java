import javax.swing.*;

public class decriptazione{
    public static void main(String[]args){
        String frase, out;
        //A – B – C – D – E – F – G – H – I – J – K – L – M – N – O – P – Q – R – S – T – U – V – W – X – Y – Z.
        frase = JOptionPane.showInputDialog("inserisci una parola da criptare");
        frase = frase.replace("5","a")
        .replace("7","b")
        .replace("0","c")
        .replace("3","d")
        .replace("!","e")
        .replace("6","f")
        .replace("£","g")
        .replace("|","h")
        .replace("<","i")
        .replace(">","j")
        .replace("2","k")
        .replace("9","l")
        .replace("8","m")
        .replace("(","n")
        .replace("-","o")
        .replace("=","p")
        .replace("?","q")
        .replace("%","r")
        .replace("1","s")
        .replace("4","t")
        .replace("^","u")
        .replace("@","v")
        .replace("§","w")
        .replace("*","x")
        .replace("[","y")
        .replace("]","z");
        System.out.println(frase);
    }
}