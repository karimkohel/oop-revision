package revision2;

public class Main {

    public static void main(String[] args) {
	    Integer[] a1 = {0,1,2,3,4,5,6,7,8,9};
	    Float[] a2 = {0F,1F,2F,3F,4F,5F,6F,7F,8F,9.8F};

	    GenericClass<Integer> gen1 = new GenericClass<Integer>(a1);
	    GenericClass<Float> gen2 = new GenericClass<Float>(a2);
    }
}
