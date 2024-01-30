1.Write a function to check if a given array contains duplicate elements within k distance from each other.

  boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
            return true;
        }
        map.put(nums[i], i);
    }
    return false;
}



2.Write a function to find the first non-repeating character in a string and return its index. If it doesn't exist, return -1.

  int firstUniqChar(String s) {
    HashMap<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
        if (count.get(s.charAt(i)) == 1) {
            return i;
        }
    }
    return -1;
}



3.Write a method to find the sum of all values in a HashMap. Assume all values are integers.

  int sumValues(HashMap<Integer, Integer> map) {
    int sum = 0;
    for (int value : map.values()) {
        sum += value;
    }
    return sum;
}


4.Implement a method to check if a string has all unique characters.

  boolean isUnique(String str) {
    HashSet<Character> set = new HashSet<>();
    for (char c : str.toCharArray()) {
        if (set.contains(c)) return false;
        set.add(c);
    }
    return true;
}


5.Write a method to implement a basic HashMap without using Java's built-in HashMap class.

  class MyHashMap {
    class Entry {
        final int key;
        int value;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final List<Entry>[] buckets;
    private static final int SIZE = 10000;

    public MyHashMap() {
        buckets = new List[SIZE];
    }

    private int getBucketIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    public void put(int key, int value) {
        int bucketIndex = getBucketIndex(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>();
        }
        for (Entry entry : buckets[bucketIndex]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        buckets[bucketIndex].add(new Entry(key, value));
    }

    public int get(int key) {
        int bucketIndex = getBucketIndex(key);
        List<Entry> bucket = buckets[bucketIndex];
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        Entry toRemove = null;
        if (buckets[bucketIndex] != null) {
            for (Entry entry : buckets[bucketIndex]) {
                if (entry.key == key) {
                    toRemove = entry;
                    break;
                }
            }
            if (toRemove != null) {
                buckets[bucketIndex].remove(toRemove);
            }
        }
    }
}


6.Write a function to find all pairs in an array that sum up to a specific target.

  List<int[]> findPairsWithSum(int[] nums, int target) {
    List<int[]> pairs = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        int complement = target - num;
        if (map.containsKey(complement)) {
            pairs.add(new int[]{complement, num});
        }
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    return pairs;
}


