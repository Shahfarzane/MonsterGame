package main;

import main.monsters.IMonster;

/**
 * This class represents a Player.
 */



public class Player implements IPlayer {

    private String name;
    private int power = 10;
    private final int maxHp = 200;
    private int hp = 0;
    private final int maxExp = 100;
    private int exp = 0;
    private int level = 0;
    private int coin = 0;


    public Player(String name){
        this.name = name;
        this.hp = this.maxHp;
    }


    /**
     * Players attack command.
     * @return the damage of the attack
     */

    @Override
    public int attack() {
        return this.power;
    }


    /**
     * Players damage level after battling with the monster.if a player got damage by monster it results in reducing HP of the player.
     * @param damage - amount of hp points to be reduced from hp.
     */


    @Override
    public void takeDamage(int damage) {
        if(!this.isDead()){
            this.hp -= damage;
        }
    }


    /**
     * Players experience level after fighting with monster.helps player to level up and win the game.
     * @param newExp - amount of the experience a player can get.
     */


    @Override
    public void giveExp(int newExp) {
        this.exp += newExp;
    }

    @Override

    /**
     * With this method we check if the player is alive or not
     * @return true if dead and false if the player is dead.
     */

    public boolean isDead() {
        if(this.hp<=0){
            return true;
        } else {
            return false;
        }
    }
    /**
     * gets the player name.
     * @return the current name of the player
     */
    @Override
    public String getName() {
        return this.name;
    }


    /**
     * Gets the healthpoint of the player.
     * @return the hp of the player.
     */
    @Override
    public int getHp() {
        return this.hp;
    }

    /**
     * Max hp of a player.
     */

    @Override
    public int getMaxHp() {
        return this.maxHp;
    }

    /**
     * xp of the player.
     * @return the current hp of the player
     */


    @Override
    public int getExp() {
        return this.exp;
    }
    /**
     * Max xp of a player.
     */

    @Override
    public int getMaxExp() {
        return this.maxExp;
    }

    /**
     * Players level.
     * @return the current level of the player
     */

    @Override
    public int getLevel() {
        return this.level;
    }
    /**
     * after a player finishes a level , the level increases to the next one.
     */
    @Override
    public void levelUp(){
        this.level += 1;
    }


    /**
     * after killing the monster , player gets some coin to shop.
     */


    @Override
    public int getCoin() {
        return this.coin;
    }


    /**
     * When player buys something from the shop has to give some coin.
     */

    @Override
    public void takeCoin(IMonster monster) {
        this.coin += monster.getCoin();
    }


    /**
     * Returns the current power of the player
     */

    @Override

    public int getpower() {
        return this.power;
    }


}
