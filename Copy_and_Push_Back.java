
import java.util.Scanner;

public class Copy_and_Push_Back {

    static Scanner in = new Scanner(System.in);

    static StringBuilder ans = new StringBuilder();

    static int testCases, n;

    static char a[];

    static boolean solve(String s) {

        if (s.length() <= 1) {

            return true;

        }

        if ((s.length() & 1) == 1) {

            return solve(s.substring(0, s.length() - 1));

        }

        if (s.substring(0, s.length() / 2).equalsIgnoreCase( s.substring(s.length() / 2, s.length()) )) {

            return solve(s.substring(0, s.length() / 2));

        }

        return false;

    }

    static void solve(int t) {

        if (solve(new String(a))) {

            ans.append("YES");

        } else {

            ans.append("NO");

        }

        if (t != testCases) {

            ans.append("\n");

        }

    }

    public static void main(String[] amit) {

        testCases = in.nextInt();

        for (int t = 0; t < testCases; ++t) {

            n = in.nextInt();

            a = in.next().toCharArray();

            solve(t + 1);

        }

        System.out.print(ans.toString());

    }

}
