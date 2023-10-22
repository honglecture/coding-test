// https://www.acmicpc.net/problem/2343
// 기타 레슨
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        sArray = bf.readLine().split(" ");
        int sum = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] =  Integer.parseInt(sArray[i]);
            sum += array[i];
            if(array[i] > max){
                max = array[i];
            }
        }
        int start = max;
        int end = sum;
        int answer = Integer.MAX_VALUE;
        while(true){
            if(start > end){
                break;
            }
            int mid = (end + start) / 2;
            int index = 0;
            int count = 1;
            sum = 0;
            boolean flag = false;
            while(true){
                if(index > array.length - 1){
                    break;
                }
                if(count > key){
                    flag = true;
                    break;
                }
                if(array.length - index == key - count){
                    index = array.length;
                    count = key;
                    break;
                }
                int n = array[index];
                if(sum + n > mid){
                    count++;
                    sum = 0;
                } else {
                    index++;
                    sum += n;
                }
            }
            if(flag){
                start = mid + 1;
                continue;
            }
            if(count == key){
                if(answer > mid){
                    answer = mid;
                }
                end = mid - 1;
            } else if(count > key){
                start = mid + 1;
            } else if(count < key){
                end = mid - 1;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}

//4 2
//2 2 2 8


