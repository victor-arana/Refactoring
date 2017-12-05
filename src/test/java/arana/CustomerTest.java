package arana;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testStatementOneCustomerOneMovieOneDay() {
		String expectedStatement = "Rental Record for Victor\n\tbirdman\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points";

		Customer victor = new Customer("Victor");
		Movie birdman = new Movie("birdman", Movie.REGULAR);
		Rental rental = new Rental(birdman, 1);
		victor.addRental(rental);
		
		String actualStatement = "";
		actualStatement = victor.statement();
		
		assertEquals(expectedStatement, actualStatement);
		
		
	}

}
