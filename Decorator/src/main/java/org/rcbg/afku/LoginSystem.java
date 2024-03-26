package org.rcbg.afku;

public class LoginSystem implements ILogin{
    private String correctUsername = "secure_user";
    private String correctPassword = "SeCrEtPaSsWoRd";

    @Override
    public boolean login(String username, String password) {
        return this.correctPassword.equals(password) && this.correctUsername.equals(username);
    }
}
