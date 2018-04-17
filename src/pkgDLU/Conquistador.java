package pkgDLU;

import java.util.List;

public class Conquistador {

    private String name;
    private int vida, iniVida;
    private List<String> recursos;

    public Conquistador(String nombre, int v, List<String> items){
        name = nombre;
        vida = v;
        iniVida = v;
        recursos = items;
    }

    public void quitarVida(){
        vida--;
    }

    public int usarRecurso(String a){

        recursos.remove(a);
        int ret = 0;
        switch (a){
            case "REGALAR FLOR": System.out.println("Le has impresionado, se acerca más a ti\n");
            ret = 1;
            break;
            case "ESCUPIR EN UN OJO": System.out.println("Tu lo que eres es puta...\n");
            ret = -5;
            break;
            case "COGER DE LA MANO": if(vida == iniVida){
                System.out.println("Un poco pronto, ¿no? Tu plausible amor te mira raro...\n");
                ret = -1;
            }
            else{
                System.out.println("Te la aprieta aun más fuerta, saltan chispas...\n");
                ret = 5;
            }
            break;
            default: System.out.println("Hay un error en el juego");
            break;
        }

        return ret;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public List<String> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<String> recursos) {
        this.recursos = recursos;
    }
}
