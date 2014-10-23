package controllersProxy.mobile;


import models.Player;
import controllers.ControllerCreateRound;
import controllers.ControllerMoveCard;


public class ControllersProxyMobileMoveCard implements ControllerMoveCard {
    private Player user;
    
    @Override
    public void moveCard() {
        // TODO Auto-generated method stub
        
    }
    public ControllersProxyMobileMoveCard(Player user) {
        super();
        this.user = user;
    }

    public ControllersProxyMobileMoveCard() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewMoveCard";
    }
}
