public class MethodOverloading {
	public static void main(String[] args) {
		Overload Obj = new Overload();
		Obj.demo(10);
		Obj.demo(10, 20);
		double result;
		result = Obj.demo(5.5);
		System.out.println("O/P : " + result);
	}
}