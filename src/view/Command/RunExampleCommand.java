package view.Command;

import controller.Controller;

import java.util.Scanner;

public class RunExampleCommand extends Command {
    private final Controller controller;

    public RunExampleCommand(String key, String description, Controller controller) {
        super(key, description);
        this.controller = controller;
    }

    @Override
    public void execute() {
        System.out.println("Input the number associated to your option: ");
        System.out.println("1. Step");
        System.out.println("2. Full execution");
        System.out.println(">>> ");
        try {
            Scanner readOption = new Scanner(System.in);
            int option = readOption.nextInt();

            if (option == 1) {
                controller.setDisplayFLag(true);
                controller.allStep();

            } else if (option == 2) {
                controller.setDisplayFLag(false);
                controller.allStep();
            } else {
                System.out.println("Invalid input!");
            }
        } catch(Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
    }
}