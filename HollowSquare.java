import java.util.*;

public class HollowSquare {
    public static void main(String[] args) {
        int n = 20, m = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j == 1) || (i == 1 && j == n) || (i == m && j == 1) || (i == m && j == n))
                    System.out.print("+");

                else if (i == 1 || i == m)
                    System.out.print("-");

                else if ((i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9)
                        && (j == 1 || j == n))
                    System.out.print("|");

                else if (i == m - 2 && j == n - (name.length() + 2)) {
                    for (int k = 0; k < name.length(); k++)
                        System.out.print(name.charAt(k));
                    j = j + name.length() - 1;
                } else
                    System.out.print(" ");

            }
            System.out.print("\n");
        }
        sc.close();

    }
}