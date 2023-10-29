/*
 *Java List vs ArrayList
	*List is an interface whereas ArrayList is the implementation class of List.
 */



//import java.util.ArrayList; // import the ArrayList class
import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();	 //<String> is for type casting purpose 
    													//Where we forcefully specified the list to take only String type datas 
    //cars IS A STRING TYPE ARRAYLIST NOW
    
    Scanner sc=new Scanner(System.in);
    
    //TAKING ArrayList ELEMENTS FROM USER
    System.out.println("Enter 3 cars name to the ArrayList: ");
    for(int i=1;i<=3;i++)	
    {
    	System.out.print(i+". ");
    	String ip=sc.next();
    	cars.add(ip);	//add method to add an element to the ArrayList, we pass the value as the parameter
    }
    
    //ADDING ELEMENTS AT THE END OF THE ArrayList
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("BMW");
    System.out.println(cars);
    
    //ADDING ELEMENT TO A SPECIFIC INDEX
    cars.add(3,"Mazda");
    
    System.out.print ("cars.add(3,Mazda); >> ");
    System.out.println(cars);
    
    //size() METHOD RETURNS NUMBER OF ELEMENTS IN THE ArrayList
    cars.size();
    System.out.println("\nArrayList Length : cars.size() >>"+cars.size());
    
    //get() METHOD TO GET ELEMENT AT A CERTAIN INDEX, INDEX VALUE PASSED AS A PARAMETER OF THE METHOD
    System.out.println("\ncars.get(2) >>"+cars.get(2));	//get(i)METHOD RETURNS THE ELEMENT IN THE LIST AT INDEX i
    	
    //set() IS USE TO REPLACE VALUE AT A PARTICULAR INDEX //set(index,value) //here 4th index element will replace by Honda
    //SET IS USED FOR REPLACING PURPOSE, WHILE ADD IS USED FOR ADDING PURPOSE
    cars.set(4, "Honda");	
    System.out.println("\nAfter cars.set(4, Honda) >>"+cars);
    
    //remove() METHOD IS USE TO REMOVE ELEMENT AT A CERTAIN INDEX FROM THE ArrayList
    cars.remove(4);	
    System.out.println("\nAfter cars.remove(4) >>"+cars);
    
    //remove() METHOD CAN ALSO REMOVE A PARTICULAR ELEMENT FROM THE ArrayList, IN CASE OF DUPLICATES, THE FIRST ITEM WILL BE REMOVED
    cars.remove("Mazda");	
    System.out.println("\nAfter cars.remove(4) >>"+cars);
    
    //SORT AN ArrayList
    Collections.sort(cars);	 //Collections is a class, sort(list1) is a static method of that class
    						//sort method is parameterized, it takes a list as parameter
    System.out.println("\nSorting ArrayList : Collections.sort(cars)  >>"+cars);
     
    //RETURNS AN INTEGER WHICH IS FIRST INDEX OF THE ELEMENT IN THE ArrayList 
    int ind=cars.indexOf("BMW");
    System.out.println ("cars.indexOf(BMW): "+ind);
    
    //RETURNS AN INTEGER WHICH IS LAST INDEX OF THE ELEMENT IN THE ArrayList 
    int ind2=cars.lastIndexOf("BMW");
    System.out.println ("cars.lastIndexOf(BMW): "+ind2);
    
    //RETURNS TRUE IF THE OBJECT IS IN THE ArrayList, ELSE RETURNS FALSE
    boolean flag1=cars.contains("Ford");
    System.out.println ("cars.contains(Ford): "+flag1);
    
    boolean flag2=cars.contains("XCar");
    System.out.println ("cars.contains(XCar): "+flag2);
    
    //MERGING TWO LISTS
     ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));    
     ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("M", "N", "O", "P", "Q"));//CONVERTING ARRAY INTO LIST
     listOne.addAll(listTwo);    //Merge both lists
     System.out.println("listOne.addAll(listTwo) : "+listOne);
    
    
    /*
     *PRINTING OF ARRAY LIST
     */
    
     //TECHNIQUE 1:
     System.out.println ("\nPRINTING OF ARRAY LIST");
     System.out.println(cars);
     
     //TECHNIQUE 2: USING FOR LOOP
     System.out.println ("\nPRINTING OF ARRAY LIST USING FOR LOOP");
     for(int i=0, j=cars.size();i<j;i++)	//FOR AVOIDING REPEATATIVE size() method call and increase performance we initialize j
     {
     	System.out.println ("Index "+i+" Element is : "+cars.get(i));
     }
     
     //TECHNIQUE 2: USING FOR EACH LOOP
     System.out.println ("\nPRINTING OF ARRAY LIST USING FOR EACH LOOP");
     for (String i : cars)
     {
     	System.out.println(i);
     }
    
    //TO REMOVE ALL THE ELEMENTS IN THE ArrayList, USE THE clear() METHOD
    cars.clear();
    
    boolean f3=cars.isEmpty();
    System.out.println ("cars.isEmpty() : "+f3);
    
    
    //CONVERTING AN ARRAY INTO A LIST
    String c[]=new String[]{"\ncar1","car2","car3","car4"};//A STRING TYPE ARRAY WITH MANUAL INPUTS
    List carList=new ArrayList();
    carList= Arrays.asList(c);//CONVERTING AN ARRAY TO A LIST
    System.out.println ("carList : "+carList);    
  }
}


/*
 *
 *_____________________________________________
 *	ARRAYLIST METHODS AND THEIR DESCRIPTION
 *_____________________________________________
 *
 *
 *
void add(int index, E element)	
It is used to insert the specified element at the specified position in a list.

boolean add(E e)	
It is used to append the specified element at the end of a list.

boolean addAll(Collection<? extends E> c)	
It is used to append all of the elements in the specified collection to the end of a list.

boolean addAll(int index, Collection<? extends E> c)	
It is used to append all the elements in the specified collection, starting at the specified position of the list.

void clear()	
It is used to remove all of the elements from this list.

boolean equals(Object o)	
It is used to compare the specified object with the elements of a list.

int hashcode()	
It is used to return the hash code value for a list.

E get(int index)	
It is used to fetch the element from the particular position of the list.

boolean isEmpty()	
It returns true if the list is empty, otherwise false.

int lastIndexOf(Object o)	
It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.

Object[] toArray()	
It is used to return an array containing all of the elements in this list in the correct order.

<T> T[] toArray(T[] a)	
It is used to return an array containing all of the elements in this list in the correct order.

boolean contains(Object o)	
It returns true if the list contains the specified element

boolean containsAll(Collection<?> c)	
It returns true if the list contains all the specified element

int indexOf(Object o)	
It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.

E remove(int index)	
It is used to remove the element present at the specified position in the list.	

boolean remove(Object o)	
It is used to remove the first occurrence of the specified element.	

boolean removeAll(Collection<?> c)	
It is used to remove all the elements from the list.	

void replaceAll(UnaryOperator<E> operator)	
It is used to replace all the elements from the list with the specified element.	

void retainAll(Collection<?> c)	
It is used to retain all the elements in the list that are present in the specified collection.	

E set(int index, E element)	
It is used to replace the specified element in the list, present at the specified position.	

void sort(Comparator<? super E> c)	
It is used to sort the elements of the list on the basis of specified comparator.	

Spliterator<E> spliterator()	
It is used to create spliterator over the elements in a list.	

List<E> subList(int fromIndex, int toIndex)	
It is used to fetch all the elements lies within the given range.	

int size()	
It is used to return the number of elements present in the list.

*/