package org.Interface;
public final class Equlaitytest
{
    public static void main( String args[] )
    {
        String s1 = new String( "Test" );
        String s2 = new String( "Test" );

        System.out.println( "\n1 - PRIMITIVES ");
        System.out.println( s1 == s2 ); // false
        System.out.println( s1.equals( s2 )); // true

        A a1 = new A("Test");
        A a2 = new A("Test");

        System.out.println( "\n2 - OBJECT TYPES / STATIC VARIABLE" );
        System.out.println( a1 == a2 ); // false
        System.out.println( a1.equals(a2) ); // false
        System.out.println( a1.s == a2.s ); // true
        System.out.println( a1.s.equals( a2.s ) ); // true

        B b1 = new B();
        B b2 = new B();

        System.out.println( "\n3 - OBJECT TYPES / NON-STATIC VARIABLE" );
        System.out.println( b1 == b2 ); // false
        System.out.println( b1.getS() == b2.getS() ); // false
        System.out.println( b1.getS().equals( b2.getS() ) ); // true
    }
}

final class A
{
    // static
    public static String s;
    A(String se)
    {
        this.s = new String( se );
    }
}

final class B
{
    private String s;
    B()
    {
        this.s = new String( "aTest" );
    }

    public String getS()
    {
        return s;
    }

}