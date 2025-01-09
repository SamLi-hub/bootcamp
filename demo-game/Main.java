public class Main {
  
  public static void main(String[] args) {

    Archer a1 = new Archer ("油尖旺巨人", 100, 53, 10);
    System.out.println(a1.getName());
    System.out.println(a1);
    // System.out.println("HP : " + a1.getHp());
    // System.out.println("MP : " + a1.getMp());
    //System.out.println("Level : " + a1.getLevel());
    a1.arrow();
    // a1.basicAttrack(); // debug parent class 的方法 

    Mage m1 = new Mage("古洞魔術師", 25, 85, 10);
    System.out.println(m1.getName());
    System.out.println(m1);
    // System.out.println("HP : " + m1.getHp());
    // System.out.println("MP : " + m1.getMp());
    // System.out.println("Level : " + m1.getLevel());
    m1.magic();

    Warrior w1 = new Warrior("斧頭扒", 58, 65, 10);
    System.out.println(w1.getName());
    System.out.println(w1);
    // System.out.println("HP : " + w1.getHp());
    // System.out.println("MP : " + w1.getMp());
    // System.out.println("Level : " + w1.getLevel());
    w1.knight();

  }
 

}
