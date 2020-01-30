import java.util.List;
import java.util.ArrayList;
class l119better {
    public List<Integer> getRow(int rowIndex) { 
        List<Integer> row = new ArrayList<>();
        row.add(1); long cur = 1;   //如果不使用long类型数据，也可以使用求最大公约数的方法，代码实现略繁琐
        int mid = rowIndex / 2, t, i;
         for(i = 1, t = rowIndex - i + 1; i <= mid; i++, t--) {
             cur *= t; cur /= i;
             row.add((int)cur);
            }
        for( ; i <= rowIndex; i++) {
            row.add(row.get(rowIndex - i));
        }
        return row;
    }
}