import java.util.ArrayList;
import java.util.HashSet;

public class AArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    ArrayList<Integer>integers = new ArrayList<>();
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    System.out.println(integers);
    integers.remove(2);
    System.out.println(integers.size());
    System.out.println(integers);

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    ArrayList<Fruit>fruits = new ArrayList<>();
    fruits.add(new Fruit("Apple"));
    fruits.add(new Fruit("Banana"));
    fruits.add(new Fruit("Mango"));
    fruits.add(new Fruit ("Orange"));

    String fruitName = "Not Found";
    for (Fruit fruit : fruits){
      if(fruit.getFruitName().contains("grapes")){
        fruitName = fruit.getFruitName();
        break;
      }
    }
    System.out.println(fruitName);
    fruits.add(new Fruit("Grapes"));

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    HashSet<Integer>numbers1 = new HashSet<>();
    numbers1.add(10);
    numbers1.add(20);
    numbers1.add(10);
    numbers1.add(30);
    numbers1.add(40);
    numbers1.add(20);
    numbers1.add(50);
    System.out.println(numbers1.size());


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    HashSet<String> countryName = new HashSet<>();
    countryName.add("USA");
    countryName.add("India");
    countryName.add("China");
    countryName.add("Japan");
    countryName.add("Canada" );  
    countryName.add("India");
    System.out.println(countryName);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> counts = new HashSet<>();
    counts.add(1.1);
    counts.add(2.2);
    counts.add(3.3);
    counts.add(4.4);
    counts.add(5.5);









  }
  
}
