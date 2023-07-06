package org.skm;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintStream;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        RescueDamselQuest rescueDamselQuest=new RescueDamselQuest();
        SlayDragonQuest slayDragonQuest=new SlayDragonQuest(new PrintStream(System.out));
        BraveKnight knight=new BraveKnight(rescueDamselQuest);
        BraveKnight knight2=new BraveKnight(slayDragonQuest);
        knight.embarkOnQuest();
        knight2.embarkOnQuest();
    }
}