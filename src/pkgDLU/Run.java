package pkgDLU;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) throws InterruptedException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Hace mucho tiempo que LigoteosUMA dejó de funcionar en Twitter... pero no temas. Un joven apuesto\n" +
                            "se ha dignado a ligar contigo en persona.\n" +
                "Cuentame, ¿cómo se llama el mozo?");
        String nomCO = sc.nextLine();
        Thread.sleep(2000);
        System.out.println("Buena elección. ¿Y tu nombre cual es?");
        String nomCR = sc.nextLine();
        Thread.sleep(1000);
        System.out.println("Comencemos...\n");
        Escenario esc = new Escenario(nomCO, nomCR);
        Thread.sleep(2500);
        System.out.println("Te voy a conceder estos recursos: " + esc.getRecursos().toString() + "\n" +
                "Podrás usarlos en cualquier momento pulsando 0.\n");
        Thread.sleep(5000);
        System.out.println("Ademas te doy "+ esc.getConr().getVida() +" escenas para lograrlo.\n" +
                "Sin más dilación que llegue... la primera escena." );
        Thread.sleep(7000);
        esc.firstScene(sc);
        Thread.sleep(7000);
        esc.secondScene(sc);
        Thread.sleep(7000);
        esc.thirdScene(sc);

    }




}
