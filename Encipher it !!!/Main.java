#include <iostream>
#include <stdio.h>
using namespace std;

int main() 
{
  char a;
  int n;
  cin>>a;
  cin>>n;
  int number;
  if(a>96 && a < 123)
  {
     number=(a+n)-97;
     char num1=(number%26)+97;
     cout<<num1;
  }
  else{
  number=(a+n)-65; 
  char al=(number% 26)+65;
  cout<<al;
  }
 
}