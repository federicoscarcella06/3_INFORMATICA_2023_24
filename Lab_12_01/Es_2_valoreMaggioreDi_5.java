import javax.swing.*;

public class Es_2{
    public static void main(String[]args){
        int n;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("insersci un valore intero maggiore di 5"));
            if(n < 5){
                System.out.println("assicurati di aver inserito un numero maggiore di 5");
            }
        }while(n < 5);
        System.out.println("programma terminato");
    }
}
