

public class l167 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        
        int sum = numbers[low] + numbers[high];
        while(sum != target) {
            if(sum > target) {
                high -= 1;//使用自增自减运算符可以把时间提高到100%
            } else {
                low += 1;
            }
            sum = numbers[low] + numbers[high];
        }
        return new int[] {low + 1, high + 1};
    } 
}