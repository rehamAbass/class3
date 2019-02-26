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


---?code=class3/src/HelloWorld.java&lang=java
This class implements our interface. 


---?code=class3/src/HelloKitty.java&lang=java
So does this class. 

---
+ Write an interface in its own file, like a class.
+ The `@Override` is optional, **but use it**.
  + If the method signature is not exactly the same as in the interface, you will get a warning.
+ It indeed separates the interface from the implementation.
+ Good for specifying requirements.
+ What more?