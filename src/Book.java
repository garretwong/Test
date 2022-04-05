public class Book {
   private String author = "Malcolm Gladwell";
   private String title = "The Bomber Mafia";
   private int pageNumber = 100;
   private double price = 12.15;

   public static int action(int pageNumber) {
       return pageNumber;
   }

   public static String action(String author) {
       return author;
   }

   public static boolean action(boolean decision) {
       return decision;
   }

   public static double action(double price) {
       return price;
   }

}
