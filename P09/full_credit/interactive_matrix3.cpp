#include <iostream>
#include <vector>
#include <fstream>
#include "Matrix3.h"

using namespace std;

int main()
{
	cout << "Enter two 3x3 matrices\n";

    int a_data[9];
    int b_data[9];

    cin >> a_data[0] >> a_data[1] >> a_data[2];
    cin >> a_data[3] >> a_data[4] >> a_data[5];
    cin >> a_data[6] >> a_data[7] >> a_data[8];

    cout << "Enter another 3x3 matrix------\n";

    cin >> b_data[0] >> b_data[1] >> b_data[2];
    cin >> b_data[3] >> b_data[4] >> b_data[5];
    cin >> b_data[6] >> b_data[7] >> b_data[8];

    Matrix3 d(a_data[0], a_data[1], a_data[2],
             a_data[3], a_data[4], a_data[5],
             a_data[6], a_data[7], a_data[8]);

    Matrix3 e(b_data[0], b_data[1], b_data[2],
             b_data[3], b_data[4], b_data[5],
             b_data[6], b_data[7], b_data[8]);

    Matrix3 f = d + e;

    cout << "\n" << d << "\n";
    cout << "   +\n\n";
    cout << e << "\n";
    cout << "   =\n\n";
    cout << f << "\n";

	return 0;
}