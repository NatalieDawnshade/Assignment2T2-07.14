import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections;   

class Lesson_15_Activity 
{
  private static String [] nombres;
  //private static String [] apellidos = {};
  private static String [] names = {"Rahul","Singh","Rishwajeet","Riya"};

  private static int numero;
  private static int x = 2;
 
  public Lesson_15_Activity() // cero param
  {
    nombres = names;//ArrayList
    //apellidos = names;//list
    numero = names.length;
  }

  public Lesson_15_Activity(String [] n) //un param 
  {
    nombres = n;//ArrayList
    //apellidos = n;//list
    numero = n.length;
  }
  public Lesson_15_Activity(String [] n, int num) //un param 
  {
    x = 1;
    nombres = n;//ArrayList
    //apellidos = n;//list
    numero = n.length;
  }
  public String [] getArray() 
  {
    return (nombres);
  } 

  public String [] getOGArray() 
  {
    return (names);
  }
  
  public static String [] sortAndPrintBF(String [] list)// usa apellidos
  {
    String temp;
    for (int i = 0; i < numero-1; i++) 
    {
      for (int j = i + 1; j < numero-1; j++) 
      {   
        // to compare one string with other strings
        if (list[i].compareTo(list[j]) > 0) 
        {
          // swapping
          temp = list[i];
          list[i] = list[j];
          list[j] = temp;
        }
      }
    }
    return list;
  }
  
  public static String [] sortAndPrintEZ(String [] list)//usa apellidos
  {
    //inbuilt sort function
    Arrays.sort(list);
    return list;
  }

  public static void getSortandPrint()
  {
    if(x == 1)
    {
      sortAndPrintBF(nombres);
      toStringy();
    }
    else
    {
      sortAndPrintEZ(nombres);
      toStringy();
    }
  }   
  public static void toStringy() 
  {
    String prnt;
    //print output array
    prnt = ("The names in alphabetical order are: ");
    System.out.println(prnt);
    for (int i = 0; i < nombres.length; i++) 
    {  
      System.out.println("\n"+"\t" + nombres[i]);     
    }
  }
  public static void toStringy2() 
  {
    String prnt;
    //print output array
    prnt = ("The unalphabetized example names are: ");
    System.out.println(prnt);
    for (int i = 0; i < names.length; i++) 
    {  
      System.out.println("\n"+"\t" + names[i]);     
    }
  }
}
