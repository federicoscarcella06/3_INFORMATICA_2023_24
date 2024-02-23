import java.io.*;
import java.util.*;

public class codicefiscalefefe{
    public static void main(String[]args){
        String nome="", cognome ="",anno,mese,giorno, codicefiscale="",comune="", z="0";
        int cont =0,contc=0;
        boolean cogn = false;
        Scanner inp = new Scanner(System.in);
            
        System.out.println("Inserisci il cognome");
        cognome=inp.nextLine();
        
        System.out.println("Inserisci il nome");
        nome=inp.nextLine();
        
        System.out.println("il giorno di nascita in formato XX");
        giorno=inp.nextLine(); 
        
        System.out.println("il mese di nascita in formato XX");
        mese=inp.nextLine();
        
        System.out.println("inserisci l'anno di nascitain formato XXXX");
        anno=inp.nextLine();
        
        System.out.println("il comune di nascita");
        comune=inp.nextLine();
        
        for(int i=0;i<cognome.length() && cogn == false;i++){
            if(cognome.charAt(i)=='a' || cognome.charAt(i)=='e' ||cognome.charAt(i)=='i' || cognome.charAt(i)=='o' || cognome.charAt(i)=='u'){
                                
            }else{
                cont ++;

                codicefiscale +=cognome.charAt(i);
                if(cont >= 3){
                    cogn = true;
                }
            }
        }
        cont=0;
        for(int i=0;i<nome.length() && cont<3;i++){
            if(nome.charAt(i)=='a' || nome.charAt(i)=='e' ||nome.charAt(i)=='i' || nome.charAt(i)=='o' || nome.charAt(i)=='u'){
            }
            else{
                contc++;
            }
        }
        if(contc>3){
            for(int i=0;i<nome.length() && cont<4;i++){
                if(nome.charAt(i)=='a' || nome.charAt(i)=='e' ||nome.charAt(i)=='i' || nome.charAt(i)=='o' || nome.charAt(i)=='u'){
                }
                else{
                    if(cont!=1){
                        codicefiscale+=nome.charAt(i);
                    }
                    cont++;
                }
            }
        }
        else{
            for(int i=0;i<nome.length();i++){
                if(nome.charAt(i)=='a' || nome.charAt(i)=='e' ||nome.charAt(i)=='i' || nome.charAt(i)=='o' || nome.charAt(i)=='u'){
                }
                else{
                    codicefiscale+=nome.charAt(i);
                }
            }
        }
        for(int i=anno.length()-2;i<anno.length();i++){
            codicefiscale+=anno.charAt(i);
        }
        
        switch(mese){
            case "01":codicefiscale+="A";
                break;
            case "02":codicefiscale+="B";
                break;
            case "03":codicefiscale+="C";
                break;
            case "04":codicefiscale+="D";
                break;
            case "05":codicefiscale+="E";
                break;
            case "06":codicefiscale+="H";
                break;
            case "07":codicefiscale+="L";
                break;
            case "08":codicefiscale+="M";
                break;
            case "09":codicefiscale+="P";
                break;
            case "10":codicefiscale+="R";
                break;
            case "11":codicefiscale+="S";
                break;
            case "12":codicefiscale+="T";
                break;
        }
             
        codicefiscale+=giorno;
        comune = comune.toLowerCase();
        
        switch(comune){
            case "verona":codicefiscale+="L781";
                break;
            case "milano":codicefiscale+="F205";
                break;
            case "torino":codicefiscale+="L219";
                break;
            case "roma":codicefiscale+="H501";
                break;
            case "napoli":codicefiscale+="F839";
                break;
        }
        codicefiscale = codicefiscale.toUpperCase();
        System.out.println(codicefiscale);
    }
}
