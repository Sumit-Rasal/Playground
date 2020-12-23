#include <iostream>
#include <stdio.h>
#include <math.h>
using namespace std;
int main()
{
   int n,output;
  cin>>n;
  if(n % 2 == 0 )
  {
     output=pow(3,(n/2)-1);
  }
  else
  {
     output=pow(2,(n/2));
  }
  printf("%d",output);
}

