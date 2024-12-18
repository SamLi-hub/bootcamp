

public class DemoOperator {
  public static void main(String[] args){

    // + 1
    int x = 3;
    x = x + 1;
    x++;
    ++x;
    x +=1; //+= means x = x + 1
    System.out.println(x); //7


    // -1
    int y = 10;
    y = y -1;
    y--;
    --y;
    y -= 1;
    System.out.println(y);//6

    // + 2
    int b = 20;
    b = b +2;
    b += 2;
    System.out.println(b); //24

    // -2 
    int c = 100;
    c = c - 2;
    c -= 2;
    System.out.println(c); // 96

    // *=, /=
    int m = 5;
    m = m *2;
    m *= 2;
    System.out.println(m); // 20

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println(u); //1


    int remainder = 10 % 3;
    System.out.println(remainder); //1

    // ++x vs x++
    int a = 8;
    int result1 = ++a + 3;
    System.out.println(result1); //12
    System.out.println(a);//9
    // step 1: a become 9 (8+1)
    // step 2: a + 3 (9+3)
    // step 3: assign 12 to result

    int q = 8;
    int result2 = q++ + 3;
    System.out.println(result2); //11
    System.out.println(q); //9
    // step 1: q + 3 (8+3)
    // step 2: q become 9
    // step 3: assign 11 to result2

    // String +=
    String s = "hello";
    s+= "!";
    System.out.println(s); // hello!
    //int + double -> double
    //String + anything -> String

    s+= 'a';
    System.out.println(s);// hello!a

    s+=1;
    System.out.println(s); // hello!a1

    s+= true;
    System.out.println(s); // hello!a1true








  }

}
