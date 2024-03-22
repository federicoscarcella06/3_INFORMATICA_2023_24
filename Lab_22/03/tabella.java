

/**
 * Aggiungi qui una descrizione della classe lista
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */

import java.io.*;
import java.util.*;

public class Lista{
    public static void main(String[]args){
        String nomeCognome[][];
        String nome="", cognome="", add="";
        
        int npers=1;
        
        File file = new File("tabname.html");
        Scanner inp = new Scanner(System.in);
        
        try{
            FileWriter writer = new FileWriter(file);
            
            nomeCognome = new String[npers][2];
            
            writer.append("<!DOCTYPE html>\n<html>\n<head>\n<link rel='stylesheet' href='styles.css'>\n<style>\ntable, td {\nborder: 2px solid black;\n}table{\nfont-size: 160%;\nborder-radius: 15px;\n}\ntable, tr, td{\npadding: 10px;\nborder-radius: 15px;\n}\n.center-table {\nmargin: 0 auto;\n display: table;\n }body,h2 {\ntext-align: center;\n}\n</style>\n</head>\n<body>\n<h2>A basic HTML table</h2>\n<div class='center-table'>\n<table>\n<tr>\n<th>nome</th>\n<th>cognome</th>\n</tr>\n");
            
            for(int i = 0;i<npers;i++){
                
               
                
                //campi di inserimento dati utente
                
                System.out.println("scrivi il nome della persona");
                nome = inp.nextLine();
                
                System.out.println("scrivi il cognome della persona");
                cognome = inp.nextLine();
                
                System.out.println("vuoi aggiungere un'altra persona? RISPONDI 'si' o 'no'");
                add = inp.nextLine();
                
                //fine campi inserimento dati utente
                
                nomeCognome[i][0] = nome;
                nomeCognome[i][1] = cognome;
                
                if(add.equalsIgnoreCase("si")){
                    npers++;
                    nomeCognome = new String[npers][2];
                }
                
                writer.append("<tr>\n<td>"+nome+"</td>\n<td>"+cognome+"</td>\n</tr>\n");
            }
            writer.append("</table>\n</div>\n</body>\n</html>\n ");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
            
        }
    }
}
