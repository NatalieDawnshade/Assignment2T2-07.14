
import java.util.Comparator;
import java.util.Collections;
import java.lang.reflect.Field;
import java.util.*;

public class Member //implements Comparable
{
  private String nombre = "";
  private String ID = "";

  public Member(String nombre, String ID)
  {
    this.nombre = nombre;
    //apellido = lastName;
    this.ID = ID;
    //idioma = 2;
  }//end param 3

  public String getID()
  {
    return this.ID;
  }
  public String getNombre()
  {
    return this.nombre;
  }
  public String toString()
  {
    return (("--------------------------------------------"+"\n\t")+"Name: " + nombre)+("\n\t")+("ID: " + ID)+("\n"+("--------------------------------------------"+"\n"));
  }//end toString
}//end class