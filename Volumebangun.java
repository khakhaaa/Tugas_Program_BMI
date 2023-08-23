package MateriDasar;
import java.util.Scanner;

public class Volumebangun {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float phi = 3.14f;
        double vbola;
        double vtabung;
        double vkerucut;
            
        System.out.print("Masukkan jari-jari = ");
        int jari = input.nextInt();
        
        System.out.print("Masukkan tinggi = ");
        int tinggi = input.nextInt();
                
        vbola = 4/(float)3 * phi * (jari*jari*jari);
        System.out.println("Volume bola = "+vbola+"cm3");
            
        vtabung = phi * (jari*jari) * tinggi;
        System.out.println("Volume tabung = "+vtabung+"cm3");
        
        vkerucut = 1/(float)3 * phi * (jari*jari) * tinggi;
        System.out.println("Volume kerucut = "+vkerucut+"cm3");
        
    }
}
