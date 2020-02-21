import java.util.LinkedList;
import java.util.List;
class l386 {
    List<Integer> result;
    public List<Integer> lexicalOrder(int n) {
        result = new LinkedList<>();
        int nownum = 0;
        help(nownum, n);
        return result;
    }
    private void help(int nownum, int n) {
        int i;
        if(nownum == 0) { 
            i = 1;
        } else {
            i = 0;
        }
        for(; i < 10; i++) {
            nownum *= 10;
            nownum += i;
            if(nownum > n) {return;} 
            result.add(nownum);
            help(nownum, n);
            nownum /= 10;
        }
    }
}