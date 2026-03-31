import java.util.*;
public class WareHouse{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    Inventory inventory=new Inventory();
    int choice;

  do{
    System.out.println("\n----WareHouse Inventory System----");
    System.out.println("1. Add Item");
    System.out.println("2. Remove Item");
    System.out.println("3. Update Quantity");
    System.out.println("4. Search Item");
    System.out.println("5. Display all item");
    System.out.println("6. Exit");

    choice = sc.nextInt();
    sc.nextLine();

    if(choice==1){
      System.out.println("id, name, qty, price:");
      String id=sc.next();
      String name=sc.next();
      int q=sc.nextInt();
      double p=sc.nextDouble();
      inventory.add(new Item(id, name, q, p));
    }
    else if (choice==2){
      System.out.println("id: ");
      inventory.remove(sc.next());
    }
    else if (choice==3){
      System.out.println("id, qty: ");
      inventory.update(sc.next(),sc.nextInt());
    }
    else if (choice==4){
      System.out.println("search: ");
      inventory.search(sc.next());
    }
    else if (choice==5){
      inventory.display();
    }    
  } 
    while (choice!=6);
 }
}
 
