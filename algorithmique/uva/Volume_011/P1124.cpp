#include <iostream>
#include <string>

using namespace std;

int main() {
    string ligne;
    while( getline( cin, ligne ) ) {
       cout << ligne + "\n";
    }
}


