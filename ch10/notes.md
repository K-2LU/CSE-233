# Exception Handling
An __exception__ is an abnormal condition that arises in a code sequence at run time.

An exception is a run-time error.

### Fundamentals
Java exception handling is managed via five keywords: __try, catch, throw, throws, finally__

To manually throw an exception, use the keyword __throw__.       Any code that must be excecuted after a __try__ block completes, put it in a __finally__ block.

### Types
All exceptions are subclass of the built-in class __Throwable__.
There are two branches of __Throwable__: 
* __Exception__: This is the class that is used for catching exceptional conditions and for custom exception types.
*__Error__: These are typically created in response to catastrophic failures that cannot usually be handled by our program.

