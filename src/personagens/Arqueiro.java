package personagens;

import caracteristicas.*;

public class Arqueiro extends CaracteristicasComum {

    protected float velocidade;
    protected float dano;

    public Arqueiro(float velocidade, float dano, String nome, float vida, int xp) {
        super(nome, vida, xp);
        this.velocidade = velocidade;
        this.dano = dano;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getDano() {
        return dano;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public String ataque(String ataque) {
        return "O Arqueiro lançou a sua flecha";
    }

    public void ataque(float ataque) {
        this.dano =+ 5;
        this.xp =+ 10;
        System.out.println(this.nome + " atacou o inimigo com a sua flecha : " + this.dano + " XP atual: " + this.xp);
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
            this.vida = this.vida + restauraVida;
            System.out.println(this.nome + " Restaura a vida. Vida atual= " + this.vida);
        }
        return vida;
    }

    public void morrer() {
        if (vida == 0) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("O JOGO CONTINUA");
        }
    }

    @Override
    public String toString() {
        return "{Nome: " + this.nome + 
                " \nVida: " + this.vida + 
                " \nNível de experiência: " + this.xp + 
                " \nVelocidade: " + this.velocidade + 
                " \nDano: " + this.dano + "}";
    }
}
