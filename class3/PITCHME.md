# Interfaces

## Support for Abstraction



---
## Today
1.


---
## Resources
+ 


---
An `interface` contains method **signatures** without implementation.
```java
public interface HelloInterface {
	public void hello();
}
```
It defines a contract that an **implementing** class must fulfill.


---

```java
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
```

```java
public class HelloKitty implements HelloInterface {
	@Override
	public void hello() {
		System.out.println("Hello Kitty!");	
	}
	@Override
	public void goodBye() {
		System.out.println("Miao...");	
	}
}
```


---
+ Write an interface in its own file, like a class.
+ The `@Override` is optional, **but use it**.
  + If the method signature is not exactly the same as in the interface, you will get a warning.
+ It indeed separates the interface from the implementation.
+ Good for specifying requirements.
+ What more?