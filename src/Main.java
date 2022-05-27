import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total=0;
        boolean isOdd = true;


        while (isOdd) {
            System.out.print("Sayi Giriniz : ");
            number = input.nextInt();
            for (int i=1;i<=number;i++) {
                if (i%4==0) {
                    total+=i;}
            }
            System.out.println("Total = " + total);
            total=0;
            if (number%2==1) {
                isOdd = false;
                    }

                }

            }
        }


