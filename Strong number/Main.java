#include <iostream>
using namespace std;
int main()
{
  int num,digit=0;
  int sum=1;
  int strong=0;
  int temp;
  cin>>num;
  temp=num;
  while(num != 0)
  {
      digit=num%10;
      for(int i=1;i<=digit;i++)
      {
        sum=sum*i;
      }
    strong=strong+sum;
    sum=1;
    num=num/10;
  }
  if(strong == temp)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  return 0;
}