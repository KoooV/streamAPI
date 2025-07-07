// leetcode https://leetcode.com/problems/merge-sorted-array
public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = IntStream.concat(
            Arrays.stream(nums1, 0, m),// значения из массива с 0 по m индекс
            Arrays.stream(nums2, 0, n))// значения из массива с 0 по n индекс
            .sorted()
            .toArray();
        System.arraycopy(res, 0, nums1, 0, res.length);
        //берем из res c 0 индекса, вставляем с 0 индекса в nums1
    }
      
// leetcode https://leetcode.com/problems/sum-of-unique-elements
public int sumOfUnique(int[] nums) {
        return (int) IntStream.of(nums)
            .filter(num -> Arrays.stream(nums)
            .filter(x -> x == num).count() == 1)
            .sum();
    }
    
// leetcode https://leetcode.com/problems/single-number
public int singleNumber(int[] nums) {
        return Arrays.stream(nums).filter(num -> Arrays.stream(nums)
            .filter(x -> x == num)
            .count() == 1)
            .findFirst()
            .orElse(-1);
    }





    
