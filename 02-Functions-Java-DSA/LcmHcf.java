import java.util.*;
public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = HcfLcm(n1, n2);
        int lc = (n1 * n2) / hcf;
        System.out.println("The Lcm is: " + lc);
        System.out.println("The Hcf is: " + hcf);

    }

    static int HcfLcm(int n1, int n2) {
        int hcf = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
}