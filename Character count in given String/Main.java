#include<iostream>
#include <stdio.h>
#include <string.h>
using namespace std;
int main()
{
     string a;
     int count=1;
     cin>>a;
  if(a.length()>20)
  {
     cout<<"Invalid Input";
  }
  else{
     for(int i=0;i<a.length();i++)
     {
        if(a[i]==a[i+1])
        {
            count++;
        }
       else
       {
           cout<<a[i]<<count;
           count=1;
       }
     }
  }
}