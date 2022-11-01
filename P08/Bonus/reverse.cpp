#include <iostream>
#include <bits/stdc++.h>


using namespace std;

int main(){

	string Name;
	cout << "Enter a string: ";

	getline(cin, Name);
	reverse(Name.begin(), Name.end());

	for(char c: Name){
		std::cout << c << std::endl;
	}



	return 0;
}