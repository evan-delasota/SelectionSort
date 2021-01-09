class Main {
  public static void main(String[] args) {
    int[] arr = {1, 5, 1, 10, 13, 9, 40, 33, 28, 15};
    
    System.out.print("Unsorted: ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

    selSort(arr);
    
    System.out.print("Sorted:   ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

  }
  // On average O(n^2) time complexity, O(1) space complexity
  static void selSort(int[] arr) {
    int length = arr.length;
    
    for (int i = 0; i < length - 1; ++i) {
      int min = i;
      for (int j = i + 1; j < length; ++j) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;

    }

  }
}