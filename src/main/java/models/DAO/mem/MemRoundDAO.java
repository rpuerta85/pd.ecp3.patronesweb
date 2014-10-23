package models.DAO.mem;

public class MemRoundDAO {
    private MemUserDAO playerWithTurn; 
    public static final int PLAYERS=2;
    private MemUserDAO[] players=new MemUserDAO[PLAYERS];
    
    public MemRoundDAO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MemUserDAO getPlayerWithTurn() {
        return playerWithTurn;
    }
    public void setPlayerWithTurn(MemUserDAO playerWithTurn) {
        this.playerWithTurn = playerWithTurn;
    }
    public MemUserDAO[] getPlayers() {
        return players;
    }
    public void setPlayers(MemUserDAO[] players) {
        this.players = players;
    }
    
    
   
}
