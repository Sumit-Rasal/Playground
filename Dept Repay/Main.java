#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int amount,year,intrest;
  float rate;
  cin>>amount;
  cin>>rate;
  cin>>year;
  intrest=(amount*(1+(rate/100)*year))-amount;
  cout<<intrest<<"\n";
  int firstvalue;
  firstvalue=intrest+amount;
  cout<<firstvalue<<"\n";
  float discount,finalamount;
  discount=(intrest*0.02);
  cout<<discount<<"\n";
  finalamount=float(firstvalue)-discount;
  cout<<finalamount;
}