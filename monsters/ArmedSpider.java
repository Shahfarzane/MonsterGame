package main.monsters;



public class ArmedSpider extends Monster {
    /**
     * A constructor which that is implemented from Monster.
     */

    public ArmedSpider(){
        super("Armed Spider",10,20,20,25);
    }

    @Override
    /**
     * monsters  attack method.
     */
    public int attack() {
        System.out.println("** SPIDER ** More Spider **");
        return this.getmonsterPower();
    }
}
