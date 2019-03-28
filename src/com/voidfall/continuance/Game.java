/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidfall.continuance;

import java.util.Scanner;

/**
 *
 * @author Hakerz
 */
public class Game {

    private boolean running;
    private Scanner input;

    public Game() {
        this.input = new Scanner(System.in);
    }

    public void run() {
        setRunning(true);
        while (isRunning()) {
            print("cursor");
            Instruction instruction = Instruction.parseInstruction(input.nextLine());
            executeInstruction(instruction);
        }
        input.close();
    }

    private void setRunning(boolean running) {
        this.running = running;
    }
    
    private boolean isRunning() {
        return this.running;
    }

    private void print(String info) {
        switch (info) {
            case "cursor":
                System.out.print("> ");
                break;
            
            case "unknown command":
                System.out.println("I don't know what you mean.");
                break;
        }
    }

    private void executeInstruction(Instruction instruction) {
        switch (instruction.getCommand()) {
            case QUIT:
                setRunning(false);
                break;
            
            case UNKNOWN:
                print("unknown command");
                break;
        }
    }
}
