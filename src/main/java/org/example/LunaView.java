
package org.example;

public class LunaView{
    public void showResult(boolean isValid) {
        if (isValid) {
            System.out.println("Введений рядок є валідним за алгоритмом Луна.");
        } else {
            System.out.println("Введений рядок не є валідним за алгоритмом Луна.");
        }
    }
    public void showError(String errorMessage) {
        System.out.println("Помилка: " + errorMessage);
    }
}
