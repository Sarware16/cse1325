#include <iostream>
#include <vector>
#include <fstream>
#include "Matrix3.h"

using namespace std;



int main()
{
    Matrix3 a(1, 2, 3, 1, 2, 3, 1, 2, 3);
    Matrix3 b(1, 2, 3, 1, 2, 3, 1, 2, 3);
    Matrix3 c = a + b;

    bool ok = true;

    for (int i = 0; ok && i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (c.get(i, j) != (a.get(i, j) + b.get(i, j)))
            {
                cerr << "Addition failed\n";
                ok = false;
                break;
            }
        }
    }


    return 0;
}
