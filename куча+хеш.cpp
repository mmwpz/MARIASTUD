//куча

#include <iostream>
#include <queue>
using namespace std;

int main() {
    priority_queue<int> pq;
    pq.push(10);
    pq.push(5);
    cout << pq.top(); // 10 (max-heap)
}


//хеш
#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> map;
    map["a"] = 1;
    map["b"] = 2;
    for (auto &p : map) cout << p.first << "=" << p.second << " ";
}
