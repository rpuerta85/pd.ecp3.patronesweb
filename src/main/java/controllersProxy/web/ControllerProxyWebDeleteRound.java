package controllersProxy.web;

import models.Player;



public class ControllerProxyWebDeleteRound  {
	private Player user;

    public ControllerProxyWebDeleteRound(Player user) {
        super();
        this.user = user;
    }

    public ControllerProxyWebDeleteRound() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewDeleteRound.html";
    }

    public Player getUser() {
        return user;
    }

    public void setUser(Player user) {
        this.user = user;
    }
    
   
	
	
}
