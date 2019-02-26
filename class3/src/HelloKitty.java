public class HelloKitty implements HelloInterface {
	String name;
	
	public HelloKitty(String name) {
		this.name = name;
	}
	@Override
	public void hello() {
		System.out.println("Hello Kitty!");	
	}
	@Override
	public void goodbye() {
		System.out.println("Miao...");	
	}
}
