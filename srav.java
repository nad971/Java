import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите свой год рождения:");
        int year=scanner.nextInt();
        if(2026-year>=18){
            System.out.println("соверношелетний");
        } else {
            System.out.println("несоверношелетний");
        }
    }
}