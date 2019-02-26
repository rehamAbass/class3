public class HelloWorld implements HelloInterface {
	@Override
	public void hello() {
		System.out.println("Hello World!");
	}
	@Override
	public void goodBye() {
		System.out.println("Goodbye Everyone!");
	}
}
