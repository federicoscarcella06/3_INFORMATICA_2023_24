import java.util.Scanner;

public class CodiceFiscale {
    public static void main(String[] args) {
        char csn[];
        int aa, mm, gg, contc = 0, sost = 0;
        int indiceCsn = 0; // Contatore per l'array csn
        int contC = 0; // Contatore delle consonanti
        char s;
        String nome, consn, cognome, città, provincia, sesso, cf = "";

        Scanner inp = new Scanner(System.in);

        System.out.println("Inserisci il cognome");
        cognome = inp.nextLine();

        System.out.println("Inserisci il nome");
        nome = inp.nextLine();

        cognome = cognome.toLowerCase();
        nome = nome.toLowerCase();

        // Prima fase===========================
        for (int i = 0; i < cognome.length(); i++) {
            if (cognome.charAt(i) != 'a' && cognome.charAt(i) != 'e' && cognome.charAt(i) != 'i' && cognome.charAt(i) != 'o' && cognome.charAt(i) != 'u') {
                contc++;
            }
        }
        if (contc > 3) {
            for (int i = 0, cont = 0; i < cognome.length() && cont < 3; i++) {
                if (cognome.charAt(i) != 'a' && cognome.charAt(i) != 'e' && cognome.charAt(i) != 'i' && cognome.charAt(i) != 'o' && cognome.charAt(i) != 'u') {
                    cf += cognome.charAt(i);
                    cont++;
                }
            }
        } else if (contc < 3 && cognome.length() <= 3) {
            sost = 3 - cognome.length();
            for (int i = 0; i < cognome.length(); i++) {
                cf += cognome.charAt(i);
            }
            for (int j = 0; j < sost; j++) {
                cf += "X";
            }
        }
        contc = 0;
        // Seconda fase===========================ES CF SCRFRC06E03L781S
        
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) != 'a' && nome.charAt(i) != 'e' && nome.charAt(i) != 'i' && nome.charAt(i) != 'o' && nome.charAt(i) != 'u') {
                contC++;
            }
        }
        csn = new char[contC];
        
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) != 'a' && nome.charAt(i) != 'e' && nome.charAt(i) != 'i' && nome.charAt(i) != 'o' && nome.charAt(i) != 'u') {
                csn[indiceCsn++] = nome.charAt(i);
            }
        }
        if (contC > 3 ) {
            cf += csn[0];
            cf += csn[2];
            cf += csn[3];
        }else if(contC <3 || nome.length() >= 3 ){ // problema
            for (int i = 0; i < cognome.length(); i++){
                if (cognome.charAt(i) != 'a' && cognome.charAt(i) != 'e' && cognome.charAt(i) != 'i' && cognome.charAt(i) != 'o' && cognome.charAt(i) != 'u') {
                    contc++;
                }
            }
        }else if (contc > 3) {
            for (int i = 0, cont = 0; i < cognome.length() && cont < 3; i++) {
                if (cognome.charAt(i) != 'a' && cognome.charAt(i) != 'e' && cognome.charAt(i) != 'i' && cognome.charAt(i) != 'o' && cognome.charAt(i) != 'u') {
                    cf += cognome.charAt(i);
                    cont++;
                }
            }  
        }else if(contC < 3 && nome.length() <= 3) {
            sost = 3 - nome.length();
            for (int i = 0; i < nome.length(); i++) {
                cf += nome.charAt(i);
            }
            for (int j = 0; j < sost; j++) {
                cf += "X";
            }
        }
        System.out.println(cf);
    }
}
