package controllersProxy.mobile;


import models.Administrator;
import controllers.ControllerGetStatistics;


public class ControllersProxyMobileGetStatistics implements ControllerGetStatistics {
    private Administrator user;
    
    @Override
    public void getStatistics() {
        // TODO Auto-generated method stub
        
    }
    public ControllersProxyMobileGetStatistics(Administrator user) {
        super();
        this.user = user;
    }

    public ControllersProxyMobileGetStatistics() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String process(){
        return "viewStatistics";
    }
}
