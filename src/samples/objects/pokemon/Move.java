package samples.objects.pokemon;

public class Move {
    String name;
    int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Move(String name, int damage) {

        this.name = name;
        this.damage = damage;
    }
}
