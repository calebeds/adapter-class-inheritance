import adapters.ClassAdapter;
import adapters.ObjectAdapter;
import integer.values.IntegerValue;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Class and Object Adapter Demo ***");

        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("Class Adapter is returning: " + classAdapter.getInteger());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning: " + classAdapter.getInteger());
    }
}
