public class Column {
    
    // Assume valores entre 0 e 4
    private int Ichidan;
    // Assume valores 0 ou 1
    private int Godan;

    public void setValue(int value) {

        if(value < 5){

            this.Godan = 0;
            this.Ichidan = value;

        } else{

            this.Godan = 1;
            this.Ichidan = value - 5;

        }

    }

    public int getGodan() {
        return Godan;
    }

    public int getIchidan() {
        return Ichidan;
    }

    public int getValue(){
        return Godan + Ichidan;
    }

}
