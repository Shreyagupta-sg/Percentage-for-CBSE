import java.util.Scanner;

public class shreya_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter marks");
        float eng = sc.nextFloat();
        System.out.println("Enter total marks");
        float total1 = sc.nextFloat();
        System.out.println("Enter marks");
        float science = sc.nextFloat();
        System.out.println("Enter total marks");
        float total2 = sc.nextFloat();
        System.out.println("Enter marks");
        float maths = sc.nextFloat();
        System.out.println("Enter total marks");
        float total3 = sc.nextFloat();
        System.out.println("Enter marks");
        float hindi = sc.nextFloat();
        System.out.println("Enter total marks");
        float total4 = sc.nextFloat();
        float percentage = (eng+science+hindi+maths)/(total1+total2+total3+total4)*100;
        System.out.print(percentage);
        System.out.println("%");



    }
}
