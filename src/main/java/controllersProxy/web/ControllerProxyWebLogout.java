package controllersProxy.web;

import models.entities.User;

public class ControllerProxyWebLogout  {
	private User user;

    public ControllerProxyWebLogout(User user) {
        super();
        this.user = user;
    }

    public ControllerProxyWebLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewLogOut.html";
    }
    
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
	
	
}
