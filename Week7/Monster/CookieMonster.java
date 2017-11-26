package Week7.Monster;

/**
 * Created by lab7pc5 on 11/26/2017.
 */
public class CookieMonster extends Monster {
    double amountOfFood;
    double energy;
    CookieMonster(){

    }

    CookieMonster(double weight) {
        super(weight);
    }

    void eat(MonsterFood food){
        if(food.name.equals("cookie")){
            amountOfFood = 2 * food.servingUnit;
            weight++;
            energy = food.calculateEnergy();
        }
    }

    public String toString(){
        return "Weight: " + weight + " Energy: " + energy;
    }
}
