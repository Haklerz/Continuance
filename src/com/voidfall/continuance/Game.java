package com.voidfall.continuance;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hakerz
 */
public class Game {
    private boolean running;
    private final Scanner input;
    private HashMap<String, String> text;

    /**
     *
     */
    public Game() {
        this.input = new Scanner(System.in);
        this.text = new HashMap<>();
        fillText();
    }

    /**
     *
     */
    public void run() {
        setRunning(true);
        while (isRunning()) {
            print("CURSOR");
            Instruction instruction = Instruction.parseInstruction(input.nextLine());
            executeInstruction(instruction);
        }
        input.close();
    }
    
    /**
     *
     */
    private void executeInstruction(Instruction instruction) {
        switch (instruction.getCommand()) {
            case GO:
                break;

            case QUIT:
                setRunning(false);
                print("QUITMSG");
                break;
            
            case UNKNOWN:
                print("UNKNOWNCMD");
                break;
        }
    }

    /**
     *
     */
    private void setRunning(boolean running) {
        this.running = running;
    }
    
    /**
     *
     */
    private boolean isRunning() {
        return this.running;
    }
    
    /**
     *
     */
    private void fillText() {
        this.text.put("CURSOR", "> ");
        this.text.put("UNKNOWN_CMD", "Unrecognized command\n");
        this.text.put("QUIT_MSG", "Goodbye!\n");
    }

    /**
     *
     */
    private void print(String info) {
        System.out.print(text.get(info));
    }
}
