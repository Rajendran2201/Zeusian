public class MiniMaxSum {
  public static void calculateMiniMaxSum(long[] arr) {
          Arrays.sort(arr);
  
          long minSum = 0;
          for (int i = 0; i < arr.length - 1; i++) {
              minSum += arr[i];
          }
          
          long maxSum = 0;
          for (int i = 1; i < arr.length; i++) {
              maxSum += arr[i];
          }
          
          System.out.println(minSum + " " + maxSum);
      }
}
