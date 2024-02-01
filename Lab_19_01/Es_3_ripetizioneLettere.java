import java.util.*;
import java.io.*;

public class Es_3{
    public static void main(String[] args) {

        String frase = "", fraseModificata = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        frase = scanner.nextLine();

        

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j <= i; j++) {
                fraseModificata += frase.charAt(i);
            }
        }

        System.out.println("Stringa modificata: " + fraseModificata);
    }
}
