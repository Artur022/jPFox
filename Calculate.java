public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Hello world!!!");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);

		int res = first + second;
		System.out.println("res (+) " + res);

		res = first/second;
		System.out.println("res (/) " + res);

		res = first%second;
		System.out.println("res (%) " + res);

		res = first*second;
		System.out.println("res (*) " + res);

		res = (int)Math.pow(first,second);
		System.out.println("res (^ "+second +") " + res);
	}
}