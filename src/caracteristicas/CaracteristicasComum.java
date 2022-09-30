package caracteristicas;

public class CaracteristicasComum {

    protected String nome;
    protected float vida;
    protected int xp;

    public CaracteristicasComum(String nome, float vida, int xp) {
        this.nome = nome;
        this.vida = vida;
        this.xp = xp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
}
