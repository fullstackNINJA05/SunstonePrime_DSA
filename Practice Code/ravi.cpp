#include <iostream>
using namespace std;

int main()
{
    int it = 6;
    int space = 1;

    for (int i = 0; i < 4; i++)
    {

        for (int j = it; j > 0; j -= 2)
        {
            cout << "    ";
        }

        it -= 2;

        for (int k = i + 1; k > 0; k--)
        {
            cout << k << " ";
        }
        if (i == 0)
        {
            cout << endl;
            continue;
        }
        for (int l = 1; l <= space; l++)
        {
            cout << "  ";
        }
        space += 2;

        for (int m = 1; m <= i + 1; m++)
            cout << m << " ";
        cout << endl;
    }

    it = 2;
    space = 3;
    
    for (int i = 4; i >0; i--)
    {
        for (int j = 0; j <it; j += 2)
        {
            cout << "    ";
        }
        it += 2;

        for (int k = i-1 ; k > 0; k--)
        {
            cout << k << " ";
        }
        if (i == 0)
        {
            cout << endl;
            continue;
        }
        for (int l = space; l >=1; l--)
        {
            cout << "  ";
        }
        space -= 2;

        if(i > 2){
            for (int m = 1; m <= i - 1; m++)
            cout << m << " ";
        }
        cout << endl;
    }
}