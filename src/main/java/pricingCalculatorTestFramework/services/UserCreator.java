package pricingCalculatorTestFramework.services;

import pricingCalculatorTestFramework.models.User;


public class UserCreator {
    public static final String USER_EMAIL = "testuserattraining@gmail.com";
    public static final String USER_PASSWORD = "Pass1234!";

    public static User withCorrectCredentials() {
        return new User(USER_EMAIL, USER_PASSWORD);
    }

    public static User withEmptyEmail() {
        return new User("", USER_PASSWORD);
    }

    public static User withEmptyPassword() {
        return new User(USER_EMAIL, "");
    }
}
