#include <iostream>
using namespace std;
#include <cmath>
int order(int n1)
{
  int count=0,digit;
    while(n1)
  {
     digit=n1%10;
     n1=n1/10;
     count++;
  }
  return count;
}
int amstrong(int x)
{
  int last,p,sum,k;
   k=order(x);
   while( x != 0)
 {
     last=x%10;
     p=pow(last,k);
     sum=sum+p;
     x=x/10;
     p=0;
 }
  return sum;
}
int main() 
{
   int n;
   cin>>n;
  if(amstrong(n) == n)
  {
     cout<<"ARMSTRONG";
  }
  else
  {
    cout<<"NOT AN ARMSTRONG";
  }
    return 0;
}