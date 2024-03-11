import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
    }
    
    //java desc
    public boolean isBook(String title){
      return collection.containsKey(title);
    }
    
    //java desc
    public void addTitle(String title){
      if (isBook(title) == false){
        collection.put(title, true);
      } else {
        throw new RuntimeException("This title is already in the collection.");
      }
    }

    //java desc
    public String removeTitle(String title){
      if (isBook(title) == true){
        collection.remove(title);
      } else {
        throw new RuntimeException("This title is not in the collection.");
      }
      return title;
    }

    //java desc
    public void checkOut(String title){

    }

    //java desc
    public void returnBook(String title){

    }

    public static void main(String[] args) {
      Library library = new Library("San Mateo Public Library", "downtown", 4);
      try{
        library.addTitle("The Little Engine That Could");
      } catch (RuntimeException e){
        System.out.println(e);
      }
      System.out.println(library.collection);
      try{
        library.removeTitle("The Little Engine That Could");
      } catch (RuntimeException e){
        System.out.println(e);
      }
      System.out.println(library.collection);
      //reconfig library tostring
    }
  
  }