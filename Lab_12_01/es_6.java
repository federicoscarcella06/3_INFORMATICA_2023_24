import javax.swing.*;

public class es_6{
    public static void main(String[]args){
        int a,b;
        int c = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("inserisci il primo valore"));
        b = Integer.parseInt(JOptionPane.showInputDialog("inserisci il secondo valore"));
        
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                c++;
                
            }
        }
        System.out.println("i numeri pari sono: "+ c);
    }
}