package org.rcbg.afku;


import org.rcbg.afku.failedloginnotifiers.DiscordNotifier;
import org.rcbg.afku.failedloginnotifiers.EmailNotifier;
import org.rcbg.afku.failedloginnotifiers.FacebookNotifier;

public class Main {
    public static void main(String[] args) {
        ILogin loginSystem;

        // You can log in directly to the system
        loginSystem = new LoginSystem();
        System.out.println(loginSystem.login("baduser", "badPassword"));

        System.out.println("\n\n");

        // But you can notify someone that there was failed attempt to log in
        ILogin emailNotificator = new EmailNotifier(loginSystem);
        ILogin discordNotificator = new DiscordNotifier(emailNotificator);
        ILogin facebookNotificator = new FacebookNotifier(discordNotificator);

        System.out.println(facebookNotificator.login("baduser", "badPassword"));
    }
}