import javax.swing.*;

public class Es_3_if{
    public static void main(String[]args){
        int c;
        double f, k;

        c = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la temperatura in Celsius:"));

        if(c < -273){
            System.out.println("Errore: La temperatura è inferiore allo zero assoluto.");
            
        }else{

            f = (9.0 / 5.0) * c + 32;

            k = c + 273.15;

            System.out.println("Temperatura in Fahrenheit: " + f);
            System.out.println("Temperatura in Kelvin: " + k);
        }
    }
}