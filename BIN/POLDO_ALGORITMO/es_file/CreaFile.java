import java.io.*;
import java.util.*;

public class CreaFile{
    public static void main(String[] args){
        File file = new File("dati.txt");
        Scanner inp = new Scanner(System.in);
        int n, m;
        String[] stu;
        double[][] voti;
        try{
            FileWriter writer = new FileWriter(file);
            do{
                System.out.println("Scrivi il numero di studenti:");
                n = inp.nextInt();
                inp.nextLine();
            }while(n < 1);
            
            stu = new String[n];
            do{
                System.out.println("Scrivi il numero di voti per da assegnare agli studenti");
                m = inp.nextInt();
            }while(m<0);
            
            voti = new double[n][m];
            
            for(int i = 0; i < n; i++){
                System.out.println("Scrivi il nome dello studente:");
                stu[i] = inp.nextLine();

                for(int j=0; j<m;j++){
                    System.out.println("Scrivi i voti");
                    voti[i][j] = inp.nextDouble();
                    writer.append(voti[i][j]+";");
                }
                
                writer.append("\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
