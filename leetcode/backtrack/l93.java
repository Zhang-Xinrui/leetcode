class Solution { //AC不了
    List<String> list;
    public List<String> restoreIpAddresses(String s) {
        list = new ArrayList<>();
        int len;
        for(int i = 1; i < 4; i++) {
            for(int j = 1; j < 4; j++) {
                for(int k = 1; k < 4; k++) {
                    for(int m = 1; m < 4; m++) {
                        len = i + j + k + m;
                        if(len != s.length()) continue;
                        if(s.startsWith("0") && i > 1 || Integer.parseInt(s.substring(0, i)) > 255)
                            continue;
                        if(s.startsWith("0") && j > 1 || Integer.parseInt(s.substring(i, i + j)) > 255)
                            continue;
                        if(s.startsWith("0") && k > 1 || Integer.parseInt(s.substring(i + j, len - m)) > 255)
                            continue;
                        if(s.startsWith("0") && m > 1 || Integer.parseInt(s.substring(len - m, len)) > 255)
                            continue;
                        list.add(s.substring(0, i) + "." + s.substring(i, i + j) + "." + s.substring(i + j, len - m) + "." + s.substring(len - m, len));
                    }
                }
            }
        }
        return list;
    }
   
}