#include<iostream>
#include<cstring>
using namespace std;
int main()
{
 char str[200];
  cin.getline(str,200);
  int l;
  l=strlen(str);
  for(int i=0;i<l;i++)
  {
        if((str[i] > 64 && str[i] < 91 ) ||(str[i]>96 && str[i]< 123))
        {
             cout<<str[i];
        }
  }
}