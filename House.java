import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    //super begins to construct House from parent class
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

 //says whether the house has a dining room
  public boolean hasDiningRoom(){
    if (this.hasDiningRoom == true){
      return true;
    } else {
      return false;
    }
  }

  //says number of residents
  public int nResidents(){
    return this.residents.size();
  }

  //says whether resident is in house
  public boolean isResident(String person){
    return this.residents.contains(person);
  }

  /**
 * Moves a resident into the house.
 *
 * @param name The name of the resident.
 * @throws RuntimeException Resident already belongs to the house.
 */
  public void moveIn(String name){
    if (isResident(name) == false){
      this.residents.add(name);
    } else {
      throw new RuntimeException ("This person is already a resident.");
    }
  }

  /**
 * Moves a resident out of the house.
 *
 * @param name The name of the resident.
 * @throws RuntimeException Resident is not part of the house.
 */
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