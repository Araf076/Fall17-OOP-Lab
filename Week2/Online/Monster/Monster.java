package Week2.Online.Monster;

/**
 * Created by abdullah on 10/17/17.
 */
public class Monster {
    String monsterName;
    int monsterLegs;
    int monsterEyes;
    boolean monsterFly;
    boolean monsterSwim;
    String favouriteFood;

    public Monster(String monsterName, int monsterLegs, int monsterEyes,
                   boolean monsterFly, boolean monsterSwim, String favouriteFood) {
        this.monsterName = monsterName;
        this.monsterLegs = monsterLegs;
        this.monsterEyes = monsterEyes;
        this.monsterFly = monsterFly;
        this.monsterSwim = monsterSwim;
        this.favouriteFood = favouriteFood;
    }

    public int loseALimb() {
        if(this.monsterLegs != 0) {
            this.monsterLegs--;
        }
        return this.monsterLegs;
    }

    public int loseAnEye() {
        if(this.monsterEyes != 0) {
            this.monsterEyes--;
        }
        return this.monsterEyes;
    }

    public void display() {
        System.out.println(this.monsterName + " has " + this.monsterLegs + " limbs and "
                + this.monsterEyes + " eyes.");
    }
}