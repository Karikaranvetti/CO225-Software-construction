
/* my array list: an array that behaves like a list 
 * E/16/172
 * Lab-04
 */

public class MySet<T/* Can we have any T */> { 

    int nextItem=0; 
    int currentCapacity; 
	T[] data; // DO NOT CHANGE
	T temp;     // temporary T type veriable for storying value 

    private static int defaultSizeToCreate = 10; // how many elements to create 

    public MySet(int elements) { 
	this.nextItem = 0; 
	this.defaultSizeToCreate = elements; 
	this.currentCapacity = elements; 

	this.data = (T[]) new Object[this.defaultSizeToCreate]; 
    }

    public MySet() { 
	this(defaultSizeToCreate); // calling parameter  constrctor thorough  defualt 
    }

    public boolean isEmpty() { return this.nextItem == 0; } 
    public boolean isFull() { return false; /* never get filled */} 

    public boolean add(T item) { 

		for(int i=0;i<this.nextItem;i++){
			if(this.data[i].equals(item)){            // to find duplicate elements
				return false;
			}
		}
		if (this.nextItem<this.currentCapacity-1) {           // is there enough space to add just adding 
			data[this.nextItem] = item;	
		} else {                              // else not enough space then we adding defualt 10 space in array
			this.currentCapacity=this.defaultSizeToCreate+this.currentCapacity;
			T[] NewData = (T[]) new Object[this.currentCapacity];  // creating new T type array and get the date value 
			for(int i=0;i<this.nextItem;i++){
				NewData[i]=this.data[i];
			}
			this.data=NewData;
			data[this.nextItem] = item;
		}
		this.nextItem++;
		data[this.nextItem] = null; // DO NOT CHANGE 
	
	 
	/* if there is any element delete it 
	 * then add the new element. 
	 * How do you handle when the array is full: 
	 * crate a new array with currentCapacity+defaultSizeToCreate, 
	 * copy the old conents into that
	 * Accessing array when full might be a problem
	 */

	/* Add the item to the array if the item is not there */
	return true; // CHANGE ME

    }


    public T remove() { 
	/* remove the first element in the array 
	 * and copy the rest front. 
	 * FIFO structure. 
	 * If the ArrayList is empty return null
	 */
	/* Option 1: */
	if(isEmpty()) return null; 
	// IMPLEMENT THE REST 
	temp =data[0];             // befor removing store the first element for return 
	this.nextItem--;          // geting last element index 
	T[] TempData = (T[]) new Object[this.nextItem];  // removing first element and make 2ed element as first 
	for(int i=0;i<this.nextItem;i++){
		TempData[i]=this.data[i+1];
	}
	this.data=TempData; 
	this.currentCapacity--;        // reduse the current capacity 
	return temp;

	/* Option 2: */
	// if(!isEmpty()) { 
	// 	// IMPLEMENT THE REST
		 
	 
	// }
	// return null;
	// which option is better? why? 
    }


}
	 

	