package com.voidfall.continuance;

/**
 * Represents a command.
 * 
 * @author Håkon "Haklerz" Lervik
 */
public enum Command {
    GO("go"),
    QUIT("quit"),
    UNKNOWN("");
    
    private final String commandString;
    
    /**
     * 
     * @param commandString
     */
    private Command(String commandString) {
        this.commandString = commandString;
    }
    /**
     * 
     * @return
     */
    private String getCommandString() {
        return this.commandString;
    }

    /**
     * 
     * @param string
     * @return
     */
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
