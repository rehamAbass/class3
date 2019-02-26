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
### Interfaces
+ Write an interface in its own file, like a class.
+ The `@Override` is optional, **but use it**.
  + If the method signature is not exactly the same as in the interface, it will give you a warning.
+ Interfaces indeed separate the interface from the implementation.
+ Good for specifying requirements.
+ What more?


---
### Can be used as a Variable Type
This is more dramatic then it seems.
```java
HelloInterface h = new HelloWorld();
h.hello();
h.goodbye()
```
+ A variable of type `HelloInterface` can hold the pointer to an instance of any implementing class.
+ The only thing you can do with such a variable is call the methods of the interface. 


---
So this is new:
@box[bg-orange text-white rounded demo-box-pad](A variable of type X may actually hold an object of type Y.)
