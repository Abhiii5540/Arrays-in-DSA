import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no uh wanna search");
		int x = sc.nextInt();
		int f = lSearch(a, x);
		if (f == -1)
			System.out.println("Number not found");
		else
			System.out.println("number found at : " + f);
		sc.close();
	}

	private static int lSearch(int a[], int s) {
		if (a.length == 0) {
			return -1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == s) {
				return i;
			}
		}
		return -1;
	}
}
