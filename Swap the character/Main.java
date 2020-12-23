#include <iostream>
using namespace std;
#include<string>
#include<cstring>
int main() 
{
   // Try out your code here
   string a,b,c;
   cin>>a;
   cin>>b;
   cin>>c;
  for(int i=0;i<=a.length();i++){
     if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U'){
       a[i]='$';
     }
  }
  
  for(int i=0;i<=b.length();i++){
     if(b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'A' || b[i] == 'E' || b[i] == 'I' || b[i] == 'O' || b[i] == 'U')
   {
        
   }
    else{
        b[i]='#';
    }
    
  }
  for(int i=0;i<=c.length();i++){
     c[i]=toupper(c[i]);
  }

  cout<<a<<b<<c;
    return 0;
}