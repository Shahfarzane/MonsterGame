package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.monsters.ArmedSpider;
import main.monsters.DisgustingSnake;
import main.monsters.IMonster;

/**
 * the whole game happens here !
 * @author MohammadFarzane
 */

public class Game {

    private boolean lostGame;
    private boolean wonGame;
    private Scanner scanner;
    private IPlayer player;

    /**
     * This method creates a new Game by calling startGame() method.
     */

    public Game() {
        scanner= new Scanner(System.in);
    }

    /**
     * This method shows the game name and asks for players name.
     * Also shows different options for the game.
     */

    public void startGame() {
        System.out.println("***********************************************");
        System.out.println("* |         Welcome to Angry Cats           | *");
        System.out.println("***********************************************");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        this.player = new Player(name);

        System.out.println();

        int input = -1;
        while (!wonGame && !lostGame) {
            printMainMenu();
            System.out.print("> ");
            input = scanner.nextInt();
            scanner.nextLine();
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong choice ! You can only choose between alternative 1 till 4 !!! " );
            }
            scanner.nextLine();
            switch(input) {
                case 1:
                    goAdventure();
                    break;
                case 2:
                    goCharacter();
                    break;
                case 3:
                    System.out.println("Later tho'");
                    break;
                case 4:
                    System.out.println("Bye!");
                    lostGame = true;
                    break;
            }
        }

        if (wonGame) {
            System.out.println("Congratulations! You won The Game!");
        }

    }

    /**
     * Prints all menu options
     */
    private void printMainMenu() {
        System.out.println("1. Go to the game");
        System.out.println("2. Show details about your character");
        System.out.println("3. Go to the pet shop");
        System.out.println("4. Exit game");
    }


    private void goAdventure() {

        if(!RandomHelper.getBigChance()) {
            System.out.println (" All safe go back n take a nap ! " );
        }


        if(RandomHelper.get50Chance()) {

            System.out.println ("Look around ! a spider is coming for u !!!" );
            battle(new ArmedSpider());

        }
        else {
            System.out.println("Uggh Some dangerous snake !!! watchout" );
            battle(new DisgustingSnake());
        }



    }


    private void battle(IMonster monster) {


        while(!player.isDead() && !monster.isDead()){

            monster.takeDamage(player.attack());
            System.out.println(player.getName()+",  is fighting back "+monster.getName()+"!");

            if(monster.isDead()){

                player.giveExp(monster.getExp());
                System.out.println(player.getName()+", killed "+monster.getName()+", and won "+monster.getExp()+" exp and "+monster.getCoin()+" coins.");
                player.levelUp();
                player.takeCoin(monster);
                System.out.println(player.getName()+", is on level : "+player.getLevel()+", you have "+player.getExp()+" exp, "+player.getHp()+" hp and "+player.getCoin()+" coins.");
                System.out.println();

                if(player.getLevel()==10){
                    System.out.print(player.getName()+"Wow ! You finished the game !");
                    this.wonGame = true;
                    this.lostGame = false;
                }

            } else {

                System.out.println(monster.getName()+", is attacking "+ player.getName());
                player.takeDamage(monster.attack());

                if(player.isDead()){

                    System.out.println(player.getName()+" killed by "+monster.getName()+"!");
                    this.wonGame = false;
                    this.lostGame = true;

                } else {

                    System.out.println(player.getName()+": "+player.getHp()+" hp");
                    System.out.println(monster.getName()+": "+monster.getHp()+" hp");

                    this.pause();

                }

            }
        }
    }


    private void goCharacter() {
        System.out.println("***************");
        System.out.println("* Name: "+player.getName());
        System.out.println("* Level: "+player.getLevel());
        System.out.println("* HP: "+player.getHp()+"/"+player.getMaxHp());
        System.out.println("* Exp: "+player.getExp()+"/"+player.getMaxExp());
        System.out.println("* Coins: "+player.getCoin());
        System.out.println("* Powerbar: "+player.getpower());
        System.out.println("***************");
        this.pause();
    }


    private void pause() {
        System.out.println("[ Press enter to continue. ]");
        String input = scanner.nextLine();
    }

}
