public class Archer extends Hero {

  //private String name; 
  // private int hp;
  // private int mp;
  // private int level; 

  public Archer (String name, int hp, int mp, int level){
    super(name,hp, mp, level);

  }

  @Override
  public String toString() {
    return "Archer[" //
        + "HP = " + super.getHp() //
        + ", MP =" + super.getMp() //
        + "]";
  }




  public void arrow(){
    if (super.getLevel() <=2){
      System.out.println("Level:" + super.getLevel() + " , " + "Archer is arming with 曼陀羅弓箭");
    } else if (super.getLevel() >=3 && super.getLevel() <=5){
      System.out.println("Level:" + super.getLevel() + " , " + "Archer is arming with 火強弓");
    } else if (super.getLevel() >=6){
      System.out.println("Level:" + super.getLevel() + " , " + "Archer is arming with 凍結弓箭");
    }
  
  }




  }






