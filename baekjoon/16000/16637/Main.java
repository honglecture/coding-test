// https://www.acmicpc.net/problem/16637
// 괄호 추가하기
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    private static boolean[] visitArray;
    private static String[] array;
    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = bf.readLine().split("");
        if(size == 1){
            bw.write(array[0] + "\n");
        } else {
            visitArray = new boolean[size / 2];
            getAnswer(0, 0);
            bw.write(answer +  "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count){
        if(index > visitArray.length - 1){
            boolean flag = true;
            for (int i = 0; i < visitArray.length - 1; i++) {
                boolean b1 = visitArray[i];
                boolean b2 = visitArray[i + 1];
                if(b1 && b2){
                    flag = false;
                    break;
                }
            }
            if(flag){
                // 여기서 계산
                List<String> list = new ArrayList<>();
                int n = 0;
                while(true){
                    if(n > visitArray.length - 1){
                        break;
                    }
                    int currentIndex = n * 2;
                    if(visitArray[n]){
                        int n1 = Integer.parseInt(array[currentIndex]);
                        String op = array[currentIndex + 1];
                        int n2 = Integer.parseInt(array[currentIndex + 2]);
                        if(op.equals("+")){
                            list.add(String.valueOf(n1 + n2));
                        } else if(op.equals("-")){
                            list.add(String.valueOf(n1 - n2));
                        } else {
                            list.add(String.valueOf(n1 * n2));
                        }
                    } else {
                        if(n == 0 || !visitArray[n - 1]){
                            list.add(array[currentIndex]);
                            list.add(array[currentIndex + 1]);
                        } else {
                            list.add(array[currentIndex + 1]);
                        }
                    }
                    n++;
                }
                if(!visitArray[visitArray.length - 1]){
                    list.add(array[array.length - 1]);
                }
                int result = getResult(list);
                if(result > answer){
                    answer = result;
                }
            }
            return;
        }
            visitArray[index] = true;
            getAnswer(index + 1, count + 1);
            visitArray[index] = false;
            getAnswer(index + 1, count + 1);
    }

    private static int getResult(List<String> list){
        int answer = 0;
        Stack<String> stack = new Stack<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.add(list.get(i));
        }
        while(stack.size() != 1){
            int n1 = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int n2 = Integer.parseInt(stack.pop());
            if(op.equals("+")){
                stack.add(String.valueOf(n1 + n2));
            } else if(op.equals("-")){
                stack.add(String.valueOf(n1 - n2));
            } else {
                stack.add(String.valueOf(n1 * n2));
            }
        }
        answer = Integer.parseInt(stack.pop());
        return answer;
    }

}
