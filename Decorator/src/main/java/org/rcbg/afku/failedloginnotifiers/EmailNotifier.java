package org.rcbg.afku.failedloginnotifiers;

import org.rcbg.afku.ILogin;

public class EmailNotifier extends BaseNotifier{

    public EmailNotifier(ILogin component) {
        super(component);
    }

    private String prepareMessage(String username){
        return "[EMAIL] Failed log in for user: " + username;
    }

    @Override
    public boolean login(String username, String password) {
        boolean loggedIn = super.login(username, password);
        if(!loggedIn){
            System.out.println(this.prepareMessage(username));
        }
        return loggedIn;
    }
}
