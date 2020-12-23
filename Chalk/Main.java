#include<iostream>
#include<math.h>
using namespace std;
int main()
{

float n,root,remain;
int day;
cin>>n;
root=(1/sqrt(n));
remain=root*n;
day=(remain+n)+1;
cout<<day;
return 0;
}


