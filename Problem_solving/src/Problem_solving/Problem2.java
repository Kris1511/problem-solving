package Problem_solving;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;
            if (i < a) {
                System.out.print(odd + ", ");
            } else {
                System.out.print(odd);
            }
        }

	}

}
