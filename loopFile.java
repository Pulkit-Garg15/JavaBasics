public class ForLoop {

	public static void main(String[] args) {
		int fac = 1;
		int n = 5; 
		for (int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
	}
}
