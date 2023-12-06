import java.util.Scanner;
class Medium_2_Problem {
    static void findMajority(int arr[], int n)
    {
        int flag=0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > n/3) {
                System.out.print(arr[i]+" ");
                flag=1;
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findMajority(arr, n);
    }
}

