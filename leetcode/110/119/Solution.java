import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> answerList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        answerList.add(tempList);
        if(numRows == 0){
            return answerList.get(answerList.size() - 1);
        }
        tempList = new ArrayList<>();
        tempList.add(1);
        tempList.add(1);
        answerList.add(tempList);
        if(numRows == 1){
            return answerList.get(answerList.size() - 1);
        }
        
        for (int i = 2; i <= numRows; i++) {
            List<Integer> mainList = answerList.get(i - 1);
            List<Integer> innerList = new ArrayList<>();
            int size = mainList.size();
            for (int j = 0; j <= size; j++) {
                if(j == 0 || j == size){
                    innerList.add(1);
                    continue;
                }
                int n1 = mainList.get(j - 1);
                int n2 = mainList.get(j);
                innerList.add(n1 + n2);
            }
            answerList.add(innerList);
        }
        return answerList.get(answerList.size() - 1);
    }
}