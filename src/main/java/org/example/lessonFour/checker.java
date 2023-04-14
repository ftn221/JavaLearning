package org.example.lessonFour;

public class checker {

    public static void main(String[] args) {
        Boolean result = loginAndPasswordChecker("helllowwwww", "&^%&^%^%", "&^%&^%^%");

        if (result) {
            System.out.println("Ваши логин и пароль приняты!");
        } else {
            System.out.println("Что то пошло не так, смотри ошибку выше.");
        }
    }

    public static Boolean loginAndPasswordChecker(String login, String password, String confirmPassword) {
        try {
            //проверки на длины логина, пароля и совпадение паролей
            if (login.length() < 1 || login.length() >= 20) {
                System.out.println("Длина логина менее 1 символа либо превышает 20 символов");
                throw new WrongLoginException();
            } else if (password.length() < 1 || password.length() >= 20) {
                throw new WrongPasswordException("Длина пароля менее 1 символа либо превышает 20 символов");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают!");
            }

            //проверяем логин на нужные символы
            for (int i = 0; login.length() > i; i++) {
                Character charNow = login.charAt(i);
                boolean equal = charNow.toString().matches("[A-Za-z0-9_]");
                if (!equal) {
                    System.out.println("Логин должен содержать только латинские буквы, цифры или символ нижнего подчеркивания!");
                    throw new WrongLoginException();
                }
            }

            //проверяем пароль на нужные символы
            for (int i = 0; password.length() > i; i++) {
                Character charNow = password.charAt(i);
                boolean equal = charNow.toString().matches("[A-Za-z0-9_]");
                if (!equal) {
                    throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры или символ нижнего подчеркивания!");
                }
            }

            //при успешном выполнении всех проверок возвращаем true
            return true;
        } catch (WrongLoginException e) {
            return false;
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }
}