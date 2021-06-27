package revision;

public class Engine {

    private int CC;
    private int hp;

    public float calcTorq(Engine engine){
        return (this.CC * this.hp) * (5/3);
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //arg constructor
    public Engine(int CC, int hp) {
        this.CC = CC;
        this.hp = hp;
    }
    
    //copy constructor
    public Engine(Engine e){
        this.CC=e.CC;
        this.hp=e.hp;
    }

    @Override
    public String toString() {
        return super.toString() + "Engine{" +
                "CC=" + CC +
                ", hp=" + hp +
                '}';
    }
}
