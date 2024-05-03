#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cstring>
#include <map>
#include <string>
#include <stack>
#include <queue>

using namespace std;

bool checkVoewl(char c) {
	char vowel[] = {'a', 'e', 'i', 'o', 'u'};

	for (int i = 0; i < 5; i++) {
		if (c == vowel[i]) return true;
	}
	return false;
}

bool checkRules(string s) {
	bool isVowel = false;
	bool checkTwo = true;
	bool checkThree = true;
	string vowel[] = {"a", "e", "i", "o", "u"};

	//#1
	for (int i = 0; i < 5; i++) {
		if (s.find(vowel[i]) != string::npos) {
			isVowel = true;
		}
	}

	//#2
	int cnt = 0;
	for (size_t i = 0; i < s.size() - 1; i++) {
		if (checkVoewl(s[i]) == true && checkVoewl(s[i + 1]) == true) {
			cnt++;
		} else if (checkVoewl(s[i]) == false && checkVoewl(s[i + 1]) == false){
			cnt++;
		} else {
			cnt = 0;
		}
		if (cnt == 2) {
			checkThree = false;
		}
	}


	//#3
	for (size_t i = 0; i < s.size() - 1; i++) {
		if (s[i] == s[i + 1] && s[i] != 'e' && s[i] != 'o') {
			return false;
		} 
	}


	if (isVowel == true && checkThree == true && checkTwo == true) {
		return true;
	}
	return false;

}

int main() {
	//rule
	string s;

	while (cin >> s) {
		if (s == "end")
			break;
		if (checkRules(s) == true) {
			cout << "<" << s << "> " << "is acceptable.\n";
		} else {
			cout << "<" << s << "> " << "is not acceptable.\n";
		}
	}
	return 0;
}
