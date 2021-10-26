import java.util.*;

public class Student
{
  String name;
  ArrayList<Breakfast> studentBreakfast = new ArrayList<>();
  ArrayList<Lunch> studentLunch = new ArrayList<>();
  ArrayList<Snack> studentSnack = new ArrayList<>();

  public Student (String inName)
  {
    name = inName;
  }
  public void addBreakfast(Breakfast breakfast)
  {
    studentBreakfast.add(breakfast);
  }
  public void addSnack(Snack snack)
  {
    studentSnack.add(snack);
  }
  public void addLunch(Lunch lunch)
  {
    studentLunch.add(lunch);
  }
  public ArrayList<Breakfast> getBreakfast()
  {
    return studentBreakfast;
  }
  public ArrayList<Snack> getSnack()
  {
    return studentSnack;
  }
  public ArrayList<Lunch> getLunch()
  {
    return studentLunch;
  }
}