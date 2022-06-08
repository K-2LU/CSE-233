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