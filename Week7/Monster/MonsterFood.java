package Week7.Monster;

/**
 * Created by lab7pc5 on 11/26/2017.
 */
public class MonsterFood implements Food{
    public int servingUnit;
    double energy;
    String taste;
    String name;

    public MonsterFood(String name, int servingUnit, String taste) {
        this.name = name;
        this.servingUnit = servingUnit;
        this.taste = taste;
    }

    @Override
    public double calculateEnergy() {
        energy = servingUnit * 10;
        return energy;
    }

    @Override
    public boolean isTasty() {
        if(taste.equals("good")){
            return true;
        }
        else
            return false;
    }
}
