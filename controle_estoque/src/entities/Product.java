package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {  //CALCULA O VALOR TOTAL DO ESTOQUE
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
		
	}
	
	public void removeProducts (int quantity) { // REMOVE ITEM DO ESTOQUE
		this.quantity -= quantity;
	}
	
	public String toString() {  //SOBREPOSSIÇÃO DA FUNÇÃO TOSTRING JÁ EXISTENTE
		return name
			+ ", $"
			+ String.format("%.2f", price)  // FORMATA A STRING E COLOCA 2 CASAS DECIMAIS NO RESULTADO
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
