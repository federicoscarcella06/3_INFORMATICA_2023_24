
import javax.swing.*;

public class Es_4_if {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il primo numero:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il secondo numero:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il terzo numero:"));

        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("in ordine crescente sono: " + a + ", " + b + ", " + c);
    }
}