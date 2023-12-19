1.Which of the following is true about the best-case time complexity of an algorithm?

a. It represents the time taken when the input is at its worst.
b. It represents the lower bound of the time complexity.
c. It represents the average time taken over all possible inputs.
d. It represents the time taken when the input is at its best.

Answer: d



2.What is the time complexity of the binary search algorithm?

a. O(1)
b. O(log n)
c. O(n)
d. O(n^2)

Answer: b



3.If an algorithm performs a constant amount of work regardless of the input size, what is its time complexity?

a. O(1)
b. O(log n)
c. O(n)
d. O(n^2)

Answer: a



4.Which sorting algorithm has a worst-case time complexity of O(n log n)?

a. Bubble Sort
b. Insertion Sort
c. Quick Sort
d. Selection Sort

Answer: c



5.Which of the following time complexities represents the most efficient algorithm?

a. O(1)
b. O(log n)
c. O(n)
d. O(n^2)

Answer: a

// Question 6 to 10 will be give from below code//
  public class AlgorithmAnalysis {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 7};

        // Question 1
        System.out.println("Question 1:");
        System.out.println(findMax(numbers));

        // Question 2
        System.out.println("Question 2:");
        System.out.println(findMin(numbers));
    }

    // Find the maximum value in an array
    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Find the minimum value in an array
    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}


Question 6: How many iterations will the findMax method perform in the given code?

a) 5
b) 4
c) 3
d) 2

Question 7: What is the space complexity of the findMin method in the given code?

a) O(1)
b) O(n)
c) O(n^2)
d) O(log n)


Question 8: Which method is more likely to have better performance in terms of time complexity?

a) findMax
b) findMin

Question 9: What will be the output of the following Java code?

a) 2
b) 5
c) 3
d) 8

Question 10:In Big O notation, what is the worst-case time complexity of the findMax method?

a) O(1)
b) O(n)
c) O(n^2)
d) O(log n)
