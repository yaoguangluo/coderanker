#include <iostream>
#include <vector>
using namespace std;
class solution {
public:
    static int numbers[];
    const char* grundy(vector<int>& a) {
        int val = numbers[a[0]];
        for(int i=1; i<a.size(); ++i) {
            val ^= numbers[a[i]];
        }
        return (val==0) ? "BOB" : "ALICE";
    }
};
int solution::numbers[] = {-1,0,0,1,0,2,3,4,0,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46};
int main() {
    int n;
    solution g;
    cin >> n;
    for(int i=0; i<n; ++i) {
        int num1;
        cin >> num1;
        vector<int> vect;
        for (int j=0; j<num1; ++j) {
            int num;
            cin >> num;
            vect.push_back(num);
        }
        cout << g.grundy(vect) <<"\n";
    }
    return 0;
}
