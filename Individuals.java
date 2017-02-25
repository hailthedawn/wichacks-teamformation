/**
 * @author: Ketaki Tiak kkt7778@rit.edu
 */

import java.util.HashSet;

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
}
