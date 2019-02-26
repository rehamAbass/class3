# Interfaces

## Support for Abstraction



---
## Today
1.


---
## Resources
+ 


---
+ An `Interface` contains method **signatures** without implementation.
+ It defines a contract that an **implementing** class must fulfill.
```java
public interface HelloInterface {
	public void hello();
}
```

```java
public class HelloWorld implements HelloInterface {
	@Override
	public void hello() {
		System.out.println("Hello World!");
	}
}

```

```java
public class HelloKitty implements HelloInterface {
	@Override
	public void hello() {
		System.out.println("Hello Kitty!");	
	}
}
```
