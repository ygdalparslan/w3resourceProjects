package JavaEncapsulationExercises.p01;

public class Runner {


    public static void main(String[] args) {

        Person person =new Person();

        person.setName("Alper");
        person.setAge(25);
        person.setCountry("Türkiye");

        String name =person.getName();
        int age = person.getAge();
        String country =person.getCountry();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+country);


    }
}
