package revision2;

public class Disease {
    String name;
    int type;
    String symptoms;
    public static final int VIRUS = 1;
    public static final int MICROBE = 2;

    public Disease() {
    }

    @Override
    public String toString() {
        return "Disease{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", symptoms='" + symptoms + '\'' +
                '}';
    }
}
