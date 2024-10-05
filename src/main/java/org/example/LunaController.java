package org.example;
import java.util.Scanner;


public class LunaController {
    private LunaModel model;
    private LunaView view;

    public LunaController(LunaModel model, LunaView view) {
        this.model = model;
        this.view = view;
    }

    public void processInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок для перевірки:");
        String input = scanner.nextLine();

        if (input.matches("\\d+")) {
            boolean isValid = model.isValid(input);
            view.showResult(isValid);
        } else {
            view.showError("Рядок містить невірні символи.");
        }
    }
}