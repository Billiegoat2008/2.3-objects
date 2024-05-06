public class Horse {
  private String name;
  private int yearOfBirth;

  public Horse(String horseName, int year) {
    name = horseName;
    year of birth = year;
  }

  public String getName() {
    return name;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }
}

public class HorseProgram {
  public static void main(String[] args) {
    Horse horse1 = new Horse("Thunder", 2010);
    Horse horse2 = new Horse("Lightning", 2012);
    Horse horse3 = new Horse("Stormy", 2015);
    System.out.println("Horse 1: " + horse1.getName() + ", born in " + horse1.getYearOfBirth());
    System.out.println("Horse 2: " + horse2.getName() + ", born in " + horse2.getYearOfBirth());
    System.out.println("Horse 3: " + horse3.getName() + ", born in " + horse3.getYearOfBirth());
  }
}
