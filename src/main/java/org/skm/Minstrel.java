package org.skm;

import java.io.PrintStream;

public class Minstrel {
    PrintStream stream;
    Minstrel(PrintStream stream){
        this.stream=stream;
    }
    public void singBeforeQuest(){
        stream.println("Here it start the of the brave young knight...");
    }
    public void singAfterQuest(){
        stream.println("...and things will never be the same");
    }
}
