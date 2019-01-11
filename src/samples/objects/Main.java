package samples.objects;

public class Main {

    public static void main(String[] args) {
        Character johnny = new Character("Johnny", 43, "Superhero");
        johnny.name = "Johnny";
        johnny.age = 54;
        johnny.occupation = "Podiatrist";

        System.out.println(johnny.age);
        johnny.sayHello();
        johnny.introduceSelf();

        Character peter = new Character("Peter", 23, "Student");
        peter.introduceSelf();
    }

}
