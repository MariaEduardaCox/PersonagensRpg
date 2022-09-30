package personagens;

import caracteristicas.*;

public class Mago extends CaracteristicasComum {

    protected float poderMagia;
    protected float poderCura;
    protected float dano;

    public Mago(float poderMagia, float poderCura, float dano, String nome, float vida, int xp) {
        super(nome, vida, xp);
        this.poderMagia = poderMagia;
        this.poderCura = poderCura;
        this.dano = dano;
    }

    public float getPoderMagia() {
        return poderMagia;
    }

    public void setPoderMagia(float poderMagia) {
        this.poderMagia = poderMagia;
    }

    public float getPoderCura() {
        return poderCura;
    }

    public void setPoderCura(float poderCura) {
        this.poderCura = poderCura;
    }

    public float getDano() {
        return dano;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public String ataque(String ataque) {
        return "O Mago enfeitiçou com a sua magia";
    }

    public void ataque(int ataque) {
        this.dano =+5;
        this.xp =+ 10;
        System.out.println(this.nome + " atacou o inimigo com a sua magia : " + this.dano + " XP atual: " + this.xp);
    }

    public void sofrerAtaque(float sofrerAtaque) {
        this.vida =- sofrerAtaque;
        if (this.vida <= 0) {
            morrer();
        }
        System.out.println(this.nome + " Recebe um ataque e sua vida atual é: " + this.vida);
    }

    public float restauraVida(float restauraVida) {
        if (this.vida <= 0) {
            morrer();
        } else {
            this.vida = +restauraVida;
            System.out.println(this.nome + " Restaura a vida. Vida atual: " + this.vida);
        }
        return vida;
    }

    public void morrer() {
        if (vida <= 0) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("O JOGO CONTINUA");
        }
    }

    @Override
    public String toString() {
        return "{Nome: " + this.nome + 
                "  \nVida: " + this.vida + 
                " \nNível de experiência: " + this.xp + 
                " \nPoder de magia: " + this.poderMagia + 
                " \nPoder de cura: " + this.poderCura + 
                " \nDano: " + this.dano + "}";
    }

}
