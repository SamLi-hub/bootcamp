public class ExeciseOrder {
// attributes
private String orderNumber;
private int orderQty;
private String productNumber;

// Constructor (not Method)
public Order(String orderNumber, int orderQty, String productNumber){
this.orderNumber = orderNumber;
this.orderQty = orderQty;
this.productNumber = productNumber;
}

// Getter (instance Method)
public String getOrderNumber(){
  return this.orderNumber;
}

public int getOrderQty(){
  return this.orderQty;
}

public String getProductNumber(){
  return this.productNumber;
}

// Setter (amend something)
public void setOrderNumber(String orderNumber){
this.orderNumber = orderNumber;
}




public static void main(String[] args) {
Order o1 = new Order("A001" , 15, "apple");
Order o2 = new Order("A002", 20, "cherry");
Order o3 = new Order("A003", 25, "mango");


Order[] orders = new Order[] {o1, o2, o3};
for (Order o: orders){
System.out.println(o.getOrderNumber() + "," + o.getOrderQty() + "," + o.getProductNumber());
}

o3.setOrderNumber("B333");
System.out.println(o3.getOrderNumber());
System.out.println(o3.getOrderNumber() + "," + o3.getOrderQty() + "," + o3.getProductNumber());


}
}
