package asg09;

public class TestPair {
	public static void main(String[] args) {
		Pair<String> str = new Pair<String> ("First", "Second");
		System.out.println(str);
		Pair<Integer> ing = new Pair<Integer> (1, 2);
		System.out.println(ing);
	}
}
