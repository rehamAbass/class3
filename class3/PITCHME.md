# Inheritance

## sub & super classes

---
## Today
1. Inheritance.
  + subclasses and superclasses.
1. Overriding methods.
1. The `super` keyword.
1. `Object` as the superclass of all Java classes.

---
## Resources
+ Chapter 9 of the Deitel.
+ [Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)



---
![](class3/resources/umlExample.png)

A UML diagram demonstrating inheritance.


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
We can think of `MountainBike` as having all the code of `Bicycle` for free.


---
## UML diagram
@img[span-75](class3/resources/bikes.png)


---?code=class3/src/MainForMountainBike.java&lang=java
It works!

But why does `MountainBike` use `getSpeed()` and not directly use `speed`?



---
@box[rounded](private members of the superclass are **hidden** in the subclass.)

Recall the access rules for class members,
+ `public`:  from anywhere.
+ `private`: only from within the class.
+ default (package-private): from anywhere within the same package.
+ `protected`: like default, and from subclasses of other packages as well.





---?code=class3/src/Employee.java&lang=java
A simple `Employee` class. 
Notice that `monthlySalary` is protected.

---
### `CommissionEmployee`
+ Gets a monthly salary (like `Employee`),
+ and a **commission** on his sales.
  + If he sold for *x* dollars, and his commission is *p*, then 
    he gets an extra *xp* dollars.

We can write a new class, but its will duplicate a lot of code.



---?code=class3/src/CommissionEmployee.java&lang=java
@[1-13](Use `super` to call a constructor of the superclass.) 
@[15-19](Overriding a method.)



---
@img[span-75](class3/resources/employees.png)

Note how we denote `private`, `public` and `protected` members.




---
What will this print?
```java
CommissionEmployee e = 
	new CommissionEmployee("Greg", 100, 0.1);
e.setSales(1000);
System.out.println(e.earnsInYear());
System.out.println(e);
```
Remember that `toString` is from `Employee`, and was not overridden..

@css[fragment]("1300", and then "Greg earns 1300", correctly!)


---
The superclass's  `toString()` calls the new `earnsInYear()`.

@box[rounded](Think of the subclass as taking all the **code** of the superclass and rewriting some of the methods)

@css[fragment](*Except private members are hidden from the new code...*)


---
## Overriding Methods
The way to change the behavior inherited from the superclass.

+ The `@Override` decorator is optional,
  + If the **signature** of the method does not match any method from 
    the superclass it gives a warning.
  + So use it!




---
## `super`
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
+ For now, always put a `super` call as the first line of a constructor.



---?code=class3/src/SortedArray1.java&lang=java
@[1-10](Constructor just copies the array.)
@[12-19](Insertion sort (do you know it?).)
@[21-24](recall the static method `toString` of class `Arrays`.)



---?code=class3/src/MainForSortedArray1.java&lang=java

Next, we would like to associate with each number in the array a name. For example:


---?code=class3/src/MainForNamedSortedArray.java&lang=java

Sorting is done according to the numbers, and the strings follow the same new ordering.


---
## The problem
+ Let's make a subclass `NamedSortedArray` of `SortedArray`.
+ Constructor takes the int array and names array.
+ Overriding `sort` forces us to write the whole algorithm again.
  + Imagine this is a very complex sorting algorithm...

How can we solve this?


---?code=class3/src/SortedArray.java&lang=java
@[12-22]
We extract a method for swapping, and will only override it!



---?code=class3/src/NamedSortedArray.java&lang=java
@[1-11](Use `super` constructor, and handle new stuff.)


---
@img[span-75](class3/resources/arrays.png)


---?code=class3/src/MainForNamedSortedArray.java&lang=java



---
Every class is a subclass of the java class `Object`.
+ So, every class inherits all of `Object`'s methods.
  + `String toString()`, writes ClassName@id.
  + `boolean equals(Object obj)`, checks if `this == obj`.
  + `Class getClass()`, returns an instance of the `Class` of the object.
    + `x.getClass().getName()` returns the name of `x`'s class.
  + more..



