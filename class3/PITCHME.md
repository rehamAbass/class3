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
@box[rounded](Why does `MountainBike` use `getSpeed()` and not directly use `speed`?)

+ Recall the access rules for class members,
  + `public`:  from anywhere.
  + `private`: only from within the class.
  + default (package-private): from anywhere within the same package.
  + `protected`: like default, and from subclasses of other packages as well.



---?code=class3/src/Employee.java&lang=java
Another example.



---?code=class3/src/CommissionEmployee.java&lang=java
@[1-13](Use `super` to call a constructor of the superclass.) 
@[15-19](Overriding a method.)


---
## Overriding Methods
+ The way to change the behavior inherited from the superclass.
+ use the `@Override`...


---
To access the overridden method (the original one), use the `super` keyword.
For example: 
```java
@Override 
public double earnsInYear() {
	return commission * sales + super.earnsInYear();
}
```
There is no direct way to access the ''grandmother'', `super.super` does not work.




---
What will this print?
```java
CommissionEmployee e = 
	new CommissionEmployee("Greg", 100, 0.1);
e.setSales(1000);
System.out.println(e);
```
@css[fragment](1300, because the superclass `toString()`, calls the subclass `earnsInYear()`.)


---

@box[rounded](Think of the subclass as taking all the **code** of the superclass and rewriting some of the methods)

*Except private members cannot be accessed in new code...*



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



