package MateriDasar;
import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan berat dalam kg : ");
        double berat = input.nextDouble ();
        
        System.out.print("Masukkan tinggi dalam meter : ");
        double tinggi = input.nextDouble();
        
        double bmi = berat / (tinggi*tinggi);
        System.out.println("bmi = "+ bmi);
        
        if (bmi < 18.5)
            System.out.println("Kurus");
        else if (bmi < 23)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Berat badan berlebih");
        else if (bmi > 30)
            System.out.println("Obesitas");   
    }
}
