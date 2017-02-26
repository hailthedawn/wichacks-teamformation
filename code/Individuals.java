package code;

import java.util.*;

public class Individuals {
    private HashSet<Individual> individuals;
    
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
    public ArrayList<Individual> searchIndividuals(ArrayList<String> checkLanguages, boolean ifCompeting, boolean hasIdea, boolean isIdeaFinal)
    {
        //creates arraylist of people to be sorted
        int size = checkLanguages.size() + 3;
        ArrayList <ArrayList <Individual>> sorted = new ArrayList <ArrayList <Individual>>(size);
        
        for (int i=0; i < size; i++)
        {
            sorted.add(new ArrayList <Individual>());
        }
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
            if((person.getIfCompeting() && ifCompeting) || (!person.getIfCompeting() && !ifCompeting))
            { score++; }
            //checks if their hasIdea is equal
            if((person.isHasIdea() && hasIdea) || (!person.isHasIdea() && !hasIdea))
            {
                score++;
                
                //checks whether isIdeaFinal is equal
                if (hasIdea)
                {
                    if ((person.isIdeaFinal() && isIdeaFinal) || (!person.isIdeaFinal() && !isIdeaFinal))
                    { score++; }
                }
            }
            
            //adds people in to the arraylist with their scores
            sorted.get(score).add(person);
        }
        
        //sorts the arraylist
        int index = size;
        ArrayList <Individual> topTen = new ArrayList <Individual>();
        while(topTen.size() < 10)
        { 
            ArrayList<Individual> highScores = sorted.get(index);
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
