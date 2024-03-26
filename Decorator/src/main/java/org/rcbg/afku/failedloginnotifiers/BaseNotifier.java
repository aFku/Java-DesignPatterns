package org.rcbg.afku.failedloginnotifiers;

import org.rcbg.afku.ILogin;

public abstract class BaseNotifier implements ILogin {

    private ILogin component;

    public BaseNotifier(ILogin component){
        this.component = component;
    }
    @Override
    public boolean login(String username, String password) {
        return this.component.login(username, password);
    }
}
