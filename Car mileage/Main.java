#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrol,distance;
  cin>>mileage;
  cin>>petrol;
  cin>>distance;
 float distanceTravel=mileage*petrol;
 if(distanceTravel>= distance){
   cout<<"Can reach";}
  else{ 
  cout<<"Cannot reach";
  }
}