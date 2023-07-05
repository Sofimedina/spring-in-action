package org.skm;

public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest rescuingQuest;

    public DamselRescuingKnight(){
        this.rescuingQuest=new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        this.rescuingQuest.embark();
    }
}
