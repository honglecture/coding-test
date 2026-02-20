    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;

    class Solution {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("flower");
            list.add("fkow");
            String[] array = new String[list.size()];
            longestCommonPrefix(list.toArray(array));
        }
        public static String longestCommonPrefix(String[] strs) {
            List<String> list = Arrays.asList(strs);
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });
            String answer = list.get(0);
            while (true) {
                boolean flag = true;
                for (String str : list) {
                    if(!answer.equals(str.substring(0, answer.length()))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    break;
                }
                if(answer.length() == 1){
                    answer = "";
                    break;
                }
                answer = answer.substring(0, answer.length() - 1);
            }
            System.out.println(answer);
            return answer;
        }
    }