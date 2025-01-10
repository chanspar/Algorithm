import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<long[]> points = new ArrayList<>();
        long minX = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE;
        long maxY = Long.MIN_VALUE;
        
        // 교점 찾기
        for (int i = 0; i < line.length - 1; i++) {
            for (int j = i + 1; j < line.length; j++) {
                long a = line[i][0];
                long b = line[i][1];
                long e = line[i][2];
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];
                
                // ad - bc = 0인 경우 두 직선은 평행 또는 일치
                long denominator = a * d - b * c;
                if (denominator == 0) continue;
                
                // 교점 좌표 계산
                long xNumerator = b * f - e * d;
                long yNumerator = e * c - a * f;
                
                // 정수 좌표만 저장
                if (xNumerator % denominator == 0 && yNumerator % denominator == 0) {
                    long x = xNumerator / denominator;
                    long y = yNumerator / denominator;
                    points.add(new long[]{x, y});
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }
        
        // 2차원 배열로 변환
        int height = (int)(maxY - minY + 1);
        int width = (int)(maxX - minX + 1);
        char[][] map = new char[height][width];
        
        // 배열 초기화
        for (int i = 0; i < height; i++) {
            Arrays.fill(map[i], '.');
        }
        
        // 교점 표시
        for (long[] point : points) {
            int x = (int)(point[0] - minX);
            int y = (int)(maxY - point[1]);
            map[y][x] = '*';
        }
        
        // String 배열로 변환
        String[] answer = new String[height];
        for (int i = 0; i < height; i++) {
            answer[i] = new String(map[i]);
        }
        
        return answer;
    }
}