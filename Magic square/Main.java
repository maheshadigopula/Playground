#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int m[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>m[i][j];
    }
  }
  int sum=0,sum1=0;
  for(int i=0;i<n;i++)
    sum+=m[i][i];
  for(int i=0;i<n;i++)
    sum1+=m[i][n-1-i];
  if(sum!=sum1)
  {
    cout<<"No";
    return 0;
  }
  for(int i=0;i<n;i++)
  {
    int rowsum=0;
    for(int j=0;j<n;j++)
    {
      rowsum+=m[i][j];
    }
      if(rowsum!=sum)
      {
        cout<<"No";
        return 0;
      }
  }
  for(int i=0;i<n;i++)
  {
    int colsum=0;
    for(int j=0;j<n;j++)
      colsum+=m[j][i];
    if(sum!=colsum)
    {
      cout<<"No";
      return 0;
    }
  }
  cout<<"Yes";
  return true;
}