package orientacaoAObjetos.construtoresThisSobrecargaEncapsolamento.desafioCombate.entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion() {
    }

    public Champion(String name, int life, int attack, int armor) {
        super();
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion other) {

        if (other.getAttack() < this.getArmor()) {
            this.life --;
        }
        else {
            this.life -= other.getAttack() - this.getArmor();
        }
    }

    public String status() {

        if (getLife() < 0) {
            setLife(0);
        }

        if (getLife() > 0) {
            return getName()
                    + ": "
                    + getLife()
                    + " de vida";
        }
        else {
            return getName()
                    + ": "
                    + getLife()
                    + " de vida (morreu)";
        }

    }
}