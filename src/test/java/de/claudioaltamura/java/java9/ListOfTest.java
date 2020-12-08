package de.claudioaltamura.java.java9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ListOfTest {

	@Test
	void test() {
		List<String> pasta = List.of("Spaghetti", "Linguine", "Farfalle");

		assertEquals(3, pasta.size());
	}

}
