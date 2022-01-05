package term2.eksamensforberedelse.stack;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {
	@Test
	@Order(1)
	void test_validate_brackets() {
		Validator validator = new Validator();
		String exp1 = "({[]})";
		assertTrue(validator.validateBrackets(exp1));

		String exp2 = "(}){][";
		assertFalse(validator.validateBrackets(exp2));

		String exp3 = "3(*2mf)fjfs{49}[][]terst({})";
		assertTrue(validator.validateBrackets(exp3));
	}
}
