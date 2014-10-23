package controllersProxy.mobile;

import models.entities.User;
import controllers.ControllerLogin;

public class ControllersProxyMobileLogin implements ControllerLogin {
    private User user;
    
    @Override
    public void login() {
        // TODO Auto-generated method stub
        
    }
    public ControllersProxyMobileLogin(User user) {
        super();
        this.user = user;
    }

    public ControllersProxyMobileLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewLog";
    }
}
