import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input regex: ");
		String regex = sc.next();
		System.out.print("input string: ");
		String input = sc.next();
		if (input.matches(regex)) {
			System.out.print("valid ");
		} else {
			System.out.print("invalid ");
		}
	}
}
