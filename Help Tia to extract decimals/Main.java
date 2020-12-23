#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
    string fnum;
   char temp[100];
   int count=0;
    getline(cin,fnum);
    int p=fnum.length();
	for(int i=0; i< p ;i++)
    {
         if(fnum[i]=='.')
         {
             for(int j=i+1; j<p; j++ )
             {
                   temp[count]=fnum[j];
                   count++;
             }
         }
    }
  cout<<"Floating part is : "<<temp;
}
  