import java.util.ArrayList;

public class Person {
    private String name;
    private String lastName;
    private String gender;
    private int age;

    public Person(){

    }
    public Person(String name, String lastName, String gender, int age) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private static boolean isChar(Object obj){
        String clas = String.valueOf(obj.getClass());
        if(clas.endsWith("Character")){
            return true;
        }else return false;
    }
    private static boolean isInteger(Object obj){
        String clas = String.valueOf(obj.getClass());
        if(clas.endsWith("Integer")){
            return true;
        }else return false;
    }
    private static boolean isPerson(Object obj){
        String clas = String.valueOf(obj.getClass());
        if(clas.endsWith("Person")){
            return true;
        }else return false;
    }
    private static boolean isDouble(Object obj){
        String clas = String.valueOf(obj.getClass());
        if(clas.endsWith("Double")){
            return true;
        }else return false;
    }
    private static boolean isString(Object obj){
        String clas = String.valueOf(obj.getClass());
        if(clas.endsWith("String")){
            return true;
        }else return false;
    }
    @Override
    public String toString() {
        return "Name: " + name  + ", lastname: " + lastName + ", gender: " + gender + " age: " + age;
    }

    public static void concatenateValues(ArrayList<Object> list){
        ArrayList<Person> personList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        double sum = 0;
        for (Object obj : list) {
            String s = String.valueOf(TypeOf.typeOf(obj));
            switch (s){
                case "CHARACTER", "STRING" -> sb.append(obj);
                case "DOUBLE" -> {
                    Double val = (Double) obj;
                    sum = sum + val;
                }
                case "INTEGER" -> {
                    int val = (Integer) obj;
                    sum = sum + val;
                }
                case "PERSON" -> {
                    Person personToAdd = (Person) obj;
                    personList.add(personToAdd);
                }
            }
        }

        personList.forEach(person -> System.out.println(person.toString()));
        System.out.println("Suma numerelor: " + sum);
        System.out.println("String-urile concatenate: " + sb);
    }
}
