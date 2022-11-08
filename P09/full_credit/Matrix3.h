#include <iostream>
#include <exception>
#include <vector>
#include <fstream>

using std::vector;

class Matrix3
{
    public:
        Matrix3(int m00, int m01, int m02, int m10, int m11, int m12, int m20, int m21, int m22);
        int get(int x, int y);
        friend std::ostream& operator<<(std::ostream &out, Matrix3 &m);
        friend std::istream& operator>>(std::istream &in, Matrix3 &m);
        friend Matrix3 operator+(const Matrix3 &a, const Matrix3 &b);
   
    private:
        vector<vector<int>> data;
};