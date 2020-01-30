import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class l118new {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Pascal = new ArrayList<>();
        List<Integer> row = new LinkedList<>(); 
        for(int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for(int j = 1; j < i; j++) {    //这里由于是按顺序读取，效率堪比ArrayList
                row.set(j, row.get(j) + row.get(j + 1));
            }
            Pascal.add(new ArrayList<>(row));
        }
        return Pascal;
    }
}