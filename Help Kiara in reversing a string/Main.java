#include <iostream>
#include <cstring> 
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end;    
cin.getline(str,100);
for(int i=0; str[i]!= '\0';i++)  
{
    count++;
}
for(int i=count-1;i>=0;i--)
{
    cout<<str[i]; 
}
}