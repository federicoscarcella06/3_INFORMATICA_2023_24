import java.util.Scanner;

public class Es_5{
    public static void main(String[] args){

        String nome = "", cognome = "", inizioMail = "";
        Scanner inp = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        nome = inp.nextLine();

        System.out.print("Inserisci il cognome: ");
        cognome = inp.nextLine();

        i (cognome.length() >= 4){
            inizioMail = nome.substring(0, 1) + cognome.substring(0, 4);
        }else{
            inizioMail = nome.substring(0, 1) + cognome;
        }

        System.out.println("L'inizio della mail è: " + inizioMail + "@studenti.marconiverona.edu.it");
    }
}
