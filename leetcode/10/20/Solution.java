import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        boolean flag = true;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if(str.equals("(") || str.equals("{") || str.equals("[")){
                stack.add(str);
            } else {
                if(stack.size() == 0){
                    flag = false;
                    break;
                }
                String str2 = stack.pop();
                if(str.equals(")")){
                    if(!str2.equals("(")){
                        flag = false;
                        break;
                    }
                } else if(str.equals("}")){
                    if(!str2.equals("{")){
                        flag = false;
                        break;
                    }
                } else {
                    if(!str2.equals("[")){
                        flag = false;
                        break;
                    }
                }
            }
        }
        if(stack.size() != 0){
            flag = false;
        }
        return flag;
    }
}