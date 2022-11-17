import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner data =new Scanner(System.in);
        int n1 = 48, n2 = 160,ebob=1, ekok;
        System.out.print("Birinci sayiyi giriniz : ");
        n1=data.nextInt();
        System.out.print("Ikinci sayiyi giriniz :");
        n2 =data.nextInt();
        int x=1;
        while (x <= n1){
            x++;
            if (n1 % x==0 && n2 % x==0){
                ebob =x;
            }
        }
        ekok = (n1 * n2) / ebob;
        System.out.printf(" %d ve  %d sayilarinin EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayilarinin EKOK'u %d \n", n1, n2, ekok);
    }
}