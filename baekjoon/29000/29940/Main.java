    // https://www.acmicpc.net/problem/29940
    // Sum
    import java.io.*;
    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            int sum = Integer.parseInt(sArray[1]);
            int answer = 0;
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(bf.readLine());
            }
            Arrays.sort(array);
            int left = 0;
            int right = array.length - 1;
            while (true) {
                if(left >= right){
                    break;
                }
                int result = array[left] + array[right];
                if(result < sum){
                    left++;
                } else if(result > sum){
                    right--;
                } else {
                    answer++;
                    left++;
                }
            }
            System.out.println(answer);
            bw.flush();
            bw.close();
        }

        

    }
