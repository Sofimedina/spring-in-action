package org.skm;

public class Main {
    public static void main(String[] args) {
        RescueDamselQuest rescueDamselQuest=new RescueDamselQuest();
        SlayDragonQuest slayDragonQuest=new SlayDragonQuest();
        BraveKnight knight=new BraveKnight(rescueDamselQuest);
        BraveKnight knight2=new BraveKnight(slayDragonQuest);
        knight.embarkOnQuest();
        knight2.embarkOnQuest();
    }
}