package org.example.lessonFour;

public class checker {
    private static final String loginAvailableChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    public static void main(String[] args) {
        Boolean result = loginAndPasswordChecker("Login_", "Password__", "Password__");

        if (result) {
            System.out.println("Ваши логин и пароль приняты!");
        }
        else {
            System.out.println("Что то пошло не так, смотри ошибку выше.");
        }
    }

    public static Boolean loginAndPasswordChecker (String login, String password, String confirmPassword) {
        try {
            //проверки на длины логина, пароля и совпадение паролей
            if (login.length() < 1 || login.length() >= 20) {
                System.out.println("Длина логина менее 1 символа либо превышает 20 символов");
                throw new WrongLoginException();
            }
            else if (password.length() < 1 || password.length() >= 20) {
                throw new WrongPasswordException("Длина пароля менее 1 символа либо превышает 20 символов");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают!");
            }

            //проверяем логин на нужные символы
            for (int i = 0; login.length() > i; i++) {
                char charNow = login.charAt(i);
                int indexInAvailableString = loginAvailableChars.indexOf(charNow);
                if (indexInAvailableString < 0) {
                    System.out.println("Логин должен содержать только латинские буквы, цифры или символ нижнего подчеркивания!");
                    throw new WrongLoginException();
                }
            }

            //проверяем пароль на нужные символы
            for (int i = 0; password.length() > i; i++) {
                char charNow = password.charAt(i);
                int indexInAvailableString = loginAvailableChars.indexOf(charNow);
                if (indexInAvailableString < 0) {
                    throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры или символ нижнего подчеркивания!");
                }
            }

            //при успешном выполнении всех проверок возвращаем true
            return true;
        }
        catch (WrongLoginException e) {
            return false;
        }
        catch (WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }
}
