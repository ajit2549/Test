package generics;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class AnimalGeneric<T extends Animal> {
	
	
	public List<T> getUniqueAnimals(List<T> animalList,String name){
		return animalList;	
	}

}
