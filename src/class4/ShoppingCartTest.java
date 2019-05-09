package class4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	// Test Case 1 : Creating a new cart has 0 items.
	@Test
	public void testCreateNewCart() {
		
		// 1. Create a shopping cart
		ShoppingCart cart = new ShoppingCart();
		
		//2. Check how many items are in it.
		int numItems = cart.getItemCount();
		
		//3. Compare your actual with expected.
		assertEquals(0, numItems);
		
	}




	// Test Case 2: An empty cart has 0 items
	@Test
	public void testEmptyCart() {
		// 1. You need a cart
		// 2. Then you need to empty the cart.
		// 3. Then you need to check how many items are in the cart
		//    Expected result = 0
		// 4. Compare expected to actual
		// 5. If expected == actual ===> PASS otherwise FAIL
		
		
		// 1. You need a cart
		ShoppingCart cart = new ShoppingCart();
		
		// 2. Then you need to empty the cart.
		cart.empty();
		
		// 3. Then you need to check how many items are in the cart
		//    Expected result = 0
		int numItems = cart.getItemCount();
		
		// 4. Compare expected to actual
		// 5. If expected == actual ===> PASS otherwise FAIL
		assertEquals(0, numItems);
		
		
	}
	
	
	@Test
	public void testAddItem() {
		// 1. Create a new shopping cart.
		ShoppingCart cart = new ShoppingCart();
		
		// 2. Make sure cart is empty
		cart.empty();
		assertEquals(0, cart.getItemCount());
		
		// 3. Add a new item to cart
		cart.addItem(new Product("Samsung phone", 1000));
		
		// 4. Check how many items are in cart
		int numItems = cart.getItemCount();
		
		// 5. ASSERT --> compare actual to equal
		assertEquals(1, numItems);
	}
	
	
	
	
}
