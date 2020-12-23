#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  cin>>n;
 while(n != 1 ){
  if(n%2 == 0){
    cout<<n<<"\n";
    n=n/2;
    c++;
  }
  else{
    cout<<n<<"\n";
    n=(3*n)+1;
    c++;
  }
 }
 cout<<1<<"\n";
 cout<<c;
}