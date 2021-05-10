/* Term 2 Assignment 6 - Sort Team Directory */
/* A class which is used to represent members of a team */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections;   

public class TeamMember //extends Member
{
  private ArrayList<Member> members;

  public TeamMember(ArrayList<Member> players)
  {
    this.members = players;
  }//end tm

  public String toString()//add e vvvv
  {
    String prnt1 = ("Players: "+"\n"+"--------------------------------------------"+"\n");
    for (Member p: members)
    {
      prnt1 += (p + "\n");
    }//end p for
    
    return (prnt1 +("--------------------------------------------"+"\n"));//return
  }// end toString
} 