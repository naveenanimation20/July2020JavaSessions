package JavaSessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		AmazonTest at = new AmazonTest();
		at.login()
		.goToHomePage()
		.search("Laptop")
		.addToCart()
		.checkOut()
		.doPayment("1212121")
		.getOrder();
		
		AmazonTest at1 = new AmazonTest();
		at1.login()
			.checkOut()
				.doPayment("22222")
					.getOrder();


	}

	public AmazonTest login() {
		System.out.println("login");
		return this;
	}

	public AmazonTest goToHomePage() {
		System.out.println("goto home page");
		return this;

	}

	public AmazonTest search(String name) {
		System.out.println("seach the product" + name);
		return this;

	}

	public AmazonTest addToCart() {
		System.out.println("add to cart");
		return this;

	}

	public AmazonTest checkOut() {
		System.out.println("checkout");
		return this;

	}

	public AmazonTest doPayment(String CC) {
		System.out.println("make the final payment with " + CC);
		return this;

	}

	public AmazonTest getOrder() {
		System.out.println("your order id is : " + 12345);
		return this;

	}

}
