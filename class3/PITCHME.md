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
  + So it uses the public method `getSpeed` of `Bicycle`.
+ A subclass can directly access and use methods and variables according to::
  + `private` cannot be accessed at all.
  + `public` and `protected` can.
  + default (package-private), can be accessed if the subclass is in 
  the same package as the superclass. 



---
+ Constructors are not inherited.
  + `super` lets us call the constructor of the superclass.
  + Must appear as the first line in a new constructor!
+ If no `super` constructor call, then java invisibly adds `super()` 
as a first line.
  + unless first line is a `this` constructor call...
  
---
Question:
```java
public class Building {
    Building() { System.out.print("b "); }
    Building(String name) {
		this(); 
		System.out.print("bn " + name);
    }
}
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



