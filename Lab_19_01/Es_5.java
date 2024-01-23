import java.util.*;

public class Main{
    public static void main(String[]args){
      
        String nome="", cognome ="", prime4lettere="",primalettera="";;
        Scanner inp = new Scanner(System.in);

        System.out.print("Inserisci una il nome ");
        nome = inp.nextLine();
      
        System.out.print("Inserisci una il cognome");
        cognome = inp.nextLine();

        // Verificare se la lunghezza della stringa
        if(inputString.length() >= 4){

            prime4Lettere = inputString.substring(0, 4);

            System.out.println("Le prime 4 lettere sono: " + prime4Lettere);
        }else{
            System.out.println("La stringa inserita è troppo breve. Inserisci almeno 4 caratteri.");
        }
    }
}

