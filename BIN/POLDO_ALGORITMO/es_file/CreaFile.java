import java.io.*;
import java.util.*;

public class CreaFile {
     public static void main(String[] args){

        int n, m;
        String s;
        
        String stu[];
        double voti[][];
        
        Scanner inp = new Scanner(System.in);
                
        File file = new File("dati.txt");
        
        try{
            FileWriter writer = new FileWriter(file);
            do{
                System.out.println("Scrivi il numero di studenti:");
                n = inp.nextInt();

            }while(n < 1);
            
            do{
                System.out.println("Scrivi il numero di voti da assegnare agli studenti:");
                m = inp.nextInt();
            }while (m < 0);

            stu = new String[n];
            voti = new double[n][m];

            for(int i = 0; i < n; i++) {
                inp.skip("\n");
                System.out.println("Scrivi il nome dello studente:");
                stu[i] = inp.nextLine(); 
                writer.append(stu[i]+" ");
                
                for (int j = 0; j < m; j++) {
                    System.out.println("Scrivi il voto:");
                    voti[i][j] = inp.nextDouble();
                    writer.append(voti[i][j] + ";");
                }
                writer.append("\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
