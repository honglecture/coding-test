// https://www.acmicpc.net/problem/10868
// 최솟값
import java.io.*;
public class Main {

    static int[] array, minTree;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        array = new int[size1 + 1];
        for (int i = 1; i <= size1; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        minTree = new int[size1 * 4];
        minInit(1, size1, 1);
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int start = Integer.parseInt(sArray[0]);
            int end = Integer.parseInt(sArray[1]);
            bw.write(minFind(1, size1, 1, start, end) + "\n");
        }
        bw.flush();
        bw.close();
    }

    // 각 구간 별로 최솟값을 저장.
	public static int minInit(int start, int end, int node) {
		if (start == end) {
			return minTree[node] = array[start];
		}

		int mid = (start + end) / 2;
		return minTree[node] = Math.min(minInit(start, mid, node * 2), minInit(mid + 1, end, node * 2 + 1));
	}

    // left ~ right 범위 내에 최솟값을 찾음.
	public static int minFind(int start, int end, int node, int left, int right) {
		// 범위를 벗어난 경우
		if (right < start || end < left) {
			return Integer.MAX_VALUE;
		}

		// 범위 안에 있는 경우
		if (left <= start && end <= right) {
			return minTree[node];
		}

		int mid = (start + end) / 2;

		return Math.min(minFind(start, mid, node * 2, left, right), minFind(mid + 1, end, node * 2 + 1, left, right));
	}
}