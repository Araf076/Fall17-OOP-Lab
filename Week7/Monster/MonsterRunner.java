package Week7.Monster;

/**
 * Created by lab7pc5 on 11/26/2017.
 */
public class MonsterRunner {
    public static void main(String[] args) {
        MonsterFood cookieA = new MonsterFood("cookie", 2, "good");
        MonsterFood cookieB = new MonsterFood("cookie", 2, "bad");
        MonsterFood broccoli = new MonsterFood("broccoli", 1, "bad");
        MonsterFood cake = new MonsterFood("cake", 3, "good");

        CookieMonster coo = new CookieMonster(100); //weight is 100kg initially
        coo.eat(cookieA);
        coo.eat(broccoli);
        System.out.println(coo); //prints the weight and energy here

        FatMonster doggo = new FatMonster(500); //weight is 100kg initially
        doggo.eat(cookieA);
        doggo.eat(cookieB);
        doggo.eat(broccoli);
        doggo.eat(cake);
        System.out.println(doggo); //prints the weight and energy here
    }
}