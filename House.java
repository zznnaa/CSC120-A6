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
    if (this.residents.contains(person)){
      return true;
    } else {
      return false;
    }
  }

  //java desc
  public void moveIn(String name){
    if (isResident(name) == false){
      this.residents.add(name);
    } else {
      System.out.println("This person is already a resident.");
    }
  }

  //java desc
  public String moveOut(String name){
    //doesnt necessarily return name rn, do I need to add a try/catch?
    if (isResident(name) == true){
      this.residents.remove(name);
      return name;
    } else {
      System.out.println("This person isn't a resident.");
    }
  }

  public static void main(String[] args) {
    //new House();
    House house = new House("home", "624", 2, true);
    System.out.println(house.nResidents());
    System.out.println(house);
  }

}

//don't have to keep anything from parent class, can override functions like toString
//in class
// public class House extends Building{
//   public House(String name, String address, int nFloors){
//     super(name, address, nFloors);
//   }
// }
