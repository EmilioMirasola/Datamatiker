package term2.eksamensforberedelse.stack;

public class Validator {
	private final StackI stack;

	public Validator() {
		this.stack = new NodeStack();
	}

	public boolean validateBrackets(String expression) {
		for (char c : expression.toCharArray()) {
			switch (c) {
				//Push onto the stack cause it's an opening bracket
				case '(':
				case '{':
				case '[':
					stack.push(c);
					break;

				//Else check if the popped char on the stack matched the current closing bracket
				case ')':
					if ((char) stack.pop() != '(') {
						return false;
					}
					break;
				case '}':
					if ((char) stack.pop() != '{') {
						return false;
					}
					break;
				case ']':
					if ((char) stack.pop() != '[') {
						return false;
					}
					break;
			}
		}
		return true;
	}
}
