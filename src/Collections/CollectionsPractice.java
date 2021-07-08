package Collections;


import java.util.*;

public class CollectionsPractice {

    /** List
     * ArrayList
     * **/

    /** Set
     * HashSet
     * TreeSet
     * LinkedHashSet
     */

    /**
     * Map
     * HashMap
     * TreeMap
     * LinkedHashMap
     */

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        /**
         * Question: 1
         * Let the user enter candidate names and print them using a List.
         */
        CollectionsPractice practice = new CollectionsPractice();
      //  practice.questionOne(scanner);

        /**
         * Enter the candidate Name and find out who is the winner
         */
        practice.questionTwo(scanner);
    }

    public void questionOne(Scanner scanner) {
        boolean contd = true;
        List<String> candidateNames = new ArrayList<>();
        // get all the candidate names and create a list of candidates and print them
        while (contd) {
            System.out.println("Enter the candidate name who will participate in the elections");
            String name = scanner.next();
            candidateNames.add(name);
            System.out.println("Do you wish to continue adding elements? Type \"true\"  or \"false\"");
            contd = scanner.nextBoolean();
        }
        System.out.println(candidateNames);
    }

    public void questionTwo(Scanner scanner) {
        boolean contd = true;
        Map<String, Integer> map = new HashMap<>();

        // Get the candidate names and set them in a map
        while (contd) {
            System.out.println("Enter the candidate name who will participate in the elections");
            String name = scanner.next();
            map.put(name, 0);
            System.out.println("Do you wish to continue adding elements? Type \"true\"  or \"false\"");
            contd = scanner.nextBoolean();
        }
        contd = true;
        while(contd) {
            System.out.println("Enter the candidate who you wish to vote for");
            String name = scanner.next();
            if(map.containsKey(name)) {
                Integer count = map.get(name);
                count++;
                map.put(name,count);
            }
            System.out.println("Do you wish to continue adding elements? Type \"true\"  or \"false\"");
            contd = scanner.nextBoolean();
        }
        System.out.println("ELECTION COUNTS");
        map.forEach((k,v) -> {
              System.out.println(k + " : " + v);
        });

        /**
         * Tushar : 2
         * Rohan: 4
         * [
         * <Tushar,2>
         * <Rohan,4>
         * ]
         */

        int max = -1;
        String winner = "";
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue(); //4
                winner = entry.getKey(); //Rohan
            }
        }

        String gender = "him";
        String output = String.format("Winner is....%s. Lets Congratulate %s",winner,gender);
        System.out.println(output);
    }
}
