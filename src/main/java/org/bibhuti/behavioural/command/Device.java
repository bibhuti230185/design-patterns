package org.bibhuti.behavioural.command;
/**
 * Receiver interface , defines the action methods that can be called by the command objects.
 * Concrete classes that implement this interface will provide the actual implementation of these methods.
 *
 */
public interface Device {
    void turnOn();
    void turnOff();

}
