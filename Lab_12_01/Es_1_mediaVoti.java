import javax.swing.*;

public class Es_1{
    public static void main(String []args){
        int n;
        double voto, somma;
        somma = 0;
        voto = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("insersci quanti voti desideri inserire"));
        }while(n <= 3);
            
        for(int i = 0; i < n; i++){
            
            do{
                voto = Double.parseDouble(JOptionPane.showInputDialog("inserisci il voto, deve essere compreso tra 3 e 10"));
            }while(voto < 3 || voto > 10 );
            
            somma = somma + voto;

        }
        somma = somma/n;
            
        System.out.println("la media dei voti è: "+ somma);
    }
}
