#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int am,fl,snp;
  int amd,fld,snpd;
  int ams,fls,snps;
  cin>>am>>amd>>ams;
  cin>>fl>>fld>>fls;
  cin>>snp>>snpd>>snps;
 int totalam,totalfl,totalsnp; 
  totalam=(am- ((float)amd/100)*am ) + ams;
  totalfl= fl - (((float)fld/100)* fl) + fls;
  totalsnp=snp-( ((float)snpd/100)*snp)+ snps;
  cout<<"In Flipkart Rs."<<totalam<<"\n";
  cout<<"In Snapdeal Rs."<<totalfl<<"\n";
  cout<<"In Amazon Rs."<<totalsnp<<"\n";
  if(totalam<=totalfl && totalam<=totalsnp){
    cout<<"He will prefer Flipkart";
  }
  else if (totalfl<totalam && totalfl <totalsnp){
    cout<<"He will prefer Snapdeal";
  }
  else{
    cout<<"He will prefer Amazon";
  }
}



