#include <iostream>
#include <string>
#include <cstring>
using namespace std;

int main() 
{
   int n,rem,count=0;
   int arr[20];
   cin>>n;
   do
   {
      rem=n%8;
     arr[count]=rem;
      n=n/8;
      count++;
   }while( n != 0 );
  arr[count]='\0';
 for(int i=count-1;i>=0;i--)
 {
      cout<<arr[i];
 }
}