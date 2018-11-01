package samples.objects;

/**
 * Created by dougylee on 1/11/18.
 */
public class Objects {

    public static void main(String[] args) {

        Dog dog = new Dog();  // Create new dog object
        String dogSound = dog.getSound();  // Use object functions
        System.out.println("Dog goes " + dogSound);
        System.out.printf("Dog has %d legs\n", dog.getLegCount());


        Chicken chicken = new Chicken();  // Create new chicken object
        String chickenSound = chicken.getSound();  // Use object functions
        System.out.println("Chicken goes " + chickenSound);
        System.out.printf("Chicken has %d legs\n", chicken.getLegCount());

    }

}
