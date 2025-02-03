

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Map<Character, Integer> mp = new HashMap<>();
        
        // 각 문자의 개수 세기
        for(char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        
        // 홀수 개수인 문자 찾기
        char mid = 0;
        int oddCount = 0;
        StringBuilder front = new StringBuilder();
        
        // 알파벳 순으로 처리하기 위해 정렬된 키셋 사용
        List<Character> keys = new ArrayList<>(mp.keySet());
        keys.sort((a,b) -> a - b);
        // Collections.sort(keys);
        
        for(char c : keys) {
            if(mp.get(c) % 2 == 1) {
                oddCount++;
                mid = c;
            }
            // 앞부분 문자열 만들기
            for(int i = 0; i < mp.get(c)/2; i++) {
                front.append(c);
            }
        }
        
        // 홀수 개수가 1개 초과면 팰린드롬 불가능
        if(oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        
        StringBuilder result = new StringBuilder(front);
        if(oddCount == 1) {
            result.append(mid);
        }
        result.append(front.reverse());
        
        System.out.println(result);
    }
}
