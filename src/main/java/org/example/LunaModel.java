package org.example;
public class LunaModel {
  //  private LunaView view;
    public boolean isValid(String input) {
        System.out.println("*************** " );
        System.out.println("Число ввод: " + input);
        if (!input.matches("\\d+")) {
            System.out.println("Ответ: " +false);
        //    view.showError("Рядок містить невірні символи.");
            return false;
        }

        int sum = 0;
        boolean alternate = false;
        for (int i = input.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(input.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        boolean rrr = (sum % 10 == 0);
        System.out.println("Ответ: " + rrr);

        return (sum % 10 == 0);
    }
}
