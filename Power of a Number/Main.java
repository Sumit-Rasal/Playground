#include <iostream>
#include <cmath>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(b>=0 && a != 0){
    cout<<pow(a,b);
  }
  else
  {
    cout<<"Wrong input";
  }
}