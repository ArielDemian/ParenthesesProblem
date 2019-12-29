
public class Parentheses {

	public static void main(String[] args) {
		Parentheses p = new Parentheses();
		System.out.println(p.complete("(()"));
		System.out.println(p.complete("))()("));
	}

	public String complete(String input) {
		int c = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				c++;
			} else if (input.charAt(i) == ')') {
				if (c > 0) {
					c--;
				} else {
					input = input.substring(0, i).concat("(").concat(input.substring(i));
					i++;
				}
			} else
				throw new IllegalArgumentException();
		}
		for (; c > 0; c--)
			input = input.concat(")");
		return input;
	}
}