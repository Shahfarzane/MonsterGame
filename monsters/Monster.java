package main.monsters;


public abstract class Monster implements IMonster {

    private String name;
    private int monsterPower;
    private int hp;
    private int exp;
    private int coin;



    /**
     * A constructor with following parameters
     * @param name
     * @param hp
     * @param exp
     * @param coin
     * @param monsterPower
     */

    public Monster(String name, int monsterPower, int hp, int exp, int coin){
        this.name = name;
        this.monsterPower = monsterPower;
        this.hp = hp;
        this.exp = exp;
        this.coin = coin;
    }

    /**
     * Games  attack method.
     * @return damage made
     */
    @Override
    public abstract int attack();
    /**
     * Tells the monster to take damage.
     * This reduces the monster's HP, and may result in it dying
     * @param damage - amount of hp points to subtract from hp
     */

    @Override
    public void takeDamage(int damage) {
        if(!this.isDead()){
            this.hp -= damage;
        }
    }
    /**
     * Checks if this monster is dead or not.
     * @return true if dead, false if alive
     */

    @Override
    public boolean isDead() {
        if(this.hp<=0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the name of the monster
     */

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Returns the current HP of the monster
     */

    @Override
    public int getHp() {
        return this.hp;
    }
    /**
     * Returns the amount of EXP points that the player should gain
     * when s/he kills this monster
     */

    @Override
    public int getExp() {
        return this.exp;
    }



    /**
     * Returns the amount of coin points that the player should gain
     * when s/he kills this monster
     */

    @Override
    public int getCoin(){
        return this.coin;
    }
    public int getmonsterPower(){
        return this.monsterPower;
    }

}
