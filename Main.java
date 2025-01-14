import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       VerificaData verificaData = new VerificaData();
       
       int giorno1 = 0, mese1 = 0, anno1 = 0;
       int giorno2 = 0, mese2 = 0, anno2 = 0;

       System.out.println("Inserisci la prima data:");
       System.out.print("Giorno: ");
       giorno1 = scanner.nextInt();
       System.out.print("Mese: ");
       mese1 = scanner.nextInt();
       System.out.print("Anno: ");
       anno1 = scanner.nextInt();

       System.out.println("Inserisci la seconda data:");
       System.out.print("Giorno: ");
       giorno2 = scanner.nextInt();
       System.out.print("Mese: ");
       mese2 = scanner.nextInt();
       System.out.print("Anno: ");
       anno2 = scanner.nextInt();

 
       String risultato = verificaData.verifica(giorno1, mese1, anno1, giorno2, mese2, anno2);

       System.out.println("Risultato: " + risultato);
    }
}
