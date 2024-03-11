import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
    }
    
    //java desc
    public void addTitle(String title){

    }

    //java desc
    public String removeTitle(String title){

    }

    //java desc
    public void checkOut(String title){

    }

    //java desc
    public void returnBook(String title){
      
    }

    public static void main(String[] args) {
      new Library();
    }
  
  }