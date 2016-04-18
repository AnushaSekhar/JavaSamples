/*Java Legacy classes and Interface
2:35 PM No comments
What are legacy classes and interfaces in Java?

Before Java 1.2 version there is no Collection framework in java, instead java consists of some classes and interfaces to hold the objects those are called Legacy Classes and Interface
Legacy Class :
Dictionary
HashTable
Properties
Stack
Vector
Legacy Interface :
Enumeration
Dictionary :
Dictionary is a abstract class, which holds the data as Key/value pair. It works as Map collection.

The abstract methods and its description that are available in Dictionary class are in below figure.



Dictionary Class

HashTable :

HashTable is a part of java.util package and it is a concrete class which extends the Dictionary class.
In Java 1.2 version on ward HashTable class implemented the Map interface and it is as part of Collection Framework.
HashTable is synchronized.
Properties :

Properties class will hold the set of properties in Key/value pair. Properties class extends HashTable class . This class is thread-safe , multiple threads can share single Properties object without making externally Synchronization.
Stack :

Stack represents the Last-In-First-Out(LIFO). Stack class extends the Vector class.
Vector :

Vector class is a grow-able array and is similar to ArrayList class with two difference. 
Vector is a Synchronized.
Vector is used where programmer didn't have knowledge of what the size of the Array is.It means you can ignore the size of the Vector, even still Vector will work without any exceptions.


Enumeration :

A class that implements Enumeration interface will generate series of elements, one at a time.
This interface is used to enumerate elements of Vector, keys/values of HashTable and properties in the Properties class.
Enumeration operations are duplicated by the Iterator interface and some more operations like remove() etc are added. For new implementations should consider Iterator instead of Enumeration.*/