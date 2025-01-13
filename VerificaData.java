



public class VerificaData{
    private int gg;
    private int mm;
    private int aaaa;
    
    public VerificaData(){
        gg = 0;
        mm = 0;
        aaaa = 0;
    
    } 
    
    public VerificaData(int giorno, int mese, int anno){
        int[] giorniInMese = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean dataValida = false;
        
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
        if(dataValida){
            this.gg = giorno;
            this.mm = mese;
            this.aaaa = anno;
        }else{
            this.gg = -1;
            this.mm = -1;
            this.aaaa = -1;    
        }
    }
    public int getGg(){
        return this.gg;
    }
    public int getMm(){
        return this.mm;
    }    
    public int getAaaa(){
        return this.aaaa;
    }    
}
