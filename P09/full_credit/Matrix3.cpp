#include <iostream>
#include <vector>
#include <fstream>
#include "Matrix3.h"

	Matrix3::Matrix3(int m00, int m01, int m02, int m10, int m11, int m12, int m20, int m21, int m22)
        : data{ { m00, m01, m02 }, { m10, m11, m12 }, { m20, m21, m22 } }
    {
    }

	int Matrix3::get(int x, int y)
    {
        if ((x < 0) || (x > 2) || (y < 0) || (y > 2))
        {
            throw std::runtime_error("Index out of range");
        }

        return data[x][y];
    }

    std::ostream &operator<<(std::ostream &out, Matrix3 &m)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                out << m.data[i][j] << " ";
            }
            out << "\n";
        }

        return out;
    }

    std::istream& operator>>(std::istream &in, Matrix3 &m)
    {
        in >> m.data[0][0];
        in >> m.data[0][1];
        in >> m.data[0][2];
        in >> m.data[1][0];
        in >> m.data[1][1];
        in >> m.data[1][2];
        in >> m.data[2][0];
        in >> m.data[2][1];
        in >> m.data[3][2];
        return in;
    }

    Matrix3 operator+(const Matrix3 &a, const Matrix3 &b)
    {
        return Matrix3(a.data[0][0] + b.data[0][0],
                       a.data[0][1] + b.data[0][1],
                       a.data[0][2] + b.data[0][2],
                       a.data[1][0] + b.data[1][0],
                       a.data[1][1] + b.data[1][1],
                       a.data[1][2] + b.data[1][2],
                       a.data[2][0] + b.data[2][0],
                       a.data[2][1] + b.data[2][1],
                       a.data[2][2] + b.data[2][2]);
    }	
