#include <iostream>
using namespace std;

int main() 
{
  int num;
  int sum=0;
  cin>>num;
  for(int i=1;i<=(num/2);i++){
    if(num%i==0){
      sum=sum+i;
    }
  }
  if(sum==num){
    cout<<"Yes";
  }
  else{
  cout<<"No";
  }
    return 0;
}