#include <iostream>
#include <stdio.h>
#include <string>
using namespace std;

int main() 
{
   char a[100];
   int count=0;
   scanf("%[^/n]s",a);
  for(int i=0;a[i] !='\0';i++)
  {
       count++;
  }
   for(int i=(count-1);i>=0;i--)
   {
       printf("%c",a[i]);
   }
}