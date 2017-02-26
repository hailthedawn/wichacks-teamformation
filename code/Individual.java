package code;

import java.util.*;

public class Individual {

    private String name;
    //name of individual

    private HashSet<String> langs;
    //list of languages known

    private int age;
    //age of individual

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    private boolean status;
    //are they part of a team? Yes: True, Maybe/No: False.
    //if False, they're searchable. else, they're not.

    private String idea;
    //the idea they have

    private boolean hasIdea;
    //do they have their own idea? Are they willing to change?

    private boolean isIdeaFinal;
    //open to other ideas? default:false if they have no idea at all

    private HashSet<String> lookingForThese;
    //strings of what they're looking for. eg->fields like web dev, data science etc.
    //when searching, look for keywords.

    private boolean ifCompeting;
    //true if individual wants to compete, false if they want to learn


    public boolean getIfCompeting() {
        return ifCompeting;
    }

    public void setIfCompeting(boolean ifCompeting) {
        this.ifCompeting = ifCompeting;
    }

    /**
     * const to initialize fields
     */
    public Individual(String name, HashSet<String> langs, int age, boolean status, boolean hasIdea, boolean isIdeaFinal, HashSet<String> lookingForThese) {
        this.name = name;
        this.langs = langs;
        this.age = age;
        this.status = status;
        this.hasIdea = hasIdea;
        this.isIdeaFinal = isIdeaFinal;
        this.lookingForThese = lookingForThese;
    }

    /**
     * set name
     * @param name of individual
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setLangs(HashSet<String> langs) {
        this.langs = langs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setHasIdea(boolean hasIdea) {
        this.hasIdea = hasIdea;
    }

    public void setIdeaFinal(boolean ideaFinal) {
        isIdeaFinal = ideaFinal;
    }

    public void setLookingForThese(HashSet<String> lookingForThese) {
        this.lookingForThese = lookingForThese;
    }

    public String getName() {
        return name;
    }

    public HashSet<String> getLangs() {
        return langs;
    }

    public int getAge() {
        return age;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean isHasIdea() {
        return hasIdea;
    }

    public boolean isIdeaFinal() {
        return isIdeaFinal;
    }

    public HashSet<String> getLookingForThese() {
        return lookingForThese;
    }

    
}
