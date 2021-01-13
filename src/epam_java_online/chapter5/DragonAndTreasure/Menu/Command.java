package epam_java_online.chapter5.DragonAndTreasure.Menu;

import epam_java_online.chapter5.DragonAndTreasure.Jewel.JewelStorage;

public interface Command {

    public void execute(JewelStorage jewelStorage);
}
