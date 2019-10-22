package com;

public class Notes {

/*
 * 		Java Collection API
 * 	   ----------------------
 *   
 *   -> java.util package
 *   -> this package contains collection of classes for handling data structures
 *   
 *   
 *   
 *      Collection (Interface)
 *     
 *     1. List interface (Ordered, indexed and duplicates accepted)
 *     2. Set interface  (un-ordered, non indexed and unique objects)
 *       
 *  
 *     List
 *     ------
 *     	-> ArrayList
 *     		-> Index
 *     		-> Ordered
 *     		-> Duplicates
 *     		-> Size increses by halfing the total size
 *     		-> Non Synchronized
 *     		-> Faster , but no security in web applications
 *     	-> Vector  -> Stack extends Vector
 *     		-> Index
 *     		-> Ordered
 *     		-> Duplicates
 *     		-> Size increses by doubling the total size
 *     		-> Synchronized
 *     		-> SLower, but provides good security
 *     	-> LinkedList
 *     		-> Same like ArrayList. Good in searching operations
 *   
 *     
 *     Set
 *     -----
 *     	-> HashSet
 *     	-> LinkedHashset
 *     	-> TreeSet
 *     
 *     Map
 *     ----
 *     	-> HashMap
 *     	-> LinkedhashMap
 *     	-> Hashtable
 *     	-> TreeMap
 *     
 *   //--------------------------------------------
 *   
 *   utility classes
 *   ----------------
 *   	-> Collections
 *   	-> Arrays
 *   	-> Comparator interface
 *   	-> Date 
 *   	-> Calendar
 *   	-> StringTokenizer
 *   
 *     
 *   
 *   What is the difference between Vector & array list?
A) 		1) From the API perspective, the two classes are same.
     	2) Vector is synchronized & array list is not synchronized.
     	Note: - We can make array list also synchronized by using:
		Collections. synchronizedList(new ArrayList( ));
		3) Internally both are hold onto their contents using an array. A vector by default increments its size by doubling it, & on array list increases its size by 50%.
		4) Both are good for retrieving elements from a specific position in the container or for adding & removing elements from the end of the container. All of these operations can be performed in constant time---0(1), but adding & removing elements in the middle takes more time. So in this case a linked list is better.

 	What is the difference between hash table & hash map?
A) 		 1) Hash table is a synchronized, where as hash map is not.
       	Note: - We can make hash map also synchronized by using:
		Collections. synchronizedList(new HashMap( ));
		2) Hash map allows null values as keys & values, where as hash table does not.
		3) That iterator in the hash map is fail-safe, while enumerator for the hash table isn’t.

	What is the difference between a set & list?
A) 		1) Sets represent collection of elements. Lists represent ordered                                                                                                                                                                                                                                                                                         
      	Collection of elements (also called sequence).
      	2) Sets will not allow duplicates values. Lists will allow. 
      	3) Accessing elements by their index is possible in lists.
      	4) Sets will not allow null elements, lists allow null elements.
      	
      	
      	
     StringTokenizer: - The StringTokenizer class is useful to break a string into small piece called tokens.
	1) To crate an object to StringTokenizer
	StringTokenizer st=new StringTokenizer(str,”delimeter”);
	Delimerer means character
	2) To find the next piece in the string
	String piece=st.nextToken( );
	3) To know if more pieces are remaining 
	boolean x=st.hasMoreTokens( );
	4) To know how many no. of piece are there
	int no=st.countTokens( );
The purpose of StringTokenizer is to slices down the tokens into piece.

      	
      	

 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

}
