import javax.swing.JOptionPane;

public class Es_5{

    public static void main(String[] args){

        int n, val, maggioriDiVal = 0, minoriDiVal = 0, valoreCorrente;

        n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero n (n > 2):"));

        // Assicura che n sia maggiore di 2
        while(n <= 2){
            System.out.println( "Il numero n deve essere maggiore di 2. Riprova.");
            
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero n (n > 2):"));
        }

        val = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il valore val:"));

        for(int i = 1; i <= n; i++){
            valoreCorrente = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il valore #" + i + ":"));

            if(valoreCorrente > val){
                
                maggioriDiVal++;
                
            }else if(valoreCorrente < val){
                
                minoriDiVal++;
                
            }
        }

        System.out.println("Numero di valori maggiori di val: " + maggioriDiVal);
        System.out.println("Numero di valori minori di val: " + minoriDiVal);
    }
}
