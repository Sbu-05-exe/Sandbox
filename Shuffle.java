import java.util.*;

public class Shuffle {
    /** Fill list with n items, 1...n.
      */
    private static void addToList (List<Integer> lst, int n) {
        for (int k = 0; k < n; k++) {
            lst.add(k+1);
        } // for
    } // shuffle

    /** Shuffle the list.  Must have two or more items.
      */
    private static void shuffle (List<Integer> lst) throws InvalidShuffleException{
        // Check that there is more than one item in lst, and
        // throw an exception if not.

        if (lst.size() < 2) {

            throw new InvalidShuffleException(lst.size());
        
        }
        
        Random random = new Random();
        for (int k = lst.size() - 1; k > 0; k--) {
            int j = random.nextInt(k);
            // Swap items at positions k and j
            int tmp = lst.get(k);
            lst.set(k, lst.get(j));
            lst.set(j, tmp);
        } // for
    } // shuffle

    public static void main (String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        addToList(list1, 10); // Add 10 items to list1
        addToList(list2, 1); // Add 1 item to list2

        System.out.println("List 1 = " + list1);
        System.out.println("List 2 = " + list2);
        System.out.println("List 3 = " + list3);

        boolean l1 = true, l2 = true, l3 = true;


        try {

            shuffle(list1);
        
        } catch (InvalidShuffleException e) {

            System.out.println(e.getMessage());
            l1 = false;

        }

        try {

            shuffle(list2);
        
        } catch (InvalidShuffleException e) {

            System.out.println(e.getMessage());
            l2 = false;

        }
        
        try {

            shuffle(list3);
        
        } catch (InvalidShuffleException e) {

            System.out.println(e.getMessage());
            l3 = false;        
        }

        if (l1) {

            System.out.println("List 1 = " + list1);

        }

        if (l2) {

            System.out.println("List 2 = " + list2);

        }

        if (l3) {

            System.out.println("List 3 = " + list3);

        }
    
    } // main

} // class Shuffle

class InvalidShuffleException extends Exception {

    public InvalidShuffleException() {
        
        super("Cannot Shuffle list of size less than 2");

    }

    public InvalidShuffleException(String mssg) {
        
        super(mssg);
    
    } 

    public InvalidShuffleException(int size) {

        super(String.format("Cannot Shuffle list of size less than 2:\n\tlist size = [%d]", size));
        
    }
    
} // class InvalidShuffleExceptioncls
