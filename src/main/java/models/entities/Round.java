package models.entities;

public class Round {
    private User playerWithTurn; 
    public static final int PLAYERS=2;
    private User[] players=new User[PLAYERS];
    
    public Round() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User getPlayerWithTurn() {
        return playerWithTurn;
    }
    public void setPlayerWithTurn(User playerWithTurn) {
        this.playerWithTurn = playerWithTurn;
    }
    public User[] getPlayers() {
        return players;
    }
    public void setPlayers(User[] players) {
        this.players = players;
    }
    
    
   
}
