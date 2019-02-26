# Interfaces

## Support for Abstraction



---
## Today
1.


---
## Resources
+ 


---
An `Interface` contains method **signatures** without implementation.
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


---
