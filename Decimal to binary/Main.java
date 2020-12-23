#include <iostream>
using namespace std;

int main() 
{
   int n,temp=0;
   int btc[32];
   int t;
  cin>>n;
  while(n != 0)
  {
     t=n%2;
     btc[temp]=t;
     n=n/2;
     temp++;
  }
  for(int i=(temp -1);i>=0;i--)
  {
     cout<<btc[i];
  }
    return 0;
}