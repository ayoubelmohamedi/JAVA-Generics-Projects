import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team <T>>{
	private String name;
	int played = 0;
	int won = 0;
	int lost =0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if (members.contains(player)) {
			System.out.println(player.getName()+" is already on the team!");
			return false;
		}else {
			members.add(player);
			System.out.println(player.getName()+" picked for team ("+name+" )");
			return true;
		}
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team<T> opponent,int ourScore,int theirScore) {
		String message ;
		if (ourScore > theirScore) {
			won++;
			message = " beat ";
		}else if(ourScore == theirScore) {
			tied++;
			message = " tied with ";
		}else {
			lost++;
			message = " lost to ";
		}
		played++;
		if(opponent != null) {
			System.out.println(opponent.getName()+" "+theirScore+"\n"+name+" "+ourScore);
			System.out.println("[Finale result : "+name+message+opponent.getName()+"]");
			System.out.println("-----------");
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	//method used to calculate ranking for a specific team.
	public int ranking() {
		return (won*2)+tied;
	}

	//compare two teams based on ho's got higher ranking
	//if the team that being compared is less in ranking;
	//the the result will return -1, the opposite of this will
	//return 1. If the ranking is the same for both, it will return 0.
	
	@Override
	public int compareTo(Team<T> team) {
		if (this.ranking() > team.ranking()) {
			return -1;
		}else if (this.ranking() < team.ranking()) {
			return 1;
		}else {
			return 0;
		}
	}

	
	
	
	
}
