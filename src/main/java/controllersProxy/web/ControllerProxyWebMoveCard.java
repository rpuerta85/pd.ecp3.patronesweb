package controllersProxy.web;

import models.Player;



public class ControllerProxyWebMoveCard  {
	private Player user;

    public ControllerProxyWebMoveCard(Player user) {
        super();
        this.user = user;
    }

    public ControllerProxyWebMoveCard() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewMoveCard.html";
    }

    public Player getUser() {
        return user;
    }

    public void setUser(Player user) {
        this.user = user;
    }
    
   
	
	
}
