
import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 5, 5, 6, 1 };

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println("Duplicate element found: " + num);
                return;
            }

            set.add(num);
        }

    }

}
