package MateriDasar;

public class HitungVolume {

    public static void main(String[]args){
    double phi = 3.14;
    int jari = 20;
    int tinggi = 30;
    double volumeBola;
    double volumeTabung;
    double volumeKerucut;
    
    volumeBola = 4/3 * phi * (jari*jari*jari);
        System.out.println("Volume Bola = "+volumeBola+" cm^3");
        
    volumeTabung = phi * (jari*jari) * tinggi;
        System.out.println("Volume Tabung = "+volumeTabung+"cm^3");
        
    volumeKerucut = 1/3 * phi * (jari*jari) * tinggi;
        System.out.println("Volume Kerucut = "+volumeKerucut+"cm^3");
    }
    
}
