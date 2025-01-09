public class Mage extends Hero {
 

  public Mage (String name, int hp, int mp, int level){
    super(name, hp, mp, level);
    
  }

  @Override
  public String toString() {
    return "Mage[" //
        + "HP = " + super.getHp() //
        + ", MP =" + super.getMp() //
        + "]";
  }


  public void magic(){
    if (super.getLevel() <=2){
      System.out.println("Level:" + super.getLevel() + " , " + "Mage is spelling with 迷幻魔法");
    } else if (super.getLevel() >=3 && super.getLevel() <=5){
      System.out.println("Level:" + super.getLevel() + " , " + "Mage is spelling with 火炎魔法");
    } else if (super.getLevel() >=6){
      System.out.println("Level:" + super.getLevel() + " , " + "Mage is arming with 冰雪魔法");
    }
  


  }
}