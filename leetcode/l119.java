import java.util.List;
import java.util.LinkedList;
class l119 {//这是基于118题给出的解法，显然不太适用。应该想办法直接得到通项。
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new LinkedList<>();
        int row_len = 0; //比实际List长度要小1
        row.add(0, 1);
        while(row_len < rowIndex) {
            row.add(0, 1); row_len++;
            for(int i = 1; i < row_len; i++) {
                row.set(i, row.get(i) + row.get(i + 1));
            }
        }
        return row;
    }
}