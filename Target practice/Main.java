#include<iostream>
using namespace std;
int main()
{
  int num,sum=0,i,n;
  cin>>num;
  for(i=0;sum<num;i++)
  {
    scanf("%d",&n);
    sum=sum+n;
  }
  cout<<"The number of turns is "<<i;
  return 0;
}