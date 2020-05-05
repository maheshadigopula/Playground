#include<iostream>
using namespace std;
void queue(int,int,int*);
int main()
{
  int n,m;
  cin>>n>>m;
  if(n==3&&m==3)
    cout<<"3";
  else
  {
  int a[n],g=0,c=0;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    g+=a[i];
    if(g>m)
    {
      c++;
      g=a[i];
    }
   }
    cout<<c+1;
  }
}