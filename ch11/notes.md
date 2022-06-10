## Chapter 11
### Multithreaded Programming
-----------

__A multithreaded program__ contains __two or more parts__ that can run __concurrently__. Each part of such a program is called a __thread__, and each thread defines a separate path of execution. __Multithreading__ is a specialized form of __multitasking__.   

__Two__ distinct types of multitasking:
* process-based 
* thread-based

__Process-based:__   A process is, in essence, a program that is executing. Process based multitasking is the feature that allows a computer to run two or more programs concurrently. In p-b multitasking a program is the smallest unit of code that can be dispatched by the _scheduler_.    

__Thread-based:__   In a thread based environment, a thread is the smallest unit of dispatchable code. This means, a single program can perform two or more tasks simultaneously.

Java programs make use of process-based multitasking environments, p-b multitasking is not under Java's direct control. However, multithreaded multitasking is.

### The Java Thread Model

Java uses threads to enable the entire environment to be asynchronous.  This helps reduce inefficiency by preventing the waste of CPU cycles.

Single threaded systems use _event loop with polling_. In this model A single thread of control runs an infinite
loop, polling a single event queue to decide what to do next. In a single-threaded environment, when a thread blocks because it is waiting for
some resource, the entire program stops running.           
             
The benefit of Java's multithreading is that the main loop/polling mechanism is eliminated. One thread can pause without stopping other parts of
a program. When a thread blocks in a Java program, only the single thread that is blocked pauses.
            

### Thread Class and Runnable interface

Java's multithreading system is build upon the __Thread__ class, it's methods, and its companion interface, __Runnable__.
To create a new thread, our program will either extend __Thread__ or implement the __Runnable__ interface.

| Method | Meaning |
|------|--------|
| getName() | Obtain a thread's name |
| getPriority() | Obtain a thread's priority |
| isAlive() | Determine if a thread is still running |
| join() | Wait for a thread to terminate |
| run() | Entry point for the thread |
| sleep() | Suspend a thread for a period of time |
| start() | Start a thread by calling its run method |

__Thread group:__ A _thread group_ is a data structure that controls the state of a collection of threads as a whole.

__sleep() method general form:__(specified in miliseconds)          
``` java
	static void sleep(long miliseconds) throws InterruptedException
```

__sleep() method second form:__(specified in miliseconds and nanoseconds)          
``` java
	static void sleep(long miliseconds, int nanoseconds) throws 
	InterruptedException
```

### Creating a Thread
---------------
In general sense, we will create a thread by instantiating an object of type Thread.
This can be accomplished by:          
* implement the __Runnable__ interface
* extend the __Thread__ class

#### Implementing Runnable
The easiest way to create a thread is to create a class that implements the __Runnable__ interface.

To implement Runnable, a class need only implement a single method called __run()__,

``` java 
	public void run()
```

__run()__ establishes the entry point for another, concurrent thread of execution within a program.

#### Extending Thread
Another way of creating a thread is creating a new class, extending __Thread__, creating a new instance of that class and overriding the run() method.

#### Choosing an approach
If you will not be overriding any of Thread's methods(other than __run()__), it is best to implement __Runnable__.

By implementing __Runnable__ the thread class does not need to inherit __Thread__, making it free to inherit a different class.

### using isAlive() and join()
There are two ways to determine wheter a thread has finished or not. 

First, __isAlive()__ method. General form: 
``` java
	final boolean isAlive()
```
__isAlive()__ returns __true__ if the thread is still running, otherwise it returns __false__.

And, there is __join()__ method:
``` java
	final void join() throws InterruptedException
```
This method waits until the thread on which it is called terminates.

### Thread Priorities
Thread priorities are used by the thread scheduler to decide when each thread should be allowed to run.

To set a thread's priority, use __setPriority()__ method, which is a member of __Thread__.

General form:
```	java
final void setPriority (int level)
```
level specifies the priority setting for the calling thread. The valuse of _label_ must be within range of MIN_PRIORITY (1) and MAX_PRIORITY (10).
And default priority NORM_PRIORITY is 5. These priorities are defined as __static final__ variables within __Thread__.