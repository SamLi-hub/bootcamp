public class Warrior extends Hero {
 
    public Warrior (String name, int hp, int mp, int level){
     super (name, hp, mp, level);
    }

    @Override
    public String toString() {
      return "Warrior[" //
          + "HP = " + super.getHp() //
          + ", MP =" + super.getMp() //
          + "]";
    }

    public void knight(){
      if (super.getLevel() <=2){
        System.out.println("Level:" + super.getLevel() + " , " + "Warrior is arming with 角手斧");
      } else if (super.getLevel() >=3 && super.getLevel()<=5){
        System.out.println("Level:" + super.getLevel() + " , " + "Warrior is arming with 火炎劍");
      } else if (super.getLevel() >=6){
        System.out.println("Level:" + super.getLevel() + " , " + "Warrior is arming with 冰刀");
      }
    }

}
