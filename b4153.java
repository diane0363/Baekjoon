/*
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 
주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

[입력]
입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 
각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

[출력]
각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] sa = br.readLine().split(" ");
            int[] ia = new int[3];

            for (int i = 0; i < 3; i++) {
                ia[i] = Integer.parseInt(sa[i]);
            }

            if (ia[0] == 0) {
                break;
            }

            Arrays.sort(ia);
            if (ia[0] * ia[0] + ia[1] * ia[1] == ia[2] * ia[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }

    void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // split함수는 무조건 String[] 을 리턴! int[]에 바로 담을 수 없움
        // for문을 통해 Integer.parseInt() 변환 필요
        // 1. 배열에 담아서 사용
        // 데이터 개수를 정확히 알때 무조건 배열이 유리
        // 속도와 효율이 필요할 때; 크기가 고정되어있어 적은 메모리, 빠른 속도
        String[] sa = br.readLine().split(" ");
        int[] ia = new int[sa.length];

        for (int i = 0; i < sa.length; i++) {
            ia[i] = Integer.parseInt(sa[i]);
        }

        // list에 담아도 마찬가지
        List<Integer> il = new ArrayList<>();
        for (String s : sa) {
            il.add(Integer.parseInt(s));
        }

        // 3. Stream 사용
        // 코드는 간결하지만 for문보다 실행속도가 미세하게 느리다고
        int[] ia2 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt) // 정수 변환
                .toArray(); // 배열로 묶어 반환

        // pop() 은 스택이나 덱에서 사용 가능. 배열이나 리스트는 사용 불가능
        // System.out.println();

        // // 다음줄을 읽지 못해서 영원히 탈출하지 못 해,,,,
        // while (ia[0] != 0) {
        // Arrays.sort(ia);
        // if (ia[0] * ia[0] + ia[1] * ia[1] == ia[2] * ia[2]) {
        // System.out.println("right");
        // } else {
        // System.out.println("wrong");
        // }

        // }

    }
}
