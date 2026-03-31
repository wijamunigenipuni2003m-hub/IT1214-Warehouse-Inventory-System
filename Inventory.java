import java.util.*;
class Inventory{
  ArrayList<Item> list = new ArrayList<>();

  void add(Item i){
    list.add(i);
  }
  void remove(String id){
    list.removeIf(x->x.id.equals(id));
  }
  void update(String id, int q){
    for(Item x:list)
      if(x.id.equals(id))
        x.qty=q;
  }
  void search (String key){
    for(Item x:list)
      if(x.id.equals(key)|| x.name.equals(key))
        System.out.println(x);
  }
  void display(){
    for(Item:list)
      System.out.println(x);
  }
}
