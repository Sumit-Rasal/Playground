#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
   int a;
  cin>>a;
  float check;
  check=sqrt(a);
  if(check - floor(check) == 0)
  {
     cout<<"YES";
  }
  else
  {
     cout<<"NO";
  }
    return 0;
}