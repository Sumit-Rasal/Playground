#include <iostream>
#include <stdio.h>
using namespace std;

int main() 
{
     char a[100];
     gets(a);
     int count=0;
     for(int i=0;a[i]!='\0';i++)
     {
        if(a[i]==' ')
        {
           count++;
        }
     }
  cout<<++count;
}