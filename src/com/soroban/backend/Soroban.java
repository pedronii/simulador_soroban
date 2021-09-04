public class Soroban {
    
    public Column columns[];

    public Soroban(){

        this.columns = new Column[12];

    }

    public void setState(int value){

        for(int i = 0; i < 12; i++){

            columns[i].setValue(value % 10);

            value /= 10;

        }

    }

    public int getState(){

        int value = 0;

        for(int i = 0; i < 12; i++){

            value += columns[i].getValue() * Math.pow(10, i);

        }

        return value;

    }

    public void printState(){

        int godan[] = new int[12];
        int ichidan[] = new int[12];


        //Le todos os Ichidans e Godans
        for(int i = 0; i < 12; i++){

            godan[i] = columns[i].getGodan();
            ichidan[i] = columns[i].getIchidan();

        }

        //Imprime os Godans
        for(int i = 0; i < 12; i++){

            if(godan[i] == 0) System.out.println("[X]");
            else System.out.println("[ ]");

        }

        System.out.println("\n");

        for(int i = 0; i < 12; i++){

            if(godan[i] == 1) System.out.println("[X]");
            else System.out.println("[ ]");

        }

        //Imprime a linha separatoria
        System.out.println("\n");

        for(int i = 0; i < 12; i++){

            System.out.println("---");

        }
        
        //Imprime os Ichidans
        System.out.println("\n");

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 0) System.out.println("[ ]");
            else System.out.println("[X]");

        }

        System.out.println("\n");

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 1) System.out.println("[ ]");
            else System.out.println("[X]");

        }

        System.out.println();

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 2) System.out.println("[ ]");
            else System.out.println("[X]");

        }

        System.out.println();

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 3) System.out.println("[ ]");
            else System.out.println("[X]");

        }

        System.out.println();

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 4) System.out.println("[ ]");
            else System.out.println("[X]");

        }

        System.out.println();

    }

    public static void main(String[] args) {

        Soroban soroban = new Soroban();
    
        soroban.setState(52);

        soroban.printState();
        
    }

}

