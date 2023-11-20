package CollectionsDemo;
import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set is a Unordered group of elements which stores unique elements only

		    Set<String> programmingLanguages = new HashSet<>();
				 
			        programmingLanguages.add("C");
			        programmingLanguages.add("C++");
			        programmingLanguages.add("Java");
			        programmingLanguages.add("Python");
			        programmingLanguages.add("PHP");
			        programmingLanguages.add("Ruby");
			        
			        programmingLanguages.add("Java");
			        programmingLanguages.add(null);
			        programmingLanguages.add(null);
			        
			       
			        
			        System.out.println("=== Iterate over a HashSet using iterator() ===");
			        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
			        while (programmingLanguageIterator.hasNext()) {
			            String programmingLanguage = programmingLanguageIterator.next();
			            System.out.println(programmingLanguage);
			        }
			        
			        System.out.println("=== Iterate over a HashSet using Enchanced For loop ===");
			        for(String programmingLanguage: programmingLanguages) {
			            System.out.println(programmingLanguage);
			        }

			        HashSet<String> pl = new HashSet<>(programmingLanguages);
			        
			        System.out.println(pl);
			        
			        Object clonepl = new HashSet<>();// empty hash set
			        
			        // clone the Hashset
			        clonepl=pl.clone();
			        
			        //display new set after cloning
			        System.out.println(clonepl);

	}

}
