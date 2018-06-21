 #include<stdio.h>
  int main()
  {
  long int num,sum=0;
  int temp;
  scanf("%ld",&num);
  while(num>=1)
  {
  temp=num%10;
  sum+=(temp*temp);
  num=num/10;
  }
  printf("%ld",sum);
  return 0;
 }
