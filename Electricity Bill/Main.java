#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit,prise;
  cin>>unit;
  if(unit<= 200 ){
     prise=unit*0.5;
    cout<<"Rs."<<prise;
  }
  else if(unit>200 && unit <=400){
    prise=100+(unit*0.65);
   cout<<"Rs."<<prise;
  }
  else if(unit>400 && unit<=600){
  prise=200+(unit*0.80);
  cout<<"Rs."<<prise;
  }
  else if(unit>600){
    prise=(1.25*unit)+425;
    cout<<"Rs."<<prise;
  }
  else{
  
  }
  
}








