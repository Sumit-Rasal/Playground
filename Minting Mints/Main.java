#include <iostream>
using namespace std;

int main() 
{
   int mints,length,sum=0;
  cin>>mints>>length;
  int a[length];
  a[0]=sum=mints;
  for(int i=1;i<length;i++)
  {
    a[i]=sum-1;
    sum=sum+a[i];
  }
  cout<<sum;
}