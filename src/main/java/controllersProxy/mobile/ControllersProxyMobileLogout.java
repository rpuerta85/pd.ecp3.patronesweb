package controllersProxy.mobile;

import models.entities.User;
import controllers.ControllerLogin;
import controllers.ControllerLogout;

public class ControllersProxyMobileLogout implements ControllerLogout {
    private User user;
    
    @Override
    public void logout() {
        // TODO Auto-generated method stub
        
    }
    public ControllersProxyMobileLogout(User user) {
        super();
        this.user = user;
    }

    public ControllersProxyMobileLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewLogOut";
    }
}
