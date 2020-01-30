import java.util.List;
import java.util.ArrayList;
class l118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> Pascal = new ArrayList<>();
        List<Integer> Integers;
        for(int i = 0; i < numRows; i++) {
            Integers = new ArrayList<>(); 
            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i)
                    Integers.add(1);
                else
                    Integers.add(Pascal.get(i - 1).get(j - 1) + Pascal.get(i - 1).get(j));
            }
        Pascal.add(Integers);
        }
        return Pascal;
    }
}