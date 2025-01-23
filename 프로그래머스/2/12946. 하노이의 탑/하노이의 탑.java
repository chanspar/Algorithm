class Solution {
    static int i = 0;  // i 값 초기화 추가
    
    public int[][] solution(int n) {
        // 하노이의 이동 횟수는 2^n - 1
        int moves = (int) Math.pow(2, n) - 1;
        int[][] answer = new int[moves][2];
        recursion(n, 1, 2, 3, answer);
        i = 0;  // 다음 테스트 케이스를 위해 i 초기화
        return answer;
    }
    
    private void recursion(int n, int start, int mid, int end, int[][] ans) {
        if (n == 1) {
            ans[i][0] = start;
            ans[i][1] = end;
            i++;
            return;
        }
        
        recursion(n - 1, start, end, mid, ans);
        ans[i][0] = start;
        ans[i][1] = end;
        i++;
        recursion(n - 1, mid, start, end, ans);
    }
}
