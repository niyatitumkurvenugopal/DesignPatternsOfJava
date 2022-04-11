package com.niyati.designpattern.behavioral.command;

public class TurnOnLightCommand implements ICommand {
    Light light;

    public TurnOnLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public String execute() {
        return "Turning on light." + light.turnOn();

    }
}
