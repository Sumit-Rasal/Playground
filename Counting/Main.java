#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[200];
  cin.getline(str,200);
  int l;
  l=strlen(str);
  int vom=0,con=0,white=0,digit=0,symbol=0;
  for(int i=0;i<l;i++)
  {
        if(str[i] =='a' || str[i] =='e' || str[i] =='i' || str[i] =='o'|| str[i] =='u' || str[i] =='A' || str[i] =='E' || str[i] =='I' || str[i] =='O' || str[i] =='U')
        {
             vom++;
        }
        else if(str[i] == ' ')
        {
            white++;
        }
      else if(str[i]> 47 && str[i] < 58 )
      {
            digit++;
      }
     else if( (str[i]> 64 && str[i] < 91) || (str[i] > 96 && str[i]< 123))
     {
        con++;
     }
    else
    {
          if(str[i] > 32 && str[i] < 48)
          {
             symbol++;
          }
    }
  }
  cout<<"Vowels:"<<vom<<"\n";
  cout<<"Consonants:"<<con<<"\n";
  cout<<"White Spaces:"<<white<<"\n";
  cout<<"Digits:"<<digit<<"\n";
  cout<<"Symbols:"<<symbol;
}