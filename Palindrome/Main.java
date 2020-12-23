#include <iostream>
#include <cstring>
using namespace std;

int main() 
{
  char num[100];
  char temp[100];
  int count=0;
  cin.getline(num,100);
  int l=strlen(num);
  for(int i=l-1;i>=0;i--)
  {
     temp[count]=num[i];
     count++;
  }
  
  if(strcmp(num,temp) == 0)
  {
     cout<<"Palindrome";
  }
  else
  {
      cout<<"Not a Palindrome";
  }
}