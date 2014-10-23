package controllersProxy.web;

import models.Administrator;
import models.Player;

public  class FrontControllerProxyWebServlet  {
	//Servlet implementado como clase normal 
    //de java, para no tener que crear un proyecto de eclipse especial
   public void doGet(){
       doPost();
   }
	public void doPost(){
	   new ControllerProxyWebLogin().process();//hace el servlet de dispatcher
	   new ControllerProxyWebLogout().process();
	   new ControllerProxyWebGetStatistics(new Administrator()).process();
	   new ControllerProxyWebCreateRound(new Player()).process();
	   new ControllerProxyWebDeleteRound(new Player()).process();
	}
}
