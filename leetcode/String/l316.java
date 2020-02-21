import java.util.List;
import java.util.LinkedList;
class l316 {
    public String removeDuplicateLetters(String s) {
        List<Character> list = new LinkedList<>();
        List<Integer> indexs = new LinkedList<>();
        int[] nextone = new int[26];//如果某个字母有其它可替换位置，则暂存
        for(int i = 0; i < s.length(); i++) {
            if(list.contains(s.charAt(i))) {
                int index = list.indexOf(s.charAt(i));
                if(index + 1 < list.size()) {
                    if(list.get(index + 1) < s.charAt(i)) {
                        list.remove(index); indexs.remove(index--);
                        list.add(s.charAt(i)); indexs.add(i);
                        while(index >= 0 && list.get(index) > list.get(index + 1) && nextone[list.get(index) - 'a'] > 0) {
                            char newone = list.get(index);
                            list.remove(index); indexs.remove(index);
                            int newindex = nextone[newone]; nextone[newone] = 0;
                            for(int intnum : indexs) {
                                if(intnum > newindex){
                                    list.add(list.indexOf(intnum), newone);
                                    indexs.add(list.indexOf(intnum), newindex);
                                }
                            }
                            index--;
                        }
                    } else {
                        nextone[list.get(index) - 'a'] = i;
                    }
                }
            } else {
                list.add(s.charAt(i));
                indexs.add(i);
            }
        }
        char[] chs = new char[list.size()];
        for(int i = 0; i < list.size(); i++) chs[i] = list.get(i);
        return new String(chs);
    }
}