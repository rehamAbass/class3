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
+ private members are not inherited!
  + MountainBike cannot access `speed` directly.
  + So it uses the public method `getSpeed` of `Bicycle`.
+ Constructors are not inherited.
  + `super` lets us call the constructor of the superclass.
  + Must appear as the first line!


---?code=class3/src/Employee.java&lang=java



