import java.util.*;

public class notes10_26 {
    // syntax 2d array
    public static void main(String[] args) {
        // String[][] peeps = {
        //     {"JD", "Turk", "Elliott", "Carla", "Dr. Cox"},
        //     {"Bojack", "Princess Caroline", "Todd"},
        //     {"Adrian", "Sharona", "Natalie", "Leland", "Randy"}
        // };

        // Set<String> people = new TreeSet<String>();
        // people.add("Brett");
        // people.add("Elba");
        // people.add("Miya");
        // people.add("Hunter");
        // System.out.println(people);
        // System.out.println("tree set");
        
        // for (String person : people) {
        //     System.out.println(person);
        //     // this is used to traverse through the set 
        // }
        Map<String, String> mapTest = new TreeMap<String, String>();
        Scanner console = new Scanner(System.in);
        System.out.print("Name: ");
        String name = console.nextLine();
        System.out.print("Pass: ");
        String pass = console.nextLine();
        mapTest.put(name, pass);
        System.out.println(mapTest);
        System.out.println("Saved!");
        System.out.print("Sign-in pass: ");
        String checkPass = console.nextLine();
        if (mapTest.containsValue(checkPass)) {
            System.out.println("you are signed in!");
        } else {
            System.out.println("wrong password");
        }

    }
    // hashset = more efficient but does not sort
    // Set<primitive> nameHashSet = new HashSet<primitive>();

    // treeset = less efficient but does sort, alphabetically or numerically, or false->true
    // Set<primitive> nameTreeSet = new TreeSet<primitive>();

    // both use:
    // .add = adding to set
    // .remove = remove from set


    // maps
    // unique key associated with value
    // Map<KeyType, ValueType> nameMap = new TreeMap<KeyType, ValueType>();
    // .put(); = add to the map
    // .get(type key); = returns value mapped to given key
    // .containsKey(type key); = true/false if map contains mapping for given key
    // .remove(type key); = remove any existing mapping for given key
    // .clear(); = remove all key/value pair
    // .size(); = returns number of key/value pairs 
    // .isEmpty();
    // .toString(); = returns string of map key/value pairs
    //      e.x. {98030="Kent", 98105="Seattle", 98041="Bothell"}
    // .keySet(); = returns set of all keys in map
    // .values(); = returns collection of all values
    // .putAll(Map<KeyType, ValueType>); = adds all key/value pairs from given map to this map
    // .equals(Map<KeyType, ValueType>); = true/false if given map = map

public class FaceAveraging {
    public static void main(String[] args) {
        // Load images
        Picture face1 = new Picture("alex.jpg");
        Picture face2 = new Picture("alexander.jpg");
        Picture face3 = new Picture("alfred.jpg");
        Picture face4 = new Picture("ambroz.jpg");
        Picture face5 = new Picture("arnold.jpg");
        Picture face6 = new Picture("zelmira.jpg");
        Picture face7 = new Picture("zita.jpg");
        Picture face8 = new Picture("zlata.jpg");
        Picture face9 = new Picture("zlatica.jpg");
        Picture face10 = new Picture("zora.jpg");

        // Create overall data set
        Picture[] allFaces = new Picture[] { face1, face2, face3, face4, face5, face6, face7, face8, face9, face10 };

        // Create additional data sets
        Picture[] dataSet2 = new Picture[] { face1, face3, face5 };
        Picture[] dataSet3 = new Picture[] { face2, face4, face6, face8 };

        // Edit the following line to use your desired data set
        Picture averageFace = faceAverage(allFaces);

        averageFace.save("averageFace.jpg");
    }

    // Rest of your code (faceAverage method, etc.)
}

}
