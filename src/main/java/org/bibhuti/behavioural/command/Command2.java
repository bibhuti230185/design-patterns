package org.bibhuti.behavioural.command;


/**
 * Superclass of AddContactCommand, EditContactCommand, DeleteContactCommand,
 * AddItemCommand, EditItemCommand, DeleteItemCommand
 */
public abstract class Command2 {

    private boolean is_executed;

    public Command2(){
        is_executed = false;
    }

    public abstract void execute();

    public boolean isExecuted(){
        return is_executed;
    }

    public void setIsExecuted(boolean is_executed) {
        this.is_executed = is_executed;
    }
}