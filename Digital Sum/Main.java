#include<iostream>
using namespace std;

int sumofdigits(int num);
int main()
{ 
    int num, sod;
cin>>num;
    sod = num;
    while(sod >9)
    {
        sod = sumofdigits(sod); 
    }
    cout<<sod;
    return 0;
}
int sumofdigits(int num)
{   
    int rem, sum=0;
    while(num != 0)
    {
        rem = num % 10;
        sum = sum + rem;
		num = num / 10;
    } 
    return sum;  
}