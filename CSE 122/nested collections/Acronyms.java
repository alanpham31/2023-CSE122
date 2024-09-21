import java.util.*;

public class Acronyms {
	public static void main(String[] args) {
		Set<List<String>> wordLists = new HashSet<>();
		setupWords(wordLists);
		Map<String, Set<List<String>>> acronyms = acronyms(wordLists);
		System.out.println(acronyms);
    }

	public static Map<String, Set<List<String>>> acronyms(Set<List<String>> lists) {
		// TODO: Your code here
        Map<String, Set<List<String>>> result = new TreeSet<>();

        // steps:
        // for each list in lists
            // get the acronym
            // i.e. [face, mask] -> FM
            // add to map
        
            for (List<String> words : lists) {
                String acronym = acronymFor(words);
                if (!result.containsKey(acronym)) {
                    result.put(acronym, new HashSet<>());
                }
                Set<List<String>> s = result.get(acronym);
                s.add(words);
            }
            
            return result;

        }
	// Returns the acronym for the given list of words, which is an all-uppercase string
	// containing the first letter of each word.
	public static String acronymFor(List<String> words) {
		String acronym = "";
		for (String next : words) {
			acronym += next.charAt(0);
		}
		return acronym.toUpperCase();
 	}

	// [ignore] populates the given set of lists of strings.
	private static void setupWords(Set<List<String>> wordLists) {
		List<String> l1 = new ArrayList<>();
		l1.add("face");
		l1.add("mask");
		List<String> l2 = new ArrayList<>();
		l2.add("air");
		l2.add("conditioning");
		List<String> l3 = new ArrayList<>();
		l3.add("social");
		l3.add("distancing");
		List<String> l4 = new ArrayList<>();
		l4.add("animal");
		l4.add("crossing");
		List<String> l5 = new ArrayList<>();
		l5.add("work");
		l5.add("from");
		l5.add("home");
		List<String> l6 = new ArrayList<>();
		l6.add("standard");
		l6.add("definition");
		List<String> l7 = new ArrayList<>();
		l7.add("frequency");
		l7.add("modulation");
		List<String> l8 = new ArrayList<>();
		l8.add("alternating");
		l8.add("current");

		wordLists.add(l1);
		wordLists.add(l2);
		wordLists.add(l3);
		wordLists.add(l4);
		wordLists.add(l5);
		wordLists.add(l6);
		wordLists.add(l7);
		wordLists.add(l8);
	}
}