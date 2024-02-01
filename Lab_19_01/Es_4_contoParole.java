import java.util.*;
import java.io.*;

public class Es_4 {
    public static void main(String[] args) {
        String parola = "";
        int cont = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Inserisci una frase");
        parola = inp.nextLine();

        for (int i = 0; i < parola.length(); i++) {
            if (Character.isLetter(parola.charAt(i))) {
                cont++;
                while (i < parola.length() && Character.isLetter(parola.charAt(i))) {
                    i++;
                }
            }
        }

        System.out.println("Il numero di parole nella frase è: " + cont);
    }
}

