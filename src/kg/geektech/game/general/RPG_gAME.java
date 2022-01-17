package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_gAME {
    private static int roundNum;
    public static Random random = new Random();

    public static void start() {
        Boss boss = new Boss(2999, 50);
        Warrior warrior = new Warrior(270, 15, "Totsuya", 5);
        Magic magic = new Magic(130, 20, "Sage");
        Medic assistent = new Medic(110, 5, 5, "Sakura");
        Medic doc = new Medic(110, 5, 5, "Tsunade");
        Berserk berserk = new Berserk(300, 15, "Guts");
        Thor thor = new Thor(150,18,"Asgard");
        Golem golem = new Golem(320,10,"Groot", 10);
        Witcher witcher = new Witcher(190, 0, "Herald");
        Hero[] heroes = {warrior, magic, assistent, doc, berserk, thor, golem, witcher};

        printStatistics(heroes,boss);
        while (!isGameFinished(heroes, boss)) {
            round(heroes, boss);
        }

    }
    private static void round(Hero[] heroes, Boss boss){
        roundNum++;
        bossHit(heroes, boss);
        heroesHit(heroes, boss);
        applySuperPowers(heroes, boss);
        printStatistics(heroes,boss);
        boss.setDamage(50);
    }

    private static void printStatistics(Hero[] heroes, Boss boss) {
        System.out.println();
        System.out.println("Round " + roundNum);
        System.out.println();
        System.out.println("Boss health: " + boss.getHealth() + " Damage: [" + boss.getDamage() + "]");

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getNames() + " health: " + heroes[i].getHealth() + " Damage: [" + heroes[i].getDamage() + "]");

        }
    }

    private static void bossHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
            }
        }
    }

    private static void heroesHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - boss.getDamage());
            }
        }
    }

    private static void applySuperPowers(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                heroes[i].applySuperPower(heroes, boss);
            }
        }
    }
//                                                                         Пак !полтарашка
    private static boolean isGameFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won");
            return true;
        }
        boolean allHeroesHealth = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                allHeroesHealth = false;
                break;
            }
        }
        if (allHeroesHealth){
            System.out.println("Boss won!!!");
        } return allHeroesHealth;


    }
}