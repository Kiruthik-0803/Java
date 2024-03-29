import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number:");
        int n=scan.nextInt();
        for (int i=n; i<=a.length-1; i++) {
            System.out.println(a[i]);
           }     
           for (int i=0; i<n;i++){
            System.out.println(a[i]);
        }
           scan.close();
        }
}
