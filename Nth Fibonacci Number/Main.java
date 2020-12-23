#include <iostream>
using namespace std;
int fibonic(int num)
{
  int arr[100];
  arr[0]=0;
  arr[1]=1;
  for(int i=2;i<num;i++)
  {
    arr[i]=arr[i-1]+arr[i-2];
  }
  return arr[num-1];
}
int main() 
{
 int num;
 cin>>num;
 cout<<fibonic(num);
}