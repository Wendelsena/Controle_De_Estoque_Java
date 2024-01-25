package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product; // importa a Class (atalho: Ctrl + shift + O)

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Product product = new Product(); // para puxar outras Class -- não funciona devido a criação do construtor.
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine(); // antes product.name para pegar uma variavel em outra class
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt(); 
		Product product = new Product(name, price, quantity); // colocamos depois da leitura dos dados criando variaveis temporarias.
		// contrutor serve para proteger o projeto, obrigando o programador a informar os dados do produto.
		System.out.println();
		product.setName("Televison");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		// product.equals(); --- usado para comparar se dois objetos têm o mesmo conteúdo
		// product.toString(); --- converte um objeto em uma representação de string (para simplifcar a operação de baixo.)
		// ao invés disso -- System.out.println(product.name + ", " + product.price + ", " + product.quantity); -- se sua:
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.printf("Enter the number of products to be addes in stock: ");
		quantity = sc.nextInt();
		product.addProduct(quantity); // faz a atualização dentro do objeto product
		
		System.out.println();
		System.out.printf("Update data: " + product);
		
		System.out.println();
		System.out.printf("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.printf("Update data: " + product);
		
		sc.close();

	}

}
