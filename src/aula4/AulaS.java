package aula4;

/**
 * Created by Johnathan on 14/02/2017.
 */
public class AulaS {

    private int numero = 5;


    public AulaS() {


        switch (numero){
            case 1 :
                System.out.println(11);
                break;
            case 2 :
                System.out.println(12);
                break;
            case 3 :
                System.out.println(13);
                break;
            case 4 :
                System.out.println(14);
                break;
            case 5 :
                System.out.println(15);
                break;
            case 6 :
                System.out.println(16);
                break;
        }

    }

    public static void main (String[] args){
       AulaS aulaS =  new AulaS();
    }
}
