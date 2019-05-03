package org.matsim.class2019.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {

    public void listExample(){
        System.out.println("List Example: ");

        List<Rectangle> myList = new ArrayList<>();
        myList.add(new Rectangle(10,20));
        myList.add(new Rectangle(10,200));
        myList.add(new Rectangle(10,2));
        myList.add(new Rectangle(10,10));
        myList.add(new Rectangle(10,200000));

        for(Rectangle rect : myList){
            System.out.println("The area is: " + rect.calculateArea());
        }
    }
    public void setExample(){
        System.out.println("\nSet Example: ");
        Set<Rectangle> mySet = new HashSet<>();
        Rectangle rectangleWeWantToTest = new Rectangle (100,100);
        mySet.add(new Rectangle(10,20));
        mySet.add(new Rectangle(10,200));
        mySet.add(new Rectangle(10,2));
        mySet.add(new Rectangle(10,10));
        mySet.add(new Rectangle(10,2000000));

        for(Rectangle rect : mySet){
            System.out.println("The area is: " + rect.calculateArea());
        }
        if (mySet.contains(rectangleWeWantToTest)) {
            System.out.println("The rectangle was contained in the set");
        } else {
            System.out.println("The rectangle was not contained in the set");
        }
    }
    public void sortingAList(){
        System.out.println("\nSorting a List");

        List<Rectangle> myList = new ArrayList<>();
        myList.add(new Rectangle(10,20));
        myList.add(new Rectangle(10,200));
        myList.add(new Rectangle(10,2));
        myList.add(new Rectangle(10,10));
        myList.add(new Rectangle(10,200000));

        System.out.println("Printing the initial order of the List");
        for(Rectangle rect : myList){
            System.out.println("The area is: " + rect.calculateArea());
        }

        myList.sort((rect1, rect2) -> compareRectangles(rect1,rect2));
        System.out.println("\nPrinting the sorted order of the list");
        for(Rectangle rect : myList){
            System.out.println("The area is: " + rect.calculateArea());
        }
    }
    private int compareRectangles(Rectangle rect1, Rectangle rect2){
        if(rect1.calculateArea()<rect2.calculateArea()) return -1;
        else if (rect1.calculateArea()>rect2.calculateArea()) return 1;
        return 0;
    }
    public static void main(String[] args){
        Collection col = new Collection();
        col.listExample();
        col.setExample();
        col.sortingAList();
    }
}

