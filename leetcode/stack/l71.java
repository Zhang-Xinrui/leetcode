class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for(String s : path.split("/")) {
            if(s.equals(".") || s.equals("")) continue;
            if(s.equals("..")) {
                if(!stack.isEmpty()) stack.pop();
            }
            else 
                stack.add(s);
        }
        String newpath = new String();
        while(!stack.isEmpty()) {
            newpath = "/" + stack.pop() + newpath;
        }
        if(newpath.length() == 0) newpath += "/";
        return newpath;
    }
}