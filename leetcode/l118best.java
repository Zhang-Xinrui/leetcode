import java.util.List;
import java.util.ArrayList;

class l118best {
    //可以基于119题的方法？？
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Pascal = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for(int j = 0; j < numRows; j++) {
            row = new ArrayList<>(j + 1);
            row.add(1);
            long cur = 1;   //如果不使用long类型数据，也可以使用求最大公约数的方法，代码实现略繁琐
            int mid = j / 2, t, i;
            for(i = 1, t = j - i + 1; i <= mid; i++, t--) {
             cur *= t; cur /= i;
             row.add((int)cur);
            }
            for( ; i <= j; i++) {
            row.add(row.get(j - i));
        }
        Pascal.add(row);
        }
        return Pascal; 
    }
}