/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectionsort_driver;

/**
 *
 * @author Gül
 */
public class SelectionSorter {
   private Comparable [] theArray;
   private int size;

   //  public Sorter ( Sortable [] array, int size ) { // constructor 
  public SelectionSorter ( Comparable [] array, int size ) { // constructor
      this.size = size;
      theArray = array; // we don't want to mae a copy of the array
			// because we want the changes to be visible to outside.
   }

   // The method sort implements selectionsort
   
   public void sort() {
       int j;
       int last;
       Comparable temp;
       for( j=0; j<size-1;j++){
           last=j;
           for( int scan= j+1; scan<size;scan++)
               if( theArray[scan].compareTo(theArray[last]))
                   last=scan;
           temp= theArray[last];
           theArray[last]= theArray[j];
           theArray[j]= temp;
               
           
       }
     /* int j, k;
      int last;
      //Sortable temp;
      Comparable temp;
      boolean swapped;
      
      for (j = 0 ; j <= size - 2 ; j++) // Make listSize - 1 passes.
	{
	    last = size - j;
	    swapped = false;
	    // Swap elements in the theArray[0 .. last - 1] so largest 
	    // is in theArray[last-1].
	    for (k = 0 ; k <= last - 2 ; k++) // Handle each pair.
	    {
		// list [k] contains the largest element in list [0 .. k]
		// Swap pair  (k, k + 1) if out of order.
		 //if (theArray[k+1].lessThan(theArray [k]) )
		if (theArray[k+1].compareTo(j) )
		{
		    // Swap theArray [k] and theArray [k + 1]
		    temp = theArray [k];
		    theArray [k] = theArray [k + 1];
		    theArray [k + 1] = temp;
		    swapped = true;
		}
	    }
	    
	    //if no swaps were made, theArray is already sorted
	    if (! swapped)
		return;
	}   */
   }
}
