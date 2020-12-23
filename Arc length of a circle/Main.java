#include <iostream>
#include <stdio.h>
using namespace std;

int main() 
{
  float a,o;
  cin>>a;
  cin>>o;
  float arc;
  arc= 2*(3.14)*a*(o/float(360));
  printf("%0.2f",arc);
}