public class Game {

    public static void main(String[] args) {
        String[] attacks = {"kick", "roundhouse kick"};
        Fighter p1 = new Fighter(150, "Prof Ackles", attacks);
        Fighter p2 = new Fighter(300, "Polar Bear", attacks);
        System.out.println(p1.getName() + " hp = " + p1.getHP());
        System.out.println(p2.getName() + " hp = " + p2.getHP());
        System.out.println("Fight!");
        int numRounds = 20;
        for (int i = 0; i < numRounds; i++) {
            p2.simpleAttack(p1);
        }
        System.out.println(p1.getName() + " hp = " + p1.getHP());
        System.out.println(p2.getName() + " hp = " + p2.getHP());
    }
    
}
