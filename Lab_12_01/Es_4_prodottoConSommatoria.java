import javax.swing.*;
public class Es_4{
    public static void main(String[]args){
        int na, nb, i, s;
        s = 0;
        do{
            na = Integer.parseInt(JOptionPane.showInputDialog("inserisci il primo valore"));
            nb = Integer.parseInt(JOptionPane.showInputDialog("inserisci il secondo valore"));
        }while(na < 0 || nb < 0 );
        
        i = 0;
        
        while(i < nb){
            s = s + na;
            i++;
        }
        System.out.println("il risultato è: "+ s);
    }
}
