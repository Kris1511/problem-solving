package Problem_solving;

import java.util.*;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        // Print result
        System.out.println(result);
    }

}
