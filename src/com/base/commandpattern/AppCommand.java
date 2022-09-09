package com.base.commandpattern;

public class AppCommand {

	public static void main(String[] args) {
		
		Switcher switcher = new Switcher();
		
		Light light = new Light();
		TurnOnCommand onCommand = new TurnOnCommand(light);
		TurnOffCommand offCommand = new TurnOffCommand(light);
		
		switcher.addCommand(onCommand);
		switcher.addCommand(offCommand);
		switcher.addCommand(onCommand);

		
		switcher.executeCommands();
		
	}
}
