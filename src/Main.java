
public class Main {

	public static void main(String[] args) {
		
		//football players
		FootballPlayer joe = new FootballPlayer("Joe");
		FootballPlayer pat = new FootballPlayer("Pat");
		FootballPlayer beckan = new FootballPlayer("Beckan");
		
		//baseball players
		BaseballPlayer karim = new BaseballPlayer("Karim");
		Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Baseball Team");
		baseballTeam.addPlayer(karim);
		
		// teams of type "FootBallPalyer"
		Team<FootballPlayer> canada = new Team<FootballPlayer>("Canada");
		canada.addPlayer(joe);
		System.out.println(canada.numPlayers());
		
		Team<FootballPlayer> france = new Team<FootballPlayer>("France");
		france.addPlayer(pat);
		System.out.println(france.numPlayers());
		
		
		Team<FootballPlayer> morocco = new Team<FootballPlayer>("Morocco");
		morocco.addPlayer(beckan);
		System.out.println(morocco.numPlayers());
		
		System.out.println("-------------------");
		
		morocco.matchResult(france, 2, 1);
		france.matchResult(canada, 1, 1);
		morocco.matchResult(canada, 0, 3);	
		
		
		System.out.println("Ranking");
		//return 1 if Canada win,and -1 if it lose. return 0 when they are equals.
		System.out.println(canada.compareTo(morocco));
		
		//return 1 if France win,and -1 if it lose. return 0 when they are equals.
		System.out.println(france.compareTo(morocco));
		
		
		

	}

}
