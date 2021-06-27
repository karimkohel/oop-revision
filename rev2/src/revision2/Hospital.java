package revision2;

import java.util.*;

public class Hospital {
    protected Patient[] patients= new Patient[100];
    public static final int MAXNum = 100;

    public Hospital() {
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "patients=" + Arrays.toString(patients) +
                '}';
    }
}
