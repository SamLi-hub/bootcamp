public abstract class Hero {
  private String name; 
  private int hp;
  private int mp;
  private int level; 

  public Hero (String name, int hp, int mp, int level){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
    this.level = level;
    
  }

  public String getName(){
    return "User name : "+ this.name;
  }


  public int getHp(){
    return this.hp;
  }

  public int getMp(){
    return this.mp;
  }

  public int getLevel(){
    return this.level;
  }


  public void basicAttrack(){
    System.out.println("Hero is gotta attack.");
  }


}

