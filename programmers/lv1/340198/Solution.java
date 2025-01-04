

class Solution {

    public static void main(String[] args) {
        int[] mats = {1, 2, 4};
        String[][] park = {
            {"A", "A", "-1", "B", "B", "B", "B", "-1"}, 
            {"A", "A", "-1", "B", "B", "B", "B", "-1"}, 
            {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, 
            {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, 
            {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, 
            {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
        int result = solution(mats, park);
        System.out.println(result);
    }

    public static int solution(int[] mats, String[][] park) {
        int answer = -1;
        for (int i = 0; i < mats.length; i++) {
            int key = mats[i];
            for (int j = 0; j < park.length; j++) {
                for (int k = 0; k < park[j].length; k++) {
                    if(!park[j][k].equals("-1")){
                        continue;
                    }
                    if(key + j > park.length){
                        continue;
                    }
                    if(key + k > park[0].length){
                        continue;
                    }
                    boolean flag = true;
                    for (int l = j; l < key + j; l++) {
                        for (int m = k; m < key + k; m++) {
                            if(!park[l][m].equals("-1")){
                                flag = false;
                                break;
                            }
                        }
                        if(!flag){
                            break;
                        }
                    }
                    if(flag){
                        answer = Integer.max(answer, key);
                    }
                }
            }
        }
        return answer;
    }
}