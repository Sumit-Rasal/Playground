#include <iostream>
using namespace std;

int main() 
{
  int yer;
  cin>>yer;
  if(yer%400==0){
   cout<<"LEAP YEAR";
  }
  else{
   cout<<"NOT LEAP YEAR";
  }
    return 0;
}