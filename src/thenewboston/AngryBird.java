package thenewboston;

public class AngryBird {
    String name;
    int hp;

    public void setName(String givenName){
        name = givenName;
    }

    public void setHp(int givenHp) {
        hp = givenHp;
    }

    public void getHit(int damage) {
        hp = hp - damage;
        if (hp <=0 ) {
            die();
        }
    }

    public void fire() {
        System.out.println(name + ": pew");
    }

    public void die() {
        System.out.println(name + ": I ded");
    }

}
