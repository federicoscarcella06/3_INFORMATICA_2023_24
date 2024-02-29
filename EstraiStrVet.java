import java.util.*;
public class Esstrar{
    public static void main(String[]args){
        String par ="ciao", parcomp="";
        int a,n;
        char e;
        n = par.length();
        
        for(int i=0;i<n;i++){
            
            e = par.charAt(i);
            
            if(e !='a'||e !='e'||e !='i'||e !='o'||e !='u'){
                parcomp += e;    
            }
        }
        System.out.println(parcomp);
    }
}
