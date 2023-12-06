import java.util.Scanner;
public class Easy_1_Problem {
    public int lengthOfLastWord(String a)
    {
        int len = 0;
        String x = a.trim(); //to remove extra spaces from start and ending of the entered string
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
        return len;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Easy_1_Problem ans1 = new Easy_1_Problem();
        System.out.println(ans1.lengthOfLastWord(input));
    }
}