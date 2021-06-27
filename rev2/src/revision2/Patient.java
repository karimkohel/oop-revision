package revision2;

import java.util.Arrays;

public final class Patient extends Person implements ITreatable{
    private Disease[] d;

    public Disease[] getD() {
        return d;
    }

    public void setD(Disease[] d) {
        this.d = d;
    }

    public Patient() {
    }

    public Patient(Disease[] d) {
        this.d = d;
    }

    public Patient(Patient org){
        super(org);
        this.setD(org.getD().clone());
    }

    @Override
    public String toString() {
        return super.toString() + "Patient{" +
                "d=" + Arrays.toString(d) +
                '}';
    }
}
