import java.util.Scanner;

public class CodiceFiscale {
    public static void main(String[] args) {
        
        //ESEMPIO----ES CF SCRFRC06E03L781S
        char c1 = ' ', c2 = ' ', c3 = ' ', c4 = ' ',mese;
        int contc1 = 0, contc2 = 0,nmese;
        String nome = "", cognome = "",anno, cf = "",mf,gg;

        Scanner inp = new Scanner(System.in);

        System.out.println("Inserisci il cognome");
        cognome = inp.nextLine().toLowerCase();

        System.out.println("Inserisci il nome");
        nome = inp.nextLine().toLowerCase();
        
        System.out.println("Inserisci l'anno di nascita in formato AAAA");
        anno = inp.nextLine();
        
        do{
            System.out.println("inserisci il mese in formato MM");
            nmese = inp.nextInt();            
        }while(nmese <0 || nmese > 12);

        System.out.println("inserisci il sesso 'F' per femmina 'M' per maschio");
        mf = inp.nextLine();
        mf = inp.nextLine();//correzione errore bug
        
        System.out.println("inserisci il giorno di nascita in formato GG");
        gg = inp.nextLine();
        
        // Prima fase 
        
        for (int i = 0; i < cognome.length() && contc1 < 3; i++) {
            c1 = cognome.charAt(i);
            if (c1 != 'a' && c1 != 'e' && c1 != 'i' && c1 != 'o' && c1 != 'u') {
                cf += c1;
                contc1++;
            }
        }
        
        for (int i = 0; i < cognome.length() && contc1 < 3; i++) {
            c2 = cognome.charAt(i);
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
                cf += c2;
                contc1++;
            }
        }
        
        for (int i = contc1; i < 3; i++) {
            cf += 'X';
        }

        // Seconda fase
        
        for (int i = 0; i < nome.length() && contc2 < 3; i++) {
            c3 = nome.charAt(i);
            if (c3 != 'a' && c3!= 'e' && c3 != 'i' && c3 != 'o' && c3 != 'u' && contc2 < 3) {
                cf += c3;
                contc2++;
            }
        }
        
        for (int i = 0; i < nome.length() && contc2 < 3; i++) {
            c4 = nome.charAt(i);
            if ((c4 == 'a' || c4 == 'e' || c4 == 'i' || c4 == 'o' || c4 == 'u') && contc2 < 3) {
                cf += c4;
                contc2++;
            }
        }
        
        for (int i = contc2; i < 3; i++) {
            cf += 'X';
        }
        
        //terza fase
        
        cf += anno.substring(2,4);
        
        //quarta fase
        switch (nmese) {
            case 1:
                mese = 'A';
                break;
            case 2:
                mese = 'B';
                break;
            case 3:
                mese = 'C';
                break;
            case 4:
                mese = 'D';
                break;
            case 5:
                mese = 'E';
                break;
            case 6:
                mese = 'H';
                break;
            case 7:
                mese = 'L';
                break;
            case 8:
                mese = 'M';
                break;
            case 9:
                mese = 'P';
                break;
            case 10:
                mese = 'R';
                break;
            case 11:
                mese = 'S';
                break;
            case 12:
                mese = 'T';
                break;
            default:
                System.out.println("Numero del mese non valido.");
                return;
        }
        cf += mese;
        
        //quinta fase
        
        if(mf.equalsIgnoreCase("m")){
            if(gg.length()==1){
                cf += "0"+gg;
            }else cf += gg;
        }else if(mf.equalsIgnoreCase("f")){
            cf += gg+40;
        }
        
        System.out.println("Codice fiscale: " + cf.toUpperCase());
    }
}
