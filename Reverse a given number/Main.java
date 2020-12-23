#include <iostream>
#include <cstring>
using namespace std;

int main() 
{
  int num,temp;
  int count=0;
  int arr[100];
   cin>>num;
  while(num != 0)
  {
      temp=num % 10;
      arr[count]=temp;
      num=num/10;
      count++;
  }
 for(int i=0; i< count;i++)
 {
    cout<<arr[i];
 }
}