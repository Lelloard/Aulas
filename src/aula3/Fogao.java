package aula3;

/**
 * Created by Johnathan on 14/02/2017.
 */
public class Fogao {

    private int bocas;
    private int forno;
    private int botoes;
    private boolean eletrico;


    public Fogao(String texto){


        System.out.append(texto);

    }


    public int getBocas() {
        return bocas;
    }

    public void setBocas(int bocas) {
        this.bocas = bocas;
    }

    public int getForno() {
        return forno;
    }

    public void setForno(int forno) {
        this.forno = forno;
    }

    public int getBotoes() {
        return botoes;
    }

    public void setBotoes(int botoes) {
        this.botoes = botoes;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }
}
