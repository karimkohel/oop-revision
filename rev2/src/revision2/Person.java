package revision2;

public abstract class Person {
    private String name;
    private int cellNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCellNo() {
        return cellNo;
    }

    public void setCellNo(int cellNo) {
        this.cellNo = cellNo;
    }

    public Person() {
    }

    public Person(String name, int cellNo) {
        this.name = name;
        this.cellNo = cellNo;
    }

    public Person(Person org){
        this.setName(org.getName());
        this.setCellNo(org.getCellNo());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cellNo=" + cellNo +
                '}';
    }
}
