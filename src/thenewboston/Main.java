package thenewboston;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start program");
        AngryBird bird1 = new AngryBird();
        AngryBird bird2 = new AngryBird();
        bird1.fire();
        bird2.die();
        bird1.setName("Johnny");
        bird2.setName("Alfred");
        bird1.setHp(5);
        bird1.getHit(7);
    }
}
