package com.voidfall.continuance;

/**
 * Represents an instruction
 * 
 * @author Håkon "Haklerz" Lervik
 */
public class Instruction {
    private Command command;
    private String argument;
    
    /**
     * 
     * @param command
     * @param argument
     */
    public Instruction(Command command, String argument) {
        setCommand(command);
        setArgument(argument);
    }

    /**
     * 
     * @param string
     * @return
     */
    public static Instruction parseInstruction(String string) {
        String[] components = string.split(" ", 2);
        Command command = Command.parseCommand(components[0]);
        return new Instruction(command, (components.length > 1) ? components[1] : "");
    }

    /**
     * 
     * @param command
     */
    private void setCommand(Command command) {
        this.command = command;
    }
    
    /**
     * 
     * @return
     */
    public Command getCommand() {
        return command;
    }
    
    /**
     * 
     * @param argument
     */
    private void setArgument(String argument) {
       this.argument = argument;
    }
    
    /**
     * 
     * @return
     */
    public String getArgument() {
        return argument;
    }
}
