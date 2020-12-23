#include <iostream>
using namespace std;

int main() 
{
  int num;
  int arr[100];
  arr[0]=0;
  arr[1]=1;
  cin>>num;
  for(int i=2;i<num;i++)
  {
       arr[i]=arr[i-1]+arr[i-2];
     
  }
  for(int i=0;i<num;i++)
  {
     cout<<arr[i]<<' ';
  }
}