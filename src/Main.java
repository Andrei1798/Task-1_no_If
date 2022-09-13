import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList();

        list.add("abcd");
        list.add(new Person("Name", "Lastname", "Gender", 4));
        list.add(1);
        list.add("efgh");
        list.add(124.123);
        list.add('i');
        list.add(new Person());
        list.add("jklmnop");
        list.add("qrstiuvwxyz");

        Person.concatenateValues(list);
    }
}