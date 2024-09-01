package login;

import java.util.HashMap;

public class IDAndPasswords {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDAndPasswords(){
        loginInfo.put("James","pizza");
        loginInfo.put("Kirk","guitarsolo");
        loginInfo.put("Lars","ilovedrums");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;

    }
}
