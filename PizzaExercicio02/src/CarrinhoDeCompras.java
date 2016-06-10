import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Pizza> pizzas = new ArrayList<>();

	public boolean adicionaPizza(Pizza pizza) {
		if (pizza.possuiIngredientes()) {
			pizzas.add(pizza);
			return true;
		}
		return false;
	}

	public double obtemValorTotal() {
		double valorTotal = 0;
		for (Pizza pizza : pizzas) {
			valorTotal += pizza.getPreco();
		}

		return valorTotal;
	}
}
