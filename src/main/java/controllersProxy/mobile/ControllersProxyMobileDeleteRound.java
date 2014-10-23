package controllersProxy.mobile;


import models.Player;
import controllers.ControllerDeleteRound;


public class ControllersProxyMobileDeleteRound implements ControllerDeleteRound {
    private Player user;
    
    @Override
    public void deleteRound() {
        // TODO Auto-generated method stub
        
    }
    public ControllersProxyMobileDeleteRound(Player user) {
        super();
        this.user = user;
    }

    public ControllersProxyMobileDeleteRound() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewDeleteRound";
    }
}
