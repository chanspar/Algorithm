#include <string>
#include <vector>

using namespace std;

string solution(vector<int> numbers, string hand) {
    string answer = "";
    int posXL = 0, posXR = 2, posYL = 3, posYR = 3;
    for (int i : numbers) {
       if (i == 0) i = 11; 
       if (i % 3 == 1) {
           posXL = 0;
           posYL = i / 3;
           answer += "L";
       } else if (i % 3 == 0) {
           posXR = 2;
           posYR = i / 3 - 1;
           answer += "R";
       } else {
           int midx = i % 3 - 1, midy = i / 3;
           int difL, difR;
           difL = abs(midx - posXL) + abs(midy - posYL);
           difR = abs(midx - posXR) + abs(midy - posYR);
           if (difL == difR) {
               if (hand == "left") {
                   posXL = midx;
                   posYL = midy;
                   answer += "L";
               } else {
                   posXR = midx;
                   posYR = midy;
                   answer += "R";
               }
           } else if (difL > difR) {
                posXR = midx;
                posYR = midy;
                answer += "R";
           } else {
                posXL = midx;
                posYL = midy;
                answer += "L";
           }
           
           
       }
    }
    
    
    return answer;
}