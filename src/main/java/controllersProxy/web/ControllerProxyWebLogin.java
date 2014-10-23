package controllersProxy.web;

import models.entities.User;

public class ControllerProxyWebLogin  {
	private User user;

    public ControllerProxyWebLogin(User user) {
        super();
        this.user = user;
    }

    public ControllerProxyWebLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewLog.html";
    }
    
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
	
	
}
