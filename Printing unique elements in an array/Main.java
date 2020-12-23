#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
     cin>>arr[i];
  }
 for(int i=0;i<n;i++)
 {  
     int flage;
     for(int j=0;j<n;j++)
     {
         flage=0;
         if(arr[i]==arr[j] && i != j)
         {
            flage=1;
            break;
         }
         
     }
   if(flage==0)
   {
       cout<<arr[i]<<" ";
   }
 }
}