# Java playground
A repository for me to experiment with Java frameworks and Proof-of-Concepts. 

## 1. Hibernate (in hibernate folder)
Learning on how to use Hibernate. Implemented using 3 approaches (Reading annotation config file, reading, reading pojo config file and properties configuration)  Classes are implemented in 2 ways (ordinary POJO and with annotations). Class mapping file (for nomal POJO), configuration files (for POJO and annotation approaches) and a utility file are created. 

## 2. HelloWorld
Experiment with debugger

## 3. Multithreading 
Implementation of threads implementing runnable interface and extending Thread class. Multithreading allows task to be run in parallel. 

## 4. Exception handling
Handling a customised exception with a try-catch

## 5. Future
For handling asynchronous computations. Programme implement ForkJoinTask/ForkJoinPool, Executors.newSingleThreadExecutor() and Executors.newFixedThreadPool(int threadSize);

## 6. Base64
Implementation of base64 encoding and decoding using a text input

## 7. Generics
Java generics allow you to write classes, interfaces, and methods that operate on types specified by the user, providing type safety at compile time without the need for explicit casting. There are 2 files, one displaying a simple generic Box and another with a generic implementation of List Collection. 

## 8. Nested
Implementation demonstrating two types of nested classes, Inner class and StaticNested class. 
Static Nested Class: Defined with the static keyword. It can be instantiated without an instance of the outer class and can access the static members of the outer class.
Inner Class: An instance of the inner class is tied to an instance of the outer class. It can access all members (including private) of the outer class.

## 9. CompletableFuture
Java's CompletableFuture is part of the java.util.concurrent package and provides a powerful framework for asynchronous programming. It allows the writing of non-blocking, parallel, and reactive code.