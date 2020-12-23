#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int l;
  int count=0;
  char str1[50],str2[50],temp[50];
  cin.getline(str1,50);
  cin.getline(str2,50);
  l=strlen(str2);
  for(int i=(l-1);i>=0;i--)
  {
        temp[count]=str2[i];
        count++;     
  }
  temp[count]='\0';
  if(strcmp(str1,temp) == 0)
  {
    cout<<"It is correct";
  }
  else
  {
      cout<<"It is wrong";
  }
}