import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Claire Casalnova
 */
public class Team 
{	
	private HashSet<Individual> members;
	private HashSet<String> langsKnown, langsUnknown, ideaList;
	private int numMembers;
	private String teamName, teamIdeaString;
	private boolean teamCompeting, teamIdea;
	
	
	
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
	
	public void isTeamCompeting()
	{
		int ctr=0;
		
		for (Individual member : members)
		{
			if (member.getIfCompeting()==true)
			{
				ctr++;
			}
			
		}
		if ((member.size())/2<=ctr)
		{
			teamCompeting=false;
		}
		else
		{
			teamCompeting=true;
		}
	}

	
	public void isThereTeamIdea()
	{
		for (Individual member : members)
		{
			if (member.getIsIdeaFinal())
			{
				//determine what to do if more than one member has a final idea
				teamIdea=true;
				teamIdeaString=member.setIdea(member.getIdea()));
			}
			
				
		}
	}
	
	public void makeIdeaSet()
	{
		ideaList=new HashSet<String>();
		for (Individual member : members)
		{
			ideaList.add(member.getIdea());
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
