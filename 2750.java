import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];

        for (int i=0; i<count; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);
        // foreach 구문과 같은 효과.
        // arr에 속한 각각의 int 구성요소들을 차례로 출력
        for (int i : arr){
            System.out.println(i);
        }
    }
}
