import java.util.List;
import java.util.ArrayList;
class l68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        int remainwidth = maxWidth, nowleft = 0;

        String allspace = new String();
        for(int i = 0; i < maxWidth; i++) allspace += " ";

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() < remainwidth) {
                remainwidth -= words[i].length() + 1;
            } else if(words[i].length() == remainwidth) {
                String newstring = new String();
                for(int j = nowleft; j <= i; j++) 
                    newstring += words[j] + " ";
                list.add(newstring.substring(0, maxWidth));
                nowleft = i + 1; remainwidth = maxWidth;
            } else {
                String newstring = new String();
                if(i == nowleft + 1) {
                    newstring += words[nowleft] + allspace;
                    list.add(newstring.substring(0, maxWidth));
                } else {
                    int morespace = (remainwidth + 1) / (i - nowleft - 1), index;
                    index = (remainwidth + 1) % (i - nowleft - 1);
                    String space = new String();
                    for(int k = 0; k < morespace + 1; k++) space += " ";
                    for(int j = nowleft; j < i; j++)
                        if(j - nowleft < index) newstring += words[j] + space + " ";
                        else newstring += words[j] + space;
                    list.add(newstring.substring(0, maxWidth));
                }
                nowleft = i--; remainwidth = maxWidth;
            }
        }
        if(nowleft >= words.length) return list;
        String newstring = new String();
        for(int i = nowleft; i < words.length; i++) newstring += words[i] + " ";
        newstring += allspace;
        list.add(newstring.substring(0, maxWidth));
        return list;
    }
}