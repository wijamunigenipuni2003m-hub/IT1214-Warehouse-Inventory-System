class Item{
  String id;
  String name;
  int qty;
  double price;

  Item(String id, String name, int qty, double price){
    this.id=id;
    this.name=name;
    this.qty=qty;
    this.price=price;
  }
  public string toString(){
    return id+ " " + name + " "+ qty + " " + price;
  }
}
