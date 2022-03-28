package com.java.bridgelabs;

import java.util.Hashtable;

public class HashTable
{
    public static void main(String[] args) {
        Hashtable< String,Integer > pincode = new Hashtable<>();// Created Hashtable

        // Adding the  City names and Pin-Code to hashtable
        pincode.put("Charoli",412105);
        pincode.put("palus", 416310);
        pincode.put("sangli",415201);
        pincode.put("Bhandara",411904);
        pincode.put("Nagpur",42045);
        pincode.put("Miraj",413456);
        pincode.put("Mumbai",418932);
        System.out.println("City of Pin-code : \n"+pincode);
        System.out.println();

        System.out.println("===========================================================================");
        pincode.remove("palus");
        System.out.println("Removing Key and Value :");
        System.out.println(pincode);
        System.out.println("===========================================================================");
        System.out.println();

        // Check Key Exist or not in Hash Table
        if(pincode.containsKey("Sangli"))
        {
            System.out.println("Key exist in Table");
        }
        else
        {
            System.out.println("Key exist in Table");
        }

        System.out.println("===========================================================================");
        System.out.println();

        // Check  Value Exist or not in Hash Table
        if(pincode.containsValue(412103))
        {
            System.out.println("Value Exist in Table");
        }
        else
        {
            System.out.println("Value Exist in Table");
        }

        System.out.println("===========================================================================");
        System.out.println();

         // Check Size of Hash Table
        System.out.println("Size of Hash Table: " + pincode.size());

    }
}
