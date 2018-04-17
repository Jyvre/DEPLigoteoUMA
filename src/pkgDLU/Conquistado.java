package pkgDLU;

public class Conquistado {

    private String name;
    private int karma;

    public Conquistado(String nombre){
        name = nombre;
        karma = 5;
    }

    public void quitaKarma(int a){
        karma -= a;
        if(karma <0){
            karma = 0;
        }
    }

    public void ponKarma(int a){
        karma += a;
        if(karma > 10){
            karma = 10;
        }
        else if(karma < 0){
            karma = 0;
        }
    }

    public String solución(){

        String st;

        switch (karma){
            case 0:    st = name + ": Tu lo que eres es gilipollas, vete de aquí o te reviento.";
                        break;
            case 1:    st = name + ": Anoche me follé a tu madre y le gustó";
                        break;
            case 2:    st = name + ": No te soporto";
                        break;
            case 3:    st = name + ": Me agobias, no pienso volver a quedar contigo";
                        break;
            case 4:    st = name + ": Me caes mal";
                        break;
            case 5:    st = name + ": Podemos ser amigos...";
                        break;
            case 6:    st = name + ": Me caes bien, seguro que llegamos a ser buenos amigos";
                         break;
            case 7:    st = name + ": Buah, mi mejor amiga solo puede tener tu nombre";
                        break;
            case 8:    st = name + ": Me gustas mucho, quien sabe si...";
                         break;
            case 9:    st = name + ": Me has enamorado, quiero conocerte mejor";
                        break;
            case 10:    st = name + ": Mi corazón palpita por ti, no me imagino un día sin tus besos";
                        break;
            default:    st = name + ": Se ha roto el juego";
                        break;
        }

        return st;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

}
