/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidfall.continuance;

/**
 *
 * @author Hakerz
 */
public enum Command {
    GO("go"),
    QUIT("quit"),
    UNKNOWN("");
    
    private final String commandString;
    
    private Command(String commandString) {
        this.commandString = commandString;
    }
    
    private String getCommandString() {
        return this.commandString;
    }

    public static Command parseCommand(String string) {
        Command command = UNKNOWN;
        for (Command tryCommand : Command.values()) {
            if (tryCommand.getCommandString().equalsIgnoreCase(string)) {
                command = tryCommand;
            }
        }
        return command;
    }
}
