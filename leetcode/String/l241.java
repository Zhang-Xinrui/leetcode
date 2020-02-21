import java.util.List;
import java.util.ArrayList;
class l241 {
    public List<Integer> diffWaysToCompute(String input) {
        return help(input, 0, input.length());
    }
    private List<Integer> help(String input, int low, int high) {
        List<Integer> indexs = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i = low; i < high; i++) {
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                indexs.add(i);
            }
        }
        if(indexs.size() == 0) {
            int num = 0;
            for(int i = low; i < high; i++) {
                num *= 10;
                num += input.charAt(i) - '0';
            }
            result.add(num); return result;
        }
        for(int i = 0; i < indexs.size(); i++) {
            List<Integer> left = help(input, low, indexs.get(i));
            List<Integer> right = help(input, indexs.get(i) + 1, high);
            for(int j = 0; j < left.size(); j++)
                for(int k = 0; k < right.size(); k++)
                    switch(input.charAt(indexs.get(i))) {
                        case '+': result.add(left.get(j) + right.get(k));break;
                        case '-': result.add(left.get(j) - right.get(k));break;
                        case '*': result.add(left.get(j) * right.get(k));break;
                    }
        }
        return result;
    }
}