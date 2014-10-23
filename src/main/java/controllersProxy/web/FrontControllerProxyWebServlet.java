package controllersProxy.web;


public  class FrontControllerProxyWebServlet  {
	//Servlet implementado como clase normal 
    //de java, para no tener que crear un proyecto de eclipse especial
   public void doGet(){
       doPost();
   }
	public void doPost(){
	   new ControllerProxyWebLogin().process();//hace el servlet de dispatcher
	   
	}
}
