package main;

import main.monsters.IMonster;
/**
 * All the attributes and methods a player has.
 * @author MohammadFarzane
 */

public interface IPlayer {

    /**
     * Players attack command
     */

    public int attack();

    /**
     * Players damage level after battling with the monster.if a player got damage by monster it results in reducing HP of the player.
     */

    public void takeDamage(int damage);

    /**
     * Players experience level after fighting with monster.helps player to level up and win the game.
     * @param newExp - amount of the experince a player can get.
     */

    public void giveExp(int newExp);

    /**
     * With this method we check if the player is alive or not
     * @return true if dead and false if the player is dead.
     */
    public boolean isDead();
    /**
     * gets the player name.
     * @return the current name of the player
     */

    public String getName();

    /**
     * Gets the healthpoint of the player.
     * @return the hp of the player.
     */
    public int getHp();
    /**
     * Max hp of a player.
     */

    public int getMaxHp();

    /**
     * xp of the player.
     * @return the current hp of the player
     */


    public int getExp();

    /**
     * Max experinece  of a player.
     */

    public int getMaxExp();

    /**
     * Players level.
     * @return the current level of the player
     */

    public int getLevel();

    /**
     * after a player finishes a level , the level increases to the next one.
     */
    public void levelUp();


    public int getCoin();

    /**
     * after killing the monster , player gets some coin to shop.
     */

    public void takeCoin(IMonster monster);

    /**
     * Returns the power of the player.
     * @return power
     */
    public int getpower();



}
