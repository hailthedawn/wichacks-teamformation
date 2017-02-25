import java.util.HashSet;


public class Teams {

	private HashSet _teams;
	
	public Teams() {
		_teams = new HashSet<Team>();
	}
	
	public void addTeam(Team team) {
		_teams.add(team);
	}
	
	public void removeTeam(Team team) {
		_teams.remove(team);
	}
	
	public int numTeams() {
		_teams.size();
	}

}
