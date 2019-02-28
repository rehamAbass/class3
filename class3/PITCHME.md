# Inheritance

## sub & super classes

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
    + Best for letting subclasses access. 


---?code=class3/src/Employee.java&lang=java
@[1-14](A simple `Employee` class.)
@[15-18](Notice that `toString` calls `earnsInYear`. This will be important later...)


---
### `CommisionEmployee`
An employee that 
+ Gets a monthly salary (like `Employee`).
+ and a **commission** on his sales.
  + If he sold for *x* dollars, and his commission is *p*, then 
    he gets an extra *xp* dollars.

We can write a new class, but its will duplicate a lot of code.

---?code=class3/src/CommissionEmployee.java&lang=java
@[1-13](Use `super` to call a constructor of the superclass.) 
@[15-19](Overriding a method.)


---
## Overriding Methods
+ The way to change the behavior inherited from the superclass.
+ use the `@Override`...





---
What will this print?
```java
CommissionEmployee e = 
	new CommissionEmployee("Greg", 100, 0.1);
e.setSales(1000);
System.out.println(e);
```
@css[fragment](1300)



---
The superclass's  `toString()` calls the new `earnsInYear()`.

@box[rounded](Think of the subclass as taking all the **code** of the superclass and rewriting some of the methods)

@css[fragment](*Except private members cannot be accessed in new code...*)


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



