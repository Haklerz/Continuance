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
public class Instruction {
    private Command command;
    private String argument;
    
    public Instruction(Command command, String argument) {
        setCommand(command);
        setArgument(argument);
    }

    public static Instruction parseInstruction(String string) {
        String[] components = string.split(" ", 2);
        Command command = Command.parseCommand(components[0]);
        return new Instruction(command, (components.length > 1) ? components[1] : "");
    }

    private void setCommand(Command command) {
        this.command = command;
    }
    
    public Command getCommand() {
        return command;
    }
    
    private void setArgument(String argument) {
       this.argument = argument;
    }
    
    public String getArgument() {
        return argument;
    }
}
