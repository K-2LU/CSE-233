### Java's Automatic Conversions
When one type of data is assigned to another type of variable, an __automatic type conversion__ will take place if the following two conditions are met:
* The two types are compatible
* The destination type is larger than the source type 

### Casting Incompatible Types
To create a conversion between incompatible types we must use a cast (cast is simply an explicit type conversion). General form:
``` java
	(target-type) value
```