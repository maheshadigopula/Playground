#include<iostream>
using namespace std;
int main()
{
  float s=0;
  int n;
  while(cin>>n)
  {
    if(n<0)
      s-=1;
    else if(n%2!=0)
      s+=1;
    else
      s-=0.5;
    }
  cout<<s;
}