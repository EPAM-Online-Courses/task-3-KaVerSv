//package efs.task.oop;

public class Main {
    public static void main(String[] args) {


        Villager[] villagers= {
            new Villager("Kashya", 30),
            new Villager("Akara", 40,SHELTER),
            new Villager("Gheed", 50),
            new Villager("Deckard Cain", 85,IDENTIFY),
            new Villager("Warriv", 35),
            new Villager("Flawia", 25)
        };

        for (Villager villager : villagers) {
            villager.sayHello();
        }
    }
}