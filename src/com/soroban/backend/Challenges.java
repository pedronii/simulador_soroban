import java.util.concurrent.ThreadLocalRandom;

public class Challenges {

    public Soroban soroban;

    private int correctValue;

    public Challenges(){

        soroban = new Soroban();

    }
    
    public void readNumber(){

        //tem q trocar por uma função q gere um numero aleatorio
        this.correctValue = 42;

        soroban.setState(correctValue);

    }

    public void writeNumber(){

        this.correctState

    }

    public int checkReadAnswer(int answer){

        if(answer == correctValue) return 1;

        return 0;

    }

}
