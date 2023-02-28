import java.util.Scanner;

public class Sum {
    public static vogid main(String []args){
        int a , b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num: ");
        a = sc.nextInt();
        System.out.println("enter second num: ");
        b = sc.nextInt();
        c = a+b;
        System.out.println("sum is: "+c);
        System.out.println("Done");
    }
}
