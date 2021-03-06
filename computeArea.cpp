#include <iostream>
#include <cmath>    //sqrt()
#include <fstream>  //ofstream

using namespace std;

int main()
{
    float a = 0, b = 0, c = 0;
    float s = 0;
    double area = 0;
    int questionCnt = 0;

    //open file
    ofstream fout;
    fout.open("cpp_result.txt");    //預設寫入模式

    while(++questionCnt){
        cout << "Please Input first number:" << endl;
        cin >> a;
        cout << "Please Input second number:" << endl;
        cin >> b;
        cout << "Please Input third number:" <<endl;
        cin >> c;
        //輸入全為-1則中斷
        if(a==-1 && b==-1 && c==-1)
            break;

        //write input to cpp_result.txt
        fout << "Question " << questionCnt << " inputs are, "
             << "a = " << a << ", " << "b = " << b << ", " << "c = " << c << "." << endl;

        //檢查邊長是否合法
        if( (a<0 || b <0 || c<0)
        || (a+b<=c || a+c<=b || b+c<=a) ){
            fout << "The input is not legal." << endl;
            cout << "The input is not legal." << endl;
            continue;
        }

        //compute area
        s = (a + b + c) / 2;
        area = sqrt( (double)(s*(s-a)*(s-b)*(s-c)) );
        fout << "The Area of this triangle is " << area << "." <<endl;
        cout << "The Area of this triangle is " << area << "." <<endl;
        cout << "The answer has been output to cpp_result.txt" << endl;
    }

    //close file
    fout.close();

    return 0;
}