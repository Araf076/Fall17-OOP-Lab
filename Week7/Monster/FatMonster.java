package Week7.Monster;

/**
 * Created by lab7pc5 on 11/26/2017.
 */
public class FatMonster extends Monster  {
    double amountOfFood;
    double energy;
    FatMonster() {
    }

    FatMonster(double weight) {
        super(weight);
    }

    void eat(MonsterFood food){
        if(food.taste.equals("good")){
            amountOfFood = 2 * food.servingUnit;
            weight++;
            energy = food.calculateEnergy();
        }
    }

    public String toString(){
        return "Weight: " + weight + " Energy: " + energy;
    }
}
