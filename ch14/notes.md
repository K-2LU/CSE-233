# Generics
----------------
Through the use of generics, it is possible to create classes, interfaces and methods that will work in a type-safe manner with various kinds of data.

### What are Generics?
A class, interface or method that operates on a parameterized type is called _generic_, as in _generic class_ or _generic method_.
In pre-generics code, generalized classes, interfaces, and methods used __Object__ references to operate on various types of objects.
The probles was that they could not do it with type safety.

Generics expanded out ability to reuse code by, 
* Adding type safety,
* Streamlining the process as all casts are automatics and implicit

The process of removing generic type information is called _erasure_.

#### Generics only work with Reference Types
You cannot use a primitive type, such as __int__ or __char__.

This line of code is illegal
``` java
	Gen <int> intOb = new Gen<int>(99);
```

#### Generic Types Differ based on Their Type Arguments
A reference of one specific verision of a generic type is not compatible with another version of the same generic type.

```java 
	iOb = strOb; // wrong
```

As their arguments differ.

### General form of a Generic Class

Syntax for declaring a generic class:

``` java
	class class-name <type-parameter-list> {}
```

Full syntax for declaring a reference to a generic class instance creation:

```	java
	class-name <type-argument-list> var-name =
		new class-name <type-argument-list> (cons-argument-list);
```