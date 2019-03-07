package com.hackerrank.practice;
import java.util.*;
import java.io.*;

class HashMapSample{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
  	HashMap<String, Integer> map=new HashMap<String, Integer>();

      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          map.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
      try
      {
          int phone=map.get(s);
          System.out.println(s+"="+phone);
      }
      catch(Exception e)
      {
    	  System.out.println("Not Found");
      }
      finally
      {
    	  
      }
      
      
      /*if(phone<0)
    	  System.out.println("Not Found");
      else
    	  System.out.println(s+"="+phone);*/
      }
      in.close();
  }
}