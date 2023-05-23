package efs.task.oop;

public class Main {
    public static void main(String[] args) {


        Villager[] villagers= {
            new Villager("Kashya", 30),
            new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER),
            new Villager("Gheed", 50),
            new ExtraordinaryVillager("Deckard Cain", 85,ExtraordinaryVillager.Skill.IDENTIFY),
            new Villager("Warriv", 35),
            new Villager("Flawia", 25)
        };

        for (Villager villager : villagers) {
            villager.sayHello();
        }

        Object objectDeckardCain = villagers[1];
        Object objectAkara = villagers[3];

        while (Monsters.getMonstersHealth() > 0) {
            if (Monsters.andariel.getHealth() > 0) {
                fight(villagers[0], Monsters.andariel);
                fight(villagers[2], Monsters.andariel);
                fight(villagers[4], Monsters.andariel);
                fight(villagers[5], Monsters.andariel);
            }
            if (Monsters.blacksmith.getHealth() > 0) {
                fight(villagers[0], Monsters.andariel);
                fight(villagers[2], Monsters.andariel);
                fight(villagers[4], Monsters.andariel);
                fight(villagers[5], Monsters.andariel);
            }
        }

        System.out.println("Obozowisko ocalone!");
        villagers[3] = (ExtraordinaryVillager)objectDeckardCain;
        villagers[1] = (ExtraordinaryVillager)objectAkara;
    }

    public static void fight(Villager villager, Monster monster) {
        System.out.println("Potwory posiadaja jeszcze " + Monsters.getMonstersHealth() + " punkty zycia");
        System.out.println("Aktualnie walczacy osadnik to " + villager.name);
        villager.attack(monster);
        monster.attack(villager);
    }
}