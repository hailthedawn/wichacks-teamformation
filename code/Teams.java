package code;

import java.util.ArrayList;
import java.util.HashSet;


public class Teams {

	private HashSet<Team> _teams;
	
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
		return _teams.size();
	}
	
    public ArrayList<Team> searchTeams(ArrayList<String> checkLanguages, boolean ifCompeting, boolean hasIdea, boolean isIdeaFinal)
    {
        //creates arraylist of people to be sorted
        int size = checkLanguages.size() + 3;
        ArrayList <ArrayList <Team>> sorted = new ArrayList <ArrayList <Team>>(size);
        
        for (int i=0; i < size; i++)
        {
            sorted.add(new ArrayList<Team>());
        }
        for(Team team: _teams)
        {
            int score = 0;
            //checks if any languages are equal
            for(String lang: team.getLangsKnown())
            {
                if(checkLanguages.contains(lang))
                { score++; }
            }
            //checks if they have equal competition intentions
            if((team.getTeamCompeting() && ifCompeting) || (!team.getTeamCompeting() && !ifCompeting))
            { score++; }
            //checks if their hasIdea is equal
            if((team.getHasIdea() && hasIdea) || (!team.getHasIdea() && !hasIdea))
            {
                score++;
                
                //checks whether isIdeaFinal is equal
                if (hasIdea)
                {
                    if ((team.getTeamIdea() != null && isIdeaFinal) || (team.getTeamIdea() == null && !isIdeaFinal))
                    { score++; }
                }
            }
            
            //adds people in to the arraylist with their scores
            sorted.get(score).add(team);
        }
        
        //sorts the arraylist
        int index = size;
        ArrayList <Team> topTen = new ArrayList <Team>();
        while(topTen.size() < 10)
        { 
            ArrayList<Team> highScores = sorted.get(index);
            if(highScores.size() > 10) {
                for(int i = 0; i < 10; i++){
                    topTen.add(highScores.get(i));
                }
            } else {
                for(int i = 0; i < highScores.size(); i++){
                    topTen.add(highScores.get(i));
                }
            }
            index--;
            
            if (index < 0)
            { break; }
        }
        return topTen;
    }

}
