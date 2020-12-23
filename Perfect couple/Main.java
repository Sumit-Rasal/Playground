#include <iostream>
using namespace std;

int main() 
{
   int size;
  cin>>size;
  int arr[size];
  for(int i=0;i<size;i++)
  {
     cin>>arr[i];
  }
  int sum,flage=0;
  cin>>sum;
  for(int i=0;i<size;i++)
  {
     for(int j=0;j<size;j++)
     {
        if(arr[i]+arr[j] == sum && i != j)
        {
          flage=1;
           cout<<"Perfect couple: "<<arr[i]<<" "<<arr[j];
           exit(0);
        }
     }
  }
  if(flage==0)
  {
     cout<<"No perfect couple found!";
  }
}