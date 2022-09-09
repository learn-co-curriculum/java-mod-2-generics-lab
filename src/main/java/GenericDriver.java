public class GenericDriver {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    Integer[] inputEmpty = new Integer[5];
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

     System.out.println(GenericPractice.convertToStringArray(inputInt)); // [1, 2, 3]
     System.out.println(GenericPractice.convertToStringArray(inputStr)); // [Cake, Donut, Cupcake]

     System.out.println(GenericPractice.getFirstElement(inputInt)); // 1
     System.out.println(GenericPractice.getFirstElement(inputEmpty)); // null
     System.out.println(GenericPractice.getFirstElement(inputStr)); // Cake
  }
}