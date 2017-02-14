package aula3;

/**
 * Created by Johnathan on 14/02/2017.
 */
public class Ja {




    public  static  void  main (String[] args){

       Fogao fogao = new Fogao("oi_____");


       fogao.setEletrico(false);

       if(fogao.isEletrico() == true){
           System.out.println("esse fogão é eletrico");
       }else {
           System.out.println("esse fogão nao é eletrico");
       }





    }
}
