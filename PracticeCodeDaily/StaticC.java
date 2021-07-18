class StaticC
{
static int x;
static
{
System.out.println("static block");
x=new java.util.scanner(System.in).nextInt();
}
}
class StaticCTest1
{
public static void main(String s[])
{
System.out.println("main from StaicCTest1");
System.out.println(x);
System.out.println("after static block from StaticCTest1");
}
}
class StaticCTest2
{
public static void main(String... s)
{
System.out.println("main from StaticCTest2");
System.out.println(staticC.x);
System.out.println("after static block from StaticCTest2");
}
}