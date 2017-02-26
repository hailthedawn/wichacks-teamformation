package code;

import java.util.HashSet;
import code.Individual;

public class Driver {

	public static void main(String[] args){
		HashSet<String> langs = new HashSet<String>();
		langs.add("Java"); 
		langs.add("Python");
		langs.add("C++");
		HashSet<String> looking = new HashSet<String>();
		looking.add("Javascript");
		Individual person = new Individual("Katie", langs, 21, false, false, false, looking);
		System.out.println(person.getName());
		
	}
}
