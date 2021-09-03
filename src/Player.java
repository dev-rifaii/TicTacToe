public class Player {

    private int id;
    private int inputs = 0;
    private char sign;

    public Player(int id, char sign) {
        this.id = id;
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public int getId() {
        return id;
    }

    public int getInputs() {
        return inputs;
    }

    public void setInputs(int x) {
        this.inputs = inputs;
    }
}
