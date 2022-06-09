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