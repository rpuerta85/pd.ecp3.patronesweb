package controllersProxy.web;

import models.Administrator;



public class ControllerProxyWebGetStatistics  {
	private Administrator user;

    public ControllerProxyWebGetStatistics(Administrator user) {
        super();
        this.user = user;
    }

    public ControllerProxyWebGetStatistics() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewStatistics.html";
    }

    public Administrator getUser() {
        return user;
    }

    public void setUser(Administrator user) {
        this.user = user;
    }
    
   
	
	
}
