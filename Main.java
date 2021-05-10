/* Term 2 Assignment 6 - Main */
/* Creates a team directory and implements a sorting algorithm */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 
import java.lang.reflect.Field;
import java.util.*;
// Run this when you have your Lesson_15_Activity.java file complete //
class Main {
  
  static int x = 0;
    static String [] apellidos;
    static ArrayList <String> a = new ArrayList<String>();
    static ArrayList <String> al = new ArrayList<String>();
    static String [] identification;
    static ArrayList <String> b = new ArrayList<String>();
    static ArrayList <String> bl = new ArrayList<String>();
    //static ArrayList <Member> tms = new ArrayList <Member>();
    static ArrayList<Member> tms = new ArrayList<Member>();  
    static ArrayList <TeamMember> tool = new ArrayList <TeamMember>();
  
  //colors
    public static final String ANSI_RESET = "\u001B[0m";
    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE
    
    // Regular Colors
    public static final String WHITE = "\033[0;37m";   // WHITE

    //Underline
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    //Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
  public static String menu()//prnts reg menu
  {
    Scanner scan = new Scanner(System.in);
    Boolean flag = true;
    while (flag == true)
    {
      System.out.println("|---------------------------|");
      System.out.println(("|")+(GREEN_BACKGROUND + BLACK_BOLD + "         MAIN MENU         ") + (ANSI_RESET +"|"));
      System.out.println("|---------------------------|");
      System.out.println("1) Today's Assignment: Coding Activity 07.14");
      //System.out.println("2) Option 2");
      //System.out.println("3) Option 3");
      //System.out.println("4) Option 4");
      //System.out.println("5) Option 5");
      //System.out.println("2) ???");
      System.out.println("----------------------------");
      System.out.println(" : ");
      //scan.nextLine();
      flag = false;
    }
    //while (scanner.hasnextLine())
    {
      String num = scan.nextLine();
      //scan.close();
      num = num.replaceAll("\\s", "");
      return num;
    }
  }
  public static String menu2()//prnts reg menu
  {
    Scanner scan = new Scanner(System.in);
    Boolean flag = true;
    while (flag == true)
    {
      System.out.println("|---------------------------|");
      System.out.println(("|")+(PURPLE_BACKGROUND + WHITE_BOLD + "         CODE MENU         ") + (ANSI_RESET +"|"));
      System.out.println("|---------------------------|");
      System.out.println("1) Enter List of Names/Words");
      //System.out.println("2) Create New Game");
      System.out.println("2) Print List in Alphabetical Order");
      System.out.println("3) Exit Assignment 07.07- Back to Main Menu");
      System.out.println("4) ✨  Programmer's Notes (read me)  ✨");
      System.out.println("5) Prints Example List of Names (see P.N. for more details)");
      System.out.println("6) Prints Team");
      System.out.println("----------------------------");
      System.out.println(" : ");
      //scan.nextLine();
      flag = false;
    }
    {
      String num = scan.nextLine();
      //scan.close();
      num = num.replaceAll("\\s", "");
      return num;
    }
  }
  public static void choices()//real main, into assign.
  {  //choices method
    Boolean flag = false;
    while(flag == false)
    {
      String num = menu();
      //#os.system("clear")
      if(num.equals("1"))
      {
        today();//our assignment
        //option 1
        flag = true;
      } 
      /*else if(num.equals("2"))
      {
        //option 2
        flag = true;
      }*/
      /*
        else if(num.equals("3"))
        {
          //option 3
          System.out.println("You chose option 3.");
          flag = true;
        }
        else if(num.equals("4"))
        {
          //option 4
          flag = true;
        }
        else if(num.equals("5"))
        {
          //option 5
          flag = true;
        }
        else if(num.equals("6"))
        {
          //option 6
          flag = true;
        }
      */
      else
      {
        System.out.println("What part of 1 options don't you get? Pick a number, just 1. Proof the American school system is failing.../s");
      }
    } 
  }
  public static void choices2()//assignment main
  {  //choices2 method
    Boolean flag = false;
    while(flag == false)
    {
      String num = menu2();
      //#os.system("clear")
      if(num.equals("4"))
      {
        reglas();//rules
        choices2();
        //option 4
        flag = true;
      } 
      else if(num.equals("2"))
      {
        if(x > 0)//if list inputed
        {
          Lesson_15_Activity e = new Lesson_15_Activity(apellidos);
          e.getSortandPrint();
          choices2();
          //option 2
          flag = true;
        }
        else
        {
          System.out.println("//WARNING//"+ "\tNo list has been inputed and the given list will remain an example of the program's efficacy until user data is recieved.\n");
          Lesson_15_Activity k = new Lesson_15_Activity();
          k.getSortandPrint();
        }
      }
      else if(num.equals("3"))
      {
        choices();//exit 2nd menu
        //option 3
        flag = true;
      }
      else if(num.equals("1"))
      {
        getList();
        x++;
        choices2();
        //option 1
        flag = true;
      }
      else if(num.equals("5"))
      {
        //option 5
        OGlistPrint();//ejemplos
        choices2();
        flag = true;
      }
      else if(num.equals("6"))
      {
        //option 6
        prntTeam();//prnt names by ID
        choices2();
        flag = true;
      }
      else
      {
        System.out.println("What part of 4 options don't you get? Pick a number, 1-4. Proof the American school system is failing.../s");
      }
    } 
  }
	public static void today()// assignment: choices2 call
	{
    choices2();
	}
  public static void reglas()// rules call [add each name must have an id]
  {
    //System.out.println("New Game - Sets up a new game and creates a wheel.");
    System.out.println("If no list has been entered and the user attempts to alphabetize a list, then an example list will be printed to showcase the program's efficacy.");
    System.out.println("The rest should be pretty straightforward.");
  }
  public static void OGlistPrint()
  {
    Lesson_15_Activity og = new Lesson_15_Activity();
    og.toStringy2();
  }
  public static void getList()//make list of names, ids, and persons (bundled in )
  {
    Scanner scan2 = new Scanner(System.in);
    System.out.println("To stop entering team member names and IDs into the list enter 'stop'.You may only enter up to 20 names.");
    String str = "";
    String str2 = "";
    while(!(str.equals("stop")))
    {
      System.out.println("Enter Name: ");
      str = scan2.nextLine();
      System.out.println("Enter ID: ");
      str2 = scan2.nextLine();
      if(!(str.equals("stop")))
      {
        tms.add(new Member(str,str2));
        a.add(str);
        b.add(str2);
      }
    }
    //for names
    al = a;
    String [] listy = new String [al.size()];
    listy = al.toArray(listy);
    apellidos = listy;
    //for ids
    bl = b;
    String [] liste = new String [bl.size()];
    liste = bl.toArray(liste);
    identification = liste;
  }
  public static void prntTeam()
  {
    Collections.sort(tms, new Comparator<Member>(){
      @Override
      public int compare(Member o1, Member o2)
      {
        return o1.getID().compareTo(o2.getID());
      }
    });
    //, new Comparator<Member>()
    tms.toString();
  }
  /*public String toTitleCase(String str) 
  {
    str = str.toLowerCase().split(' ');
    for (var i = 0; i < str.length; i++) 
    {
      str[i] = str[i].charAt(0).toUpperCase() + str[i].slice(1);
    }
    return str.join(' ');
  }
  */
  public static void main(String[] args) 
  {
    /*
      String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
      Lesson_15_Activity k = new Lesson_15_Activity(list);
      k.getSortandPrint();
    */
    choices();
  }
  /*
  Person person = new Person("John", "Doe",0);
    System.out.println("Printing person:\n" + person + "\n");

    UltimatePlayer player = new UltimatePlayer("Mary", "Smith",0,"cutter");
    System.out.println("Printing player:\n" + player + "\n");

    Captain captain = new Captain("Henry", "Tully",0, "handler", true);
    System.out.println("Printing captain:\n" + captain + "\n");

    Coach coach = new Coach("Sara", "Lee",0,"Head coach");
    System.out.println("Printing coach:\n" + coach + "\n");

    ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
    players.add(new UltimatePlayer("Sammy", "Trong",0, "handler"));
  */
}
