/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort_driver;

/**
 *
 * @author Gül
 */
public class SelectionSort_Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int SIZE =4;
        Comparable []list = new Comparable[4];
        
        list[3]= new SortableInteger(32);
        list[2]= new SortableInteger(48);
        list[1]= new SortableInteger(2);
        list[0]= new SortableInteger(72);
         System.out.println(" \n Before sorting integer value");
        for(int i=0; i<list.length; i++ ){
            System.out.println(list[i].toString());
        }
        SelectionSorter s = new SelectionSorter(list,SIZE);
        s.sort();
        System.out.println("\n After sorting integer value ");
        for(Comparable a:list){
            System.out.println(a);
    }
    
}}
