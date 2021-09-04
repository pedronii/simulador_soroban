public class Soroban {
    
    public Column columns[];

    public Soroban(){

        this.columns = new Column[12];

    }

    public void setState(int value){

        int digit;

        for(int i = 0; i < 12; i++){

            digit = value % 10;

            columns[i].setValue(digit);

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

}
