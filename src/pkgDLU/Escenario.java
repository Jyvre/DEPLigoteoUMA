package pkgDLU;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Escenario {

    private Conquistado cono;
    private Conquistador conr;
    private List<String> recursos;

    public Escenario(String nameO, String nameR){

        cono = new Conquistado(nameO);
        recursos = new ArrayList<String>();
        recursos.add("Regalar flor".toUpperCase());
        recursos.add("Escupir en un ojo".toUpperCase());
        recursos.add("Coger de la mano".toUpperCase());
        conr = new Conquistador(nameR, 3, recursos);

    }

    public Conquistado getCono() {
        return cono;
    }

    public void setCono(Conquistado cono) {
        this.cono = cono;
    }

    public Conquistador getConr() {
        return conr;
    }

    public void setConr(Conquistador conr) {
        this.conr = conr;
    }

    public List<String> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<String> recursos) {
        this.recursos = recursos;
    }

    public void firstScene(Scanner sc) throws  InterruptedException{

        System.out.println("Escena 1/3: \n\n" +
                "Tu bello corcel de nombre " + cono.getName() + ", se acerca a ti con su apuesta mirada\n" +
                "en un intento desesperado de llamar tu atención. Pero tan solo desea ser tu amigo por ahora ¿Qué\n" +
                "haces para impresionarle?\n");
        Thread.sleep(3000);
        System.out.println("Tus opciones son:\n" +
                "Pulsa 1: Saludas con un seductor 'hola' y esperas que él inicie la conversación\n" +
                "Pulsa 2: Empiezas a hablar sobre tus aficiones y tu vida a la par que te interesas por las suyas\n" +
                "Pulsa 3: Le agarras todo el pepino al grito de '¡Un palo! ¡Es un palo de " + cono.getName() + "!'\n" +
                "Pulsa 4: Le rozas ligeramente un brazo y preguntas por su sitiación actual\n" +
                "Pulsa 5: Pasas de él");
        int a = sc.nextInt();
        if(a == 0){
            menuDeRecursos();
            Thread.sleep(3000);
            System.out.println("Y ahora la escena, pulsa el numero que consideres");
            a = sc.nextInt();
        }
        Thread.sleep(3000);
        switch (a){
            case 1: System.out.println(cono.getName() + " se sienta junto a ti y entablais conversaión. Pareceis grandes amigos.\n");
                    break;
            case 2: System.out.println(cono.getName() + " empieza a hablarte de su vida mientras considera la tuya muy interesante. Hay quimica.\n");
                cono.ponKarma(2);
                break;
            case 3: System.out.println(cono.getName() + " se asusta con semejante confianza y deja de mirarte a los ojos. Aun así, lo considera\n" +
                    "broma y comienza una insulta conversación contigo.\n");
                cono.quitaKarma(3);
                break;
            case 4: System.out.println(cono.getName() + " sus miradas cada vez son intensas e intenta pegarse a ti. Habla de forma melosa...\n");
                cono.ponKarma(3);
                break;
            case 5: System.out.println(cono.getName() + " te habla con desgana pero sin perder la esperanza de llegar a tener amistad.\n");
                cono.quitaKarma(1);
                break;
            default: System.out.println("Hay un error en el juego");
                break;
        }

        Thread.sleep(3000);
        System.out.println("Juntitos y, de alguna manera, hablando sentados en un banco avanzais en el camino de las relaciones humanas.\n" +
                "¿Conseguira " + conr.getName() + " conquistar a " + cono.getName() + "?\n" +
                "Lo averiguaremos en la siguiente escena...");

    }

    public void secondScene(Scanner sc) throws  InterruptedException{
        Thread.sleep(3000);
        System.out.println("\n\nEscena 2/3: \n\n" +
                cono.getName() + ", empieza a hablar de politica, es un tema peliagudo y resuslta que su\n" +
                "idologia es rara de cojones y puede llevar a conflicto, ya no solo contigo sino\n" +
                "con aquel que le redoe. ¿Cómo actuas?\n");
        Thread.sleep(3000);
        System.out.println("Tus opciones son:\n" +
                "Pulsa 1: Tratas de cambiar de tema sin darle imporancia\n" +
                "Pulsa 2: Hablas de tu ideologia y le discutes todo lo discutible\n" +
                "Pulsa 3: Le miras a los ojos y si, y solo si, se muestra receptivo lo besas en los labios \n" +
                "Pulsa 4: Le metes un puñetazo que le partes la espalda\n" +
                "Pulsa 5: Dejas de prestar atención");
        int a = sc.nextInt();
        if(a == 0){
            menuDeRecursos();
            Thread.sleep(3000);
            System.out.println("Y ahora la escena, pulsa el numero que consideres");
            a = sc.nextInt();
        }
        Thread.sleep(3000);
        switch (a){
            case 1: System.out.println(cono.getName() + " la conversación vuelve a fluir y todo parece ir bien.\n");
                cono.ponKarma(1);
                break;
            case 2: System.out.println(cono.getName() + " la conversación se vuelve incomoda, discutis... ¡Viva Franco!\n");
                cono.quitaKarma(2);
                break;
            case 3: System.out.println(cono.getName() + " se cruzan las miradas y deja de hablar de política, parece que todo fluye," +
                    "pero al final estás demasiado nerviosa para besarle, cambia de conversación\n");
                cono.ponKarma(3);
                break;
            case 4: System.out.println(cono.getName() + " se levanta, te mira de forma inquisidora. Algo no va bien...\n");
                cono.quitaKarma(5);
                break;
            case 5: System.out.println(cono.getName() + " se contagia de no prestar atención y empieza a mirar otras chicas de formas lasciva...\n");
                cono.quitaKarma(1);
                break;
            default: System.out.println("Hay un error en el juego");
                break;
        }

        Thread.sleep(3000);
        System.out.println("El final se acerca, el sol se pone y la cita llega a su fin. Exito o desatre mañana será otro día y en breves habrás terminado el juego.\n" +
                "¿Conseguira " + conr.getName() + " conquistar a " + cono.getName() + "?\n" +
                "Lo averiguaremos en la última escena...");

    }

    private void menuDeRecursos() throws InterruptedException{
        Thread.sleep(3000);
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué recurso quieres usar? \n" +  conr.getRecursos().toString() + " \n" +
                "Para usar uno de ellos teclealo, no importan mayusculas o minisculas");
        String cont = sc.nextLine();
        Thread.sleep(3000);
        if(conr.getRecursos().contains(cont.toUpperCase())){
            int tr = conr.usarRecurso(cont);
            cono.ponKarma(tr);
        }
        else{
            System.out.println("Ese rescurso no existe. Por lista te quedas sin usar recurso en esta escena :v\n");
        }
    }

}
