import java.util.HashMap;
public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Tiger","Zhao");
        logininfo.put("Among","PASSWORD");
        logininfo.put("Sussy","thing");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
