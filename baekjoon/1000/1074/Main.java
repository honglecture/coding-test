// https://www.acmicpc.net/problem/1074
// Z
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    private static int yLength;
    private static int targetY;
    private static int targetX;
    private static List<Integer> list;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        targetY = Integer.parseInt(sArray[1]);
        targetX = Integer.parseInt(sArray[2]);
        yLength = (int)Math.pow(2, n1);
        list = new ArrayList<>();
        int startY = 0;
        int startX = 0;
        n1 = yLength;
        while(true){
            n1 = n1 / 2;
            if(n1 == 1){
                break;
            }
            if(startY <= targetY && startY + n1 > targetY){
                if(startX <= targetX && startX + n1 > targetX){
                    list.add(0);
                } else {
                    list.add(1);
                    startX += n1;
                }
            } else {
                if(startX <= targetX && startX + n1 > targetX){
                    list.add(2);
                    startY += n1;
                } else {
                    list.add(3);
                    startY += n1;
                    startX += n1;
                }
            }
        }
        getAnswer();
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(){
        int start1 = yLength * yLength;
        int start2 = yLength;
        int num = 0;
        int y = 0;
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            num += (start1 / 4) * n;
            start1 /= 4;
            if(n == 0){
            } else if(n == 1){
                x += start2 / 2;
            } else if(n == 2){
                y += start2 / 2;
            } else {
                x += start2 / 2;
                y += start2 / 2;
            }
            start2 /= 2;
        }
        if(y == targetY && x == targetX){
            answer = num;
        } else if(y == targetY && x + 1 == targetX){
            answer = num + 1;
        } else if(y + 1 == targetY && x == targetX){
            answer = num + 2;
        } else if(y + 1 == targetY && x + 1 == targetX){
            answer = num + 3;
        }
    }


    
}