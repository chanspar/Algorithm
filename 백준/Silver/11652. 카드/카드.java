import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long l = Long.parseLong(br.readLine());
            mp.put(l, mp.getOrDefault(l, 0) + 1);
        }

        // 키 값을 리스트로 변환
        List<Long> li = new ArrayList<>(mp.keySet());

        // 정렬 기준:
        // 1. 빈도수 내림차순 (많이 나온 숫자가 먼저)
        // 2. 빈도수가 같으면 숫자 오름차순 (작은 숫자가 먼저)
        li.sort((a, b) -> {
            int freqA = mp.get(a);
            int freqB = mp.get(b);

            if (freqA == freqB) {
                return Long.compare(a, b); // 숫자가 작은 순으로 정렬
            }
            return Integer.compare(freqB, freqA); // 빈도수 높은 순으로 정렬
        });

        // 최빈값 출력
        System.out.println(li.get(0));
    }
}
