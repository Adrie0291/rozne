package org.example;

// program sprawdza czy wprowadzona liczba składa się tylko z 4 lub 6 cyfr, które są liczbami PIN JEST STRING (7)
public class PatternOnlyDigit {
    public static void main(String[] args) {
        String pin = "321233";
        System.out.println(validatePin2(pin));
    }

    public static boolean validatePin(String pin) {

        boolean valid = false;
        if ((pin.length() == 4 || pin.length() == 6) && (pin.matches("[0-9]+"))) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }
    public static boolean validatePin2(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

}
