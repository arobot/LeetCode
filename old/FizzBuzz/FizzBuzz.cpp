#include <iostream>
#include <stdio.h>
#include <vector>
#include <string>
#include <stdlib.h>
using namespace std;


vector<string> fizzBuzz(int n);


int main(){
    vector<string> strings;
    int n = 0;
    cin >> n;
    strings = fizzBuzz(n);
    for (int i = 0; i < n; ++i) {
        cout << "i=" << i + 1 << ":";
        cout << strings[i] << endl;
    }
	system("PAUSE");
	return 0;
}

vector<string> fizzBuzz(int n) {
    vector<string> temp;
    string str;
    int i = 1;

    while (i <= n) {
        char ch[32];
        sprintf(ch, "%d", i);
        str = ch;
        if (i % 3 == 0) {
            str = "Fizz";
            if (i % 5 == 0) {
                str = "FizzBuzz";
            }
        } else if (i % 5 == 0) {
            str = "Buzz";
        }
        temp.push_back(str);
        i++;
    }
    return temp;
}
