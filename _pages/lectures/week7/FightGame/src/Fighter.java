import java.util.Random;

public class Fighter {
   private int hp;
   private String name;
   private String[] attacks;
   private double attackProb;
   private Random randomGenerator;

   
   public Fighter() {
        this.randomGenerator = new Random();
        this.hp = 100;
        this.name = "NewPlayer";
        this.attacks = new String[3];
   }

   public Fighter(int hp, String name, String[] attacks) {
        this.randomGenerator = new Random();
        this.hp = hp;
        this.name = name;
        this.attacks = attacks;
        this.attackProb = 0.7;
   }

   public void simpleAttack(Fighter other) {
        double attackVal = randomGenerator.nextDouble();
        System.out.println(attackVal);
        if (attackVal < this.attackProb) {
            other.hp--;
        }
   }

   public void chooseAttack(Fighter other, String choice) {
        for (String attack : this.attacks) {
            if (attack.equals(choice)) {
                other.hp--;
            } 
        }
   }

   public int getHP() {
        return this.hp;
   }

   public String getName() {
        return this.name;
   }

   public void setHP(int hp) {
        this.hp = hp;
   }

}
