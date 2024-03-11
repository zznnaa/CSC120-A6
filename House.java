import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  //put in java desc
  public boolean hasDiningRoom(){
    if (this.hasDiningRoom == true){
      return true;
    } else {
      return false;
    }
  }

  //java desc
  public int nResidents(){
    return this.residents.size();
  }

  //java desc
  public boolean isResident(String person){
    return this.residents.contains(person);
  }

  //java desc
  public void moveIn(String name){
    if (isResident(name) == false){
      this.residents.add(name);
    } else {
      throw new RuntimeException ("This person is already a resident.");
    }
  }

  //java desc
  public String moveOut(String name){
    if (isResident(name) == true){
      this.residents.remove(name);
    } else {
      throw new RuntimeException ("This person is not a resident.");
    }
    return name;
  }

  public static void main(String[] args) {
    House house = new House("home", "624", 2, true);
    try{
      house.moveIn("Zoe");
    } catch (RuntimeException e){
      System.out.println(e);
    }
    System.out.println(house.nResidents());
    try{
      house.moveOut("Zoe");
    } catch (RuntimeException e){
      System.out.println(e);
    }
    System.out.println(house);
  }

}