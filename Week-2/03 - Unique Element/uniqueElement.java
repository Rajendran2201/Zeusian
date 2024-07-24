class uniqueElement {
    public static void main(String[] args) {
      int[] arr = {1,3,2,5,3,1,5};
      int unique = 0;
      for(int i : arr){
          unique ^= i;
      }
      System.out.println("Unique Element: " + unique);
    }
}
