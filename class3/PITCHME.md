# Inheritance

## X is a Y


---
## Today
1.


---
## Resources
+ 



---
![](class3/umlExample.png)

A sample UML diagram demonstrating inheritance.


---
### Subclasses
+ We can extend an existing class by defining a subclass.
  + also called a *derived* class.
+ It inherits all of the code and variables of the original class.
+ Can add more.
+ Can also **override** methods.
+ the original class is called the **superclass** of the new class.


---?code=class3/src/Bicycle.java&lang=java
A simple class.


---?code=class3/src/MountainBike.java&lang=java
We can think of a `MountainBike` object as having a 
`Bicycle` object within it. 


---?code=class3/src/MainForMountainBike.java&lang=java
It works!


---
+ Private members of the superclass cannot be accessed!
  + `MountainBike` cannot access `speed` directly.
  + So it uses the public `getSpeed` of `Bicycle`.
+ Recall the access rules for class members:
  + `public`  from anywhere.
  + `private` only from within the class.
  + default (package-private), from anywhere within the same package
  + `protected` like default, plus subclasses from other packages as well.


---
### Constructors
+ Constructors of the superclass are not constructors of the subclass.
  + `super(...)` calls a constructor of the superclass.
  + Must appear as the **first line** in the constructor!
+ If no `super` constructor call, then java invisibly adds `super()` 
as a first line.
  + unless first line is a `this` constructor call...
  
---
### Example:
```java
public class Building {
    Building() { System.out.print("b "); }
    Building(String name) {
		this(); 
		System.out.print("bn " + name);
    }
}```
```java
public class House extends Building {
	House() { System.out.print("h "); }
	House(String name) {
		this(); 
		System.out.print("hn " + name);
	}
}
```
What will `new House("x ")` print?

---?code=class3/src/Employee.java&lang=java



