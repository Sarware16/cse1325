#include <iostream>
#include <vector>
#include <fstream>
#include "Matrix3.h"

using namespace std;

int main(int argc, char const *argv[])
{
	int a_data[9];
	int b_data[9];

	ifstream in{ argv[1] };

    string buff;

    getline (in, buff);

    in >> a_data[0] >> a_data[1] >> a_data[2];

    getline (in, buff);

    in >> a_data[3] >> a_data[4] >> a_data[5];

    getline (in, buff);

    in >> a_data[6] >> a_data[7] >> a_data[8];

    in.close();

    ifstream in1{ argv[2] };

    getline (in1, buff);

    in1 >> a_data[0] >> a_data[1] >> a_data[2];

    getline (in1, buff);

    in1 >> a_data[3] >> a_data[4] >> a_data[5];

    getline (in1, buff);

    in1 >> a_data[6] >> a_data[7] >> a_data[8];

    in1.close();

    Matrix3 g(a_data[0], a_data[1], a_data[2],
             a_data[3], a_data[4], a_data[5],
             a_data[6], a_data[7], a_data[8]);

    Matrix3 h(b_data[0], b_data[1], b_data[2],
             b_data[3], b_data[4], b_data[5],
             b_data[6], b_data[7], b_data[8]);

    Matrix3 i = g + h;

    ofstream out{ "added.txt" };

    out << i.get(0, 0) << " ";
    out << i.get(0, 1) << " ";
    out << i.get(0, 2) << "\n";

    out << i.get(1, 0) << " ";
    out << i.get(1, 1) << " ";
    out << i.get(1, 2) << "\n";

    out << i.get(2, 0) << " ";
    out << i.get(2, 1) << " ";
    out << i.get(2, 2) << "\n";

    out.close();

    ifstream in2{ "added.txt" };

    getline (in2, buff);

    in2 >> a_data[0] >> a_data[1] >> a_data[2];

    getline (in2, buff);

    in2 >> a_data[3] >> a_data[4] >> a_data[5];

    getline (in2, buff);

    in2 >> a_data[6] >> a_data[7] >> a_data[8];

    in2.close();

    Matrix3 j(a_data[0], a_data[1], a_data[2],
             a_data[3], a_data[4], a_data[5],
             a_data[6], a_data[7], a_data[8]);

    cout << j << "\n";
	return 0;
}