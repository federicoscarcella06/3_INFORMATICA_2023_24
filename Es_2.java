import javax.swing.JOptionPane;

public class Es_2{
    public static void main(String[] args){
        int giorno, mese, anno, gp = 0;
        boolean dataValida = false;
        
        //ho guardato un tutorial su come utilizzare gli array per semplificare il programma
        int[] giorniInMese = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Inserisci per calcolare quanti giorni sono passati dall'inizio dell'anno");

        do{
            giorno = Integer.parseInt(JOptionPane.showInputDialog("Inserire il giorno"));
            mese = Integer.parseInt(JOptionPane.showInputDialog("Inserire il mese"));
            anno = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno"));

            if(mese >= 1 && mese <= 12 && anno >= 0){
                switch(mese){
                    case 1, 3, 5, 7, 8, 10, 12:
                        dataValida = giorno >= 1 && giorno <= 31;
                        break;
                    case 4, 6, 9, 11:
                        dataValida = giorno >= 1 && giorno <= 30;
                        break;
                    case 2:
                        dataValida = (anno % 4 == 0 && giorno >= 1 && giorno <= 29) || (giorno >= 1 && giorno <= 28);
                        break;
                    default:
                        dataValida = false;
                        break;
                }
            }else{
                dataValida = false;
            }

            if(!dataValida){
                System.out.println("\nDATA NON VALIDA\n");
            }
        } while(!dataValida);

        gp = giorno;

        for(int i = 1; i < mese; i++){
            gp = gp + giorniInMese[i];
        }

        if(mese > 2 && anno % 4 == 0){
            gp++;
        }
        if(gp == 1){
            System.out.println("è passato "+gp+" giorno dall'inizio dell'anno");
        }else System.out.println("Sono passati "+gp+" giorni dall'inizio dell'anno");
    }
}
