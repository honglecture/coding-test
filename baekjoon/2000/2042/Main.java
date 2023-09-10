// https://www.acmicpc.net/problem/2042
// 조합 0의 개수
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
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int k = Integer.parseInt(sArray[2]);
        long[] array = new long[n + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = Long.parseLong(bf.readLine());
        }
        SegmentTree stree = new SegmentTree(n);
        stree.init(array,1,1,n);
        for (int i = 0; i < m + k; i++) {
            sArray = bf.readLine().split(" ");
            int cmd = Integer.parseInt(sArray[0]);
            int a = Integer.parseInt(sArray[1]);
            long b = Long.parseLong(sArray[2]);
            // 변경
            if(cmd == 1){
                stree.update(1,1,n,a,b-array[a]);
                array[a] = b;
            // 구간합
            } else if(cmd == 2){
                bw.write(stree.sum(1,1,n,a,(int)b) +"\n");
            }
        }
        bw.flush();
        bw.close();
    }
    static class SegmentTree{
        long tree[];
        int treeSize;

        public SegmentTree(int arrSize){
            int h = (int) Math.ceil(Math.log(arrSize)/ Math.log(2));

            this.treeSize = (int) Math.pow(2,h+1);
            tree = new long[treeSize];
        }

        public long init(long[] arr, int node, int start,int end){
            
            if(start == end){
                return tree[node] = arr[start];
            }

            return tree[node] =
            init(arr,node*2,start,(start+ end)/2)
            + init(arr,node*2+1,(start+end)/2+1,end);
        }

        public void update(int node, int start, int end, int idx, long diff){
            if(idx < start || end < idx) return;

            tree[node] += diff;

            if(start != end){
                update(node*2, start, (start+end)/2, idx, diff);
                update(node*2+1, (start+end)/2+1, end, idx, diff);
            }
        }

        public long sum(int node, int start, int end, int left, int right){
            if(left > end || right < start){
                return 0;
            }

            if(left <= start && end <= right){
                return tree[node];
            }

            return sum(node*2, start, (start+end)/2, left, right)+
                    sum(node*2+1, (start+end)/2+1, end, left, right);
        }
    }

}