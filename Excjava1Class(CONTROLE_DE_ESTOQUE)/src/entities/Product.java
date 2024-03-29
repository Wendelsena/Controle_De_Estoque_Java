package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	// contrutores é uma operação especial da classe, que executa no momento da instanciação do objeto.
	public Product(String name, double price, int quantity) { 	
		this.name = name; // this faz referencia ao proprio objeto diferenciado do parametro.
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
		this.name = name; // 
		this.price = price;
	}
	
	public String getName() {
		return name;
	} 
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQuantity() { // apenas get para proteger a quantidade.
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) { 
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) { //removendo produto usando a quantidade como argumento.
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
