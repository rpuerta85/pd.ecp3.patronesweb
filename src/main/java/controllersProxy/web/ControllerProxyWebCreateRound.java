package controllersProxy.web;

import models.Player;



public class ControllerProxyWebCreateRound  {
	private Player user;

    public ControllerProxyWebCreateRound(Player user) {
        super();
        this.user = user;
    }

    public ControllerProxyWebCreateRound() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewCreateRound.html";
    }

    public Player getUser() {
        return user;
    }

    public void setUser(Player user) {
        this.user = user;
    }
    
   
	
	
}
