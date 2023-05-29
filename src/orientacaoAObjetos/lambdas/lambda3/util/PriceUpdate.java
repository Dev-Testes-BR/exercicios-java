package orientacaoAObjetos.lambdas.lambda3.util;

import java.util.function.Consumer;

import orientacaoAObjetos.lambdas.lambda1.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
