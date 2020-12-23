#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y,profit,income,perches;
  int delivery=100;
  cin>>w;
  cin>>x;
  cin>>y;
  income=w*x;
  perches=w*y;
  profit=(income-perches)-delivery;
  cout<<profit;
  return 0;
  
}