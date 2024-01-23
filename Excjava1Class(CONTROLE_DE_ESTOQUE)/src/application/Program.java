package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product; // importa a Class (atalho: Ctrl + shift + O)

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product(); // para puxar outras Class
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine(); // para pegar uma variavel em outra class
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		// product.equals(); --- usado para comparar se dois objetos têm o mesmo conteúdo
		// product.toString(); --- converte um objeto em uma representação de string (para simplifcar a operação de baixo.)
		// ao invés disso -- System.out.println(product.name + ", " + product.price + ", " + product.quantity); -- se sua:
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.printf("Enter the number of products to be addes in stock: ");
		int quantity = sc.nextInt();
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
