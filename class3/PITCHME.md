# Inheritance

## X is a Y


---
## Today
1.


---
## Resources
+ 


---
We can extend an existing classes by defining a **sub-class**.
+ It inherits all of the code and variables of the original class.
+ We can add more.
+ We can also **override** methods.


---?code=class3/src/Bicycle.java&lang=java
A simple class.


---?code=class3/src/MountainBike.java&lang=java
We can think of a `MountainBike` object as having a 
`Bicycle` object within it. 




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




---
Here its all pretty simple.
In subclasses, when calling a method it is more confusing.

MMM. If we teach interfaces first, we cannot use toString, and all the objects methods.
Also, the compareTo example won't work, because we need to compare to each other...
but size() does...