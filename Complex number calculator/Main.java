#include<iostream>
using namespace std;
int main()
{
  int ch;
  int a,s,d,f;
  cin>>ch>>a>>s>>d>>f;
  switch(ch)
  {
    case 1:cout<<a+d<<s+d<<"i";
      break;
    case 2:if((s-f)>=0)
      cout<<a-d<<"+"<<s-f<<"i";
      else
      cout<<a-d<<s-f<<"i";
      break;
    case 3:cout<<a*d-s*f<<a*f+s*d<<"i";
      break;
    default:cout<<"Invalid choice";
  }
}