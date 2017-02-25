/**
 * @author: Ketaki Tiak kkt7778@rit.edu
 */

import java.util.*;

public class Individuals {
    private HashSet individuals;
    
    public Individuals()
    {
        individuals = new HashSet<Individual>();
    }
    
    //mutator method- adds individual
    public void addIndividual(Individual individual)
    {
        individuals.add(individual);
    }
    
    //mutator method- removes individual
    public void removeIndividual(Individual individual)
    {
        individuals.remove(individual);
    }
    
    //returns total number of individuals
    public int numIndividuals()
    {
        return individuals.size();
    }
    
    //creates a score for each individual based on matching skills
    public ArrayList<Team> searchIndividuals(ArrayList<String> checkLanguages, boolean ifCompeting, boolean hasIdea, boolean isIdeaFinal)
    {
        //creates hashmap
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        for(Individual person: individuals)
        {
            int score = 0;
            //checks if any languages are equal
            for(String lang: person.getLangs())
            {
                if(checkLanguages.contains(lang))
                { score++; }
            }
            //checks if they have equal competition intentions
            if((Individual.getIfCompeting() && ifCompeting) || (!Individual.getIfCompeting() && !ifCompeting))
            { score++; }
            //checks if their hasIdea is equal
            if((Individual.isHasIdea() && hasIdea) || (!Individual.isHasIdea() && !hasIdea))
            {
                score++;
                
                //checks whether isIdeaFinal is equal
                if (hasIdea)
                {
                    if ((Individual.isIdeaFinal() && isIdeaFinal) || (!Individual.isIdeaFinal() && !isIdeaFinal))
                    { score++; }
                }
            }
            
            //attaches score to the person
            map.put(person, score);
        }
    }
}
