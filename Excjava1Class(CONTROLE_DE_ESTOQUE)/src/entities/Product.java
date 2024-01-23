package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) { // this. para mostrar que quero o valor quantity de cima.
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) { 
		this.quantity -= quantity;
	}
	
	public String toString() { // com isso sobreponho a operação de um String padrão.
		// esta exibindo os dados em lista.
		return name
		+ ", $ "
		+ String.format("%.2f", price) // declara um formato para o valor preço, nesse caso, com 2 números dps da vírgula.
		+ ", "
		+ quantity
		+ " units, total: $ "
		+ totalValueInStock();
		
	}
}
