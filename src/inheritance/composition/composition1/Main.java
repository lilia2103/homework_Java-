package inheritance.composition.composition1;

public class Main {
    public static void main(String[] args) {
        Heart heart = new Heart();
        Human human = new Human(heart);
        human.getHeart().pounding();

    }
}
