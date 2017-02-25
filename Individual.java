/**
 * @author: Ketaki Tilak kkt7778@rit.edu
 */

import java.util.*;

public class Individual {

    private String name;
    //name of individual

    private ArrayList<String> langs;
    //list of languages known

    private int age;
    //age of individual

    public boolean status;
    //are they part of a team? Yes: True, Maybe/No: False
    //if False, they're searchable. else, they're not.

    public boolean hasIdea;
    //do they have their own idea? Are they willing to change?

    public boolean isIdeaFinal;
    //open to other ideas? default:false if they have no idea at all

    public ArrayList<String> lookingForThese;
    //strings of what they're looking for. eg->fields like web dev, data science etc.
    //when searching, look for keywords


    /**
     * const to initialize fields
     */
    public Individual(String name, ArrayList<String> langs, int age, boolean status, boolean hasIdea, boolean isIdeaFinal, ArrayList<String> lookingForThese) {
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

    public void setLangs(ArrayList<String> langs) {
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

    public void setLookingForThese(ArrayList<String> lookingForThese) {
        this.lookingForThese = lookingForThese;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getLangs() {
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

    public ArrayList<String> getLookingForThese() {
        return lookingForThese;
    }
}
