public class Main {
  public static void main(String[] args){
    int steps = 5;  // Wysokość 

    for(int i = 1; i <= steps; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}