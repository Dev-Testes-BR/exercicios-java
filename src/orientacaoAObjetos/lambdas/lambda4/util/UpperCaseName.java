package orientacaoAObjetos.lambdas.lambda4.util;

import java.util.function.Function;

import orientacaoAObjetos.lambdas.lambda1.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}
