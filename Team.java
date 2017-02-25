import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Claire Casalnova
 */
public class Team 
{	
	private HashSet<Individual> members;
	private HashSet<String> langsKnown, langsUnknown;
	private int numMembers;
	private String teamName;
	
	
	
	public Team (Individual a, Individual b, int n)
	{
		n=numMembers;
		members= new HashSet<Individual>();
		members.add(a);
		members.add(b);
		
	}
	
	
	/**
	 * @param tn teamName
	 * sets team name for the members
	 */
	public void setTeamName(String tn)
	{
		teamName=tn;
	}
	
	public void determineKnownLanguages()
	{
		langsKnown= new HashSet<String>();
		
		for (Individual member : members)
		{
			HashSet<String> memberLangs= member.getLangs();
			langsKnown.addAll(memberLangs);
			
		}
		
	}
	
	public void determineWantedLanguages()
	{
		langsUnknown = new HashSet<String>();
		
		for (Individual member : members)
		{
			HashSet<String> wantedLangs= member.getLookingForThese();
			langsUnknown.addAll(wantedLangs);
			
		}
		langsUnknown.removeAll(langsKnown);
	}
	
	/**
	 * @return determines if number of members on the team wanted is already reached
	 */
	public boolean canAddMember()
	{
		if (numMembers==members.size())
		{
			return false;
		}
		return true;
				
	}
	
	/**
	 * @param m member to add to the team
	 * adds a member to the team
	 */
	public void addMember(Individual m)
	{
		if (canAddMember()==true)
		{
			members.add(m);
		}
	}
	
	

	public HashSet<String> getLangsKnown()
	{
		return langsKnown;
	}
	
	public HashSet<String> getLangsKnownUnknown()
	{
		return langsUnknown;
	}
	
	public String getTeamName()
	{
		return teamName;
	}
		
	public int getNumMembers()
	{
		return numMembers;
	}

	
	
}
