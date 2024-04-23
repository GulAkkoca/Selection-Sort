/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectionsort_driver;

/**
 *
 * @author Gül
 */
public class SortableInteger implements Comparable {
  private int value;
    
   /* public SortableInteger(){
        value=0;
    }*/
public SortableInteger( int value){
    this.value=value;
}
    
public int getValue(){
    return value;
}
    @Override
    public boolean compareTo(Object other) {
        if( other== null){
            System.out.println(" Error: the object is null");
         System.exit(0);}
    if ( other instanceof SortableInteger){
        SortableInteger othrInt=(SortableInteger)other;
        
    return this.value<othrInt.getValue();
         } return false;}

    @Override
    public String toString() {
        return "SortableInteger{" + "value=" + value + '}';
    }   

   
}
