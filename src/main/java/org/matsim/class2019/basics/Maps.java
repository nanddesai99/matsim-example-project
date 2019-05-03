package org.matsim.class2019.basics;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public void mapExample() {
        Map<String, Rectangle> myMap= new HashMap<>();
        myMap.put("first", new Rectangle(10,10));
        myMap.put("second", new Rectangle(20,20));
        myMap.put("third", new Rectangle(30,30));
        myMap.put("small", new Rectangle(1,1));
        myMap.put("large", new Rectangle(1000,1000));

        System.out.println("Iterate through the map values."); //Unordered pairs
        for(Rectangle rect: myMap.values()){
            System.out.println("The area of the rectangle is: " + rect.calculateArea());
        }

        System.out.println("\nIterate over map keys."); //Unordered as well
        for(String key: myMap.keySet()){
            System.out.println("The key is: " + key);
        }

        System.out.println("\nIterate over key-value pairs: ");
        for(Map.Entry<String, Rectangle> entry: myMap.entrySet()){
            System.out.println("The key is: " + entry.getKey() + " and the area of the rectangle is: " + entry.getValue().calculateArea());
        }

        //Maps can be searched with certain keywords
        if(myMap.containsKey("small")){
            Rectangle smallRect = myMap.get("small");
            System.out.println("\nThe small rectangle was contained and its area is: " + smallRect.calculateArea());
        } else{
            System.out.println("\nThere is no small rectangle.");
        }
    }

    public static void main (String[] args){
        Maps map = new Maps();
        map.mapExample();
    }
}
