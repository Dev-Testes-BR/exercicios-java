package orientacaoAObjetos.classesAtributosMetodosStatic.desafioBill.entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    private double beerPrice = 5.0;
    private double barbecuePrice = 7.0;
    private double softDrinkPrice = 3.0;

    public double cover() {
        if (feeding() > 30) {
            return 0.0;
        }
        else {
            return 4.0;
        }
    }

    public double feeding() {
        return ((double) beer * beerPrice) + ((double) barbecue * barbecuePrice) + ((double) softDrink * softDrinkPrice);
    }

    public double ticket() {
        if (gender == 'F') {
            return 8.0;
        }
        return 10.0;
    }

    public double total() {
        return ticket() + feeding() + cover();
    }
}