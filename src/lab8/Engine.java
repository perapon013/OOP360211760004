package lab8;
//1. engine size
//2. horse power
public class Engine {
    private int engSize;
    private int horsepowre;

    //constructer
    public Engine(){}

    public Engine(int engSize, int horsepowre) {
        this.engSize = engSize;
        this.horsepowre = horsepowre;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engSize=" + engSize +
                ", horsepowre=" + horsepowre +
                '}';
    }

    public int getEngSize() {
        return engSize;
    }

    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }

    public int getHorsepowre() {
        return horsepowre;
    }

    public void setHorsepowre(int horsepowre) {
        this.horsepowre = horsepowre;
    }
}
