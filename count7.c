#include<stdio.h>
int main()
{
int i,n,count=0;
printf("enter the integer");
scanf("%d",&n);
while(n!=0)
{
n=n/10;
++count;
printf("number of digits:%d",count);

}
}
