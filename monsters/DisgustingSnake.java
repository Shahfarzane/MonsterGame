package main.monsters;

public class DisgustingSnake extends Monster {

    /**
     * A constructor which that is implemented from Monster.
     */

    public DisgustingSnake(){
        super("Snake",5,50,25,50);
    }
    /**
     * monsters  attack method.
     */
    @Override
    public int attack() {
        System.out.println("Psssst =-- , Psssssttt =---");
        return this.getmonsterPower();
    }
}
