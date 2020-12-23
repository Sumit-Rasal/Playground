#include <iostream>
#include<cstring>
#include<cmath>
using namespace std;

int main() 
{
  char arr[100];
  cin.getline(arr,100);
  int l,sum=0;
  int count=0;
  l=strlen(arr);
  for(int i=l-1;i>=0;i--)
  {
      if(arr[i]=='1')
      {
         int p=pow(2,count);
         sum=sum+p;   
      }
     count++;
  }
  cout<<sum;
}