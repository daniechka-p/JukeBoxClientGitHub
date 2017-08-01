package basePack;

import javax.swing.*;

public class TestBeatBoxFinal {

    public static void main (String[] args) {
        if (args.length == 1) {
            new BeatBoxFinal().startUp(args[0]);
        } else if (args.length == 0) {
            new BeatBoxFinal().startUp(askName());
        } else {
            System.out.println("Something wrong. There are must be 0 or 1 (username) argument.");
        }
    }

    private static String askName() {
        return JOptionPane.showInputDialog(null, "Enter your name", "Hello! Let's party!", JOptionPane.QUESTION_MESSAGE);
    }
}
