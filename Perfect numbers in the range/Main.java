#include<iostream>
using namespace std;
int main()
{
  int a,b,sum,i,j;
  cin>>a>>b;
  for(i=a;i<=b;i++)
  {
    sum=0;
    for(j=1;j<i;j++)
    {
      if(i%j == 0)
      {
        sum+=j;
      }
    }
    if(sum==i)
    {
      printf("%d ",i);
    }
  }
  return 0;
}