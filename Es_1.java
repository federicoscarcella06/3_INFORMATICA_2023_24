import javax.swing.*;

public class Es_1 {
    public static void main(String args[]) {
        int gg, mm, aa;
        int giorniInMese = 0;

        gg = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il giorno"));
        mm = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il mese"));
        aa = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'anno"));

        boolean bisestile = (aa % 4 == 0 && aa % 100 != 0) || (aa % 400 == 0);

        // Verifica del numero di giorni nel mese
        switch (mm) {
            case 1: // Gennaio
            case 3: // Marzo
            case 5: // Maggio
            case 7: // Luglio
            case 8: // Agosto
            case 10: // Ottobre
            case 12: // Dicembre
                giorniInMese = 31;
                break;
            case 4: // Aprile
            case 6: // Giugno
            case 9: // Settembre
            case 11: // Novembre
                giorniInMese = 30;
                break;
            case 2: // Febbraio
                giorniInMese = bisestile ? 29 : 28;
                break;
            default:
                System.out.println("Mese non valido");
                return;
        }

        // Verifica della validità della data
        if(gg > 0 && gg <= giorniInMese && mm > 0 && mm <= 12) {
            System.out.println("La data è corretta");
        }else{
            System.out.println("La data non è corretta");
        }
    }
}