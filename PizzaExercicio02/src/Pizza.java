import java.util.HashMap;

public class Pizza {
	public static HashMap<String, Integer> ingredientesGastos = new HashMap<>();
	private int quantidadeIngredientes = 0;

	private static void contabilizaIngrediente(String ingrediente) {
		int quantIngredientes = 1;
		if (ingredientesGastos.containsKey(ingrediente)) {
			quantIngredientes += ingredientesGastos.get(ingrediente);
		}
		ingredientesGastos.put(ingrediente, quantIngredientes);
	}

	public void adicionaIngrediente(String ingrediente) {
		quantidadeIngredientes++;
		contabilizaIngrediente(ingrediente);
	}

	public boolean possuiIngredientes() {
		return quantidadeIngredientes > 0;
	}

	public double getPreco() {

		if (quantidadeIngredientes <= 2) {
			return 15;
		} else if (quantidadeIngredientes <= 5) {
			return 20;
		} else {
			return 23;
		}

	}

}
