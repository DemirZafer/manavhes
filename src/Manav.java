import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        float armut = 2.14f , elma = 3.67f , domat = 1.11f , muz = 0.95f  , patlıcan = 5.00F, toplam  ;
        float armutkg , elmakg , domatkg , muzkg , patlıcankg ;
        Scanner vr = new Scanner(System.in);
        System.out.println("Kaç kg armut aldınız? : ");
        armutkg = vr.nextFloat();
        System.out.println("Kaç kg elma aldınız? : ");
        elmakg = vr.nextFloat();
        System.out.println("Kaç kg domat aldınız? : ");
        domatkg = vr.nextFloat();
        System.out.println("Kaç kg muz aldınız? : ");
        muzkg = vr.nextFloat();
    System.out.println("Kaç kg patlıcan aldınız? : ");
        patlıcankg = vr.nextFloat();
        toplam = (armut*armutkg) + (elma*elmakg) + (domat*domatkg) + (muz*muzkg) + (patlıcan*patlıcankg) ;
        System.out.println("Toplam Tutar : "+toplam);

    }
}
