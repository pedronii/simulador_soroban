public class Column {
    
    // Assume valores entre 0 e 4
    public int ichidan;
    // Assume valores 0 ou 1
    private int godan;

    public void setValue(int value) {

        if(value < 5){

            this.godan = 0;
            this.ichidan = value;

        } else{

            this.godan = 1;
            this.ichidan = value - 5;

        }

    }

    public int getGodan() {
        return godan;
    }

    public int getIchidan() {
        return ichidan;
    }

    public int getValue(){
        return godan + ichidan;
    }

}
