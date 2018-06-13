
class Leapyear{
public static void main(String[] args){
int year=1900;
if((year%400==0)||(year%4==0)&&(year%100!=0))
{
System.out.print("given year is a leap year");
}
else
{
System.out.print("given year ia  not a leap year");
}
}
}