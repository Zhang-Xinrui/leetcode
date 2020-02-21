import javax.xml.stream.events.Characters;

class l6 {
    public String convert(final String s, final int numRows) {
        if (numRows == 1)
            return s;
         char[] sch = s.toCharArray();
         char[] zigzag = new char[sch.length];
        int i,  zigzag_index = 0;
         int unitnum = 2 * (numRows - 1);
        for(int row = 0; row < numRows; row++) {
            i = row; 
            while(i < sch.length) {
                zigzag[zigzag_index++] = sch[i];
                if(i % unitnum == 0 || i % unitnum == numRows - 1)
                    i += unitnum;
                else {
                    i += 2 * ((unitnum - i % unitnum) % (numRows - 1));
                } 
            }
        }
        return String.valueOf(zigzag);
    }
}