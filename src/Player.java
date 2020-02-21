
public abstract class Player {
	//use this class as type of the 3 other classes ;Also its an abstract class so we can't initialized.
	//an object as Player in MainClass we only allow the 3 other class
	//Again this class represent only the upperClass of this classes [BaseballPlayer, FootballPlayer, SoccerPlayer]
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
	
	

}
