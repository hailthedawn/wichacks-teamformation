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
	
    public ArrayList<Team> searchTeams(ArrayList<String> checkLanguages, boolean ifCompeting, boolean hasIdea, boolean isIdeaFinal)
    {
        //creates arraylist of people to be sorted
        int size = checkLanguages.size() + 3;
        ArrayList <ArrayList <Team>> sorted = new ArrayList <ArrayList <Team>>(size);
        
        for (int i=0; i < size; i++)
        {
            sorted.add(new ArrayList <Team>);
        }
        for(Team person: Teams)
        {
            int score = 0;
            //checks if any languages are equal
            for(String lang: person.getLangs())
            {
                if(checkLanguages.contains(lang))
                { score++; }
            }
            //checks if they have equal competition intentions
            if((Team.getIfCompeting() && ifCompeting) || (!Team.getIfCompeting() && !ifCompeting))
            { score++; }
            //checks if their hasIdea is equal
            if((Team.isHasIdea() && hasIdea) || (!Team.isHasIdea() && !hasIdea))
            {
                score++;
                
                //checks whether isIdeaFinal is equal
                if (hasIdea)
                {
                    if ((Team.isIdeaFinal() && isIdeaFinal) || (!Team.isIdeaFinal() && !isIdeaFinal))
                    { score++; }
                }
            }
            
            //adds people in to the arraylist with their scores
            sorted.get(score).add(person);
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
