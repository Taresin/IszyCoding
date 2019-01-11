package samples.objects.pokemon;

public class Pokemon {
    String name;
    Move move;
    int hp;

    public Pokemon() {
    }

    public Pokemon(String name, Move move, int hp) {
        this.name = name;
        this.move = move;
        this.hp = hp;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
