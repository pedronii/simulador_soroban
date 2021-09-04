package com.soroban.backend;

public class Soroban {
    
    public Column[] columns;

    public Soroban(){

        this.columns = new Column[12];

    }

    public void setState(int value){

        for(int i = 0; i < 12; i++){

            columns[i] = new Column();

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

    public String printState(){
    	StringBuilder state = new StringBuilder();
        int godan[] = new int[12];
        int ichidan[] = new int[12];


        //Le todos os Ichidans e Godans
        for(int i = 0; i < 12; i++){

            godan[i] = columns[i].getGodan();
            ichidan[i] = columns[i].getIchidan();

        }

        //Imprime os Godans
        for(int i = 0; i < 12; i++){

            if(godan[i] == 0) state.append("|X");
            else state.append("| ");

        }

        state.append("|\n");

        for(int i = 0; i < 12; i++){

            if(godan[i] == 1) state.append("|X");
            else state.append("| ");

        }

        //Imprime a linha separatoria
        state.append("|\n");


        state.append("-------------------------\n");
        
        //Imprime os Ichidans
        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 0) state.append("| ");
            else state.append("|X");

        }

        state.append("|\n");

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 1) state.append("| ");
            else state.append("|X");

        }

        System.out.print("|\n");

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 2) state.append("| ");
            else state.append("|X");

        }

        state.append("|\n");

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 3) state.append("| ");
            else state.append("|X");

        }

        state.append("|\n");

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 4) state.append("| ");
            else state.append("|X");

        }

        state.append("|\n");

        return state.toString();
    }
    
}

