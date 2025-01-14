public class VerificaData {
    private int gg;
    private int mm;
    private int aaaa;
    private int gg2;
    private int mm2;
    private int aaaa2;

    public VerificaData() {
        gg = 0;
        mm = 0;
        aaaa = 0;
        gg2 = 0;
        mm2 = 0;
        aaaa2 = 0;
    }

    public VerificaData(int giorno, int mese, int anno int giorno2, int mese2, int anno2) {
        int[] giorniInMese = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean dataValida = false;
        boolean dataValida2 = false;

        if (mese >= 1 && mese <= 12 && anno >= 0) {
            switch (mese) {
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
        } else {
            dataValida = false;
        }


        if (mese2 >= 1 && mese2 <= 12 && anno2 >= 0) {
            switch (mese2) {
                case 1, 3, 5, 7, 8, 10, 12:
                    dataValida2 = giorno2 >= 1 && giorno2 <= 31;
                    break;
                case 4, 6, 9, 11:
                    dataValida2 = giorno2 >= 1 && giorno2 <= 30;
                    break;
                case 2:
                    dataValida2 = (anno2 % 4 == 0 && giorno2 >= 1 && giorno2 <= 29) || (giorno2 >= 1 && giorno2 <= 28);
                    break;
                default:
                    dataValida2 = false;
                    break;
            }
        } else {
            dataValida2 = false;
        }
        
        if (dataValida) {
            this.gg = giorno;
            this.mm = mese;
            this.aaaa = anno;
        } else {
            this.gg = -1;
            this.mm = -1;
            this.aaaa = -1;
        }
        
        if (dataValida2) {
            this.gg2 = giorno2;
            this.mm2 = mese2;
            this.aaaa2 = anno2;
        } else {
            this.gg2 = -1;
            this.mm2 = -1;
            this.aaaa2 = -1;
        }
    }

    public int getGg() {
        return this.gg;
    }

    public int getMm() {
        return this.mm;
    }

    public int getAaaa() {
        return this.aaaa;
    }

    
    public int getGg2() {
        return this.gg2;
    }

    public int getMm2() {
        return this.mm2;
    }

    public int getAaaa2() {
        return this.aaaa2;
    }

    public String verifica(int giorno, int mese, int anno, int giorno2, int mese2, int anno2) {
        boolean dataValida1 = false;
        boolean dataValida2 = false;
        String vera = "data valida";
        String falsa = "una delle date non è valida";

        // Verifica la validità della prima data
        if (mese >= 1 && mese <= 12 && anno >= 0) {
            switch (mese) {
                case 1, 3, 5, 7, 8, 10, 12:
                    dataValida1 = giorno >= 1 && giorno <= 31;
                    break;
                case 4, 6, 9, 11:
                    dataValida1 = giorno >= 1 && giorno <= 30;
                    break;
                case 2:
                    dataValida1 = (anno % 4 == 0 && giorno >= 1 && giorno <= 29) || (giorno >= 1 && giorno <= 28);
                    break;
                default:
                    dataValida1 = false;
                    break;
            }
        } else {
            dataValida1 = false;
        }

        // Verifica la validità della seconda data
        if (mese2 >= 1 && mese2 <= 12 && anno2 >= 0) {
            switch (mese2) {
                case 1, 3, 5, 7, 8, 10, 12:
                    dataValida2 = giorno2 >= 1 && giorno2 <= 31;
                    break;
                case 4, 6, 9, 11:
                    dataValida2 = giorno2 >= 1 && giorno2 <= 30;
                    break;
                case 2:
                    dataValida2 = (anno2 % 4 == 0 && giorno2 >= 1 && giorno2 <= 29) || (giorno2 >= 1 && giorno2 <= 28);
                    break;
                default:
                    dataValida2 = false;
                    break;
            }
        } else {
            dataValida2 = false;
        }

        // Se entrambe le date sono valide
        if (dataValida1 && dataValida2) {
            // Confronto tra le due date
            if (anno2 > anno || (anno2 == anno && mese2 > mese) || (anno2 == anno && mese2 == mese && giorno2 >= giorno)) {
                return "il prodotto non è ancora scaduto";
            } else {
                return "il prodotto è scaduto";
            }
        } else {
            return falsa; //una data non è valida
        }
    }
}
