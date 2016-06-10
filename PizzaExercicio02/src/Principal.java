import java.util.Map;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		Pizza quatroQueijos = new Pizza();
		Pizza frangoComCatupiry = new Pizza();
		Pizza vegetariana = new Pizza();
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		quatroQueijos.adicionaIngrediente("parmesão");
		quatroQueijos.adicionaIngrediente("muçarela");
		quatroQueijos.adicionaIngrediente("catupiry");
		quatroQueijos.adicionaIngrediente("provolone");
		
		frangoComCatupiry.adicionaIngrediente("frango");
		frangoComCatupiry.adicionaIngrediente("catupiry");

		vegetariana.adicionaIngrediente("tomate");
		vegetariana.adicionaIngrediente("alface");

		carrinhoDeCompras.adicionaPizza(quatroQueijos);
		carrinhoDeCompras.adicionaPizza(frangoComCatupiry);
		carrinhoDeCompras.adicionaPizza(vegetariana);

		System.out.println("Total: " + carrinhoDeCompras.obtemValorTotal());

		for (Entry<String, Integer> ingrediente : Pizza.ingredientesGastos.entrySet()) {
			System.out.println("Ingrediente " + ingrediente.getKey() + " foi usado " + ingrediente.getValue());
		}

	}

}
