package controllersProxy.mobile;


import models.Player;
import controllers.ControllerCreateRound;


public class ControllersProxyMobileCreateRound implements ControllerCreateRound {
    private Player user;
    
    @Override
    public void createRound() {
        // TODO Auto-generated method stub
        
    }
    public ControllersProxyMobileCreateRound(Player user) {
        super();
        this.user = user;
    }

    public ControllersProxyMobileCreateRound() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewCreateRound";
    }
}
