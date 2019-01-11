package samples.objects;

public class Character {
    String name;
    int age;
    String occupation;

    public Character(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void sayHello() {
        System.out.println("Bonjour!");
    }

    public void introduceSelf() {
        System.out.printf("I am %d years old\nI work as a %s", age, occupation);
    }
}
