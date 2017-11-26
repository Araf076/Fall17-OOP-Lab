package Week2.Online.Monster;

/**
 * Created by abdullah on 10/17/17.
 */
public class MonsterDriver {
    public static void main(String[] args) {

        Monster Monster1 = new Monster("cookieMonster", 4,
                2, false, false, "cookie");
        Monster Monster2 = new Monster("cerealKiller", 8,
                4, false, true, "cereal");

        Monster1.display();
        Monster2.display();

        System.out.println("");
        System.out.println("FIGHT!!!!!");
        Monster1.loseAnEye();
        Monster2.loseALimb();

        System.out.println("");
        Monster1.display();
        Monster2.display();
    }
}
