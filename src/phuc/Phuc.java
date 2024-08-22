package phuc;

import java.util.Scanner;

public class Phuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println ("nhap so nguyen a: ") ;
        int a = scanner.nextInt() ;
        System.out.println("nhap so nguyen b: ");
        int b = scanner.nextInt () ;
        int Tong = a+b;
        System. out .println(Tong) ;
        int Hieu = a-b;
        System. out .println(Hieu) ;
        int Tich = a*b;
        System. out .println(Tich) ;
        int Thuong = a/b;
        System. out .println (Thuong) ; 
        int Chialaydu =a%b;
        System. out.println (Chialaydu) ;
    }
    
}
