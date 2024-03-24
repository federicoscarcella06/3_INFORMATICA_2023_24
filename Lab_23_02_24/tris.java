import java.io.*;
import java.util.*;

public class Tris{
    public static void main(String[] args) {
        
        int px, py, cont = 0;
        String g1 = "", g2 = "";
        char tab[][];
        boolean finito = false, vittoria=false;        
        Scanner inp = new Scanner(System.in);
        
        tab = new char[3][3];
        
        System.out.println("GIOCO DEL TRIS");
        
        System.out.println("Inserire nome giocatore 1");
        g1 = inp.nextLine();
        System.out.println("Inserire nome giocatore 2");
        g2 = inp.nextLine();
        
        g1 = g1.toUpperCase();
        g2 = g2.toUpperCase();
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                tab[i][j] = '-';
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        
        while(cont < 9 && !finito) {
            
            System.out.println("Ora è il turno di " + g1);
            
            do {
                System.out.println("Inserire la coordinata della colonna");
                px = inp.nextInt();
                System.out.println("Inserire la coordinata della riga");
                py = inp.nextInt();
            } while(px > 3 || px < 0 || py > 3 || py < 0 || tab[px][py] != '-');
            
            tab[px][py] = 'X';
            cont++;
            if (cont >= 3) {
                if (tab[px][0] == 'X' && tab[px][1] == 'X' && tab[px][2] == 'X' ||
                    tab[0][py] == 'X' && tab[1][py] == 'X' && tab[2][py] == 'X' ||
                    tab[0][0] == 'X' && tab[1][1] == 'X' && tab[2][2] == 'X' ||
                    tab[0][2] == 'X' && tab[1][1] == 'X' && tab[2][0] == 'X') {
                    finito = true;
                    vittoria = true;
                    System.out.println(g1 + " ha vinto!");
                }
            }
            
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }
            
            if(cont != 9 && !finito) {
                System.out.println("Ora è il turno di " + g2);
                
                do {
                    System.out.println("Inserire la coordinata della colonna");
                    px = inp.nextInt();
                    System.out.println("Inserire la coordinata della riga");
                    py = inp.nextInt();
                } while(px > 3 || px < 0 || py > 3 || py < 0 || tab[px][py] != '-');
                
                tab[px][py] = 'O';
                cont++;
                if (cont >= 3) {
                    if (tab[px][0] == 'O' && tab[px][1] == 'O' && tab[px][2] == 'O' ||
                        tab[0][py] == 'O' && tab[1][py] == 'O' && tab[2][py] == 'O' ||
                        tab[0][0] == 'O' && tab[1][1] == 'O' && tab[2][2] == 'O' ||
                        tab[0][2] == 'O' && tab[1][1] == 'O' && tab[2][0] == 'O') {
                        finito = true;
                        vittoria = true;
                        System.out.println(g2 + " ha vinto!");
                    }
                }
                
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(tab[i][j]);
                    }
                    System.out.println();
                }
            }
        }
        if(vittoria == false){
            System.out.println("PAREGGIO");
        }
        System.out.println("GIOCO TERMINATO");
    }
}
