class Main
{
    public static void main(String[] args) {
        Class ob = new Class();
        ob.show();
        //Anonymous Class CREATION
        Class ano = new Class()
        {
            @Override
            public void show()
            {
                System.out.println("This is Anonyms Method CALL");
            }
        };
        ano.show();
        //Anonymous Interface CREATION
        Interface inte = new Interface() {
            @Override
            public void show(){
                System.out.println("This is from Anonymous Interface Method CALL");
            }
            @Override
            public int add(int i,int j)
            {
                System.out.println("This Adding is Done At Anonymous Interface");
                return i+j;
            }
        };
        inte.show();
        System.out.println(inte.add(99,10));
        System.out.println(inte.n);
        //Anonymous Object CREATION
        new Object().OneTimeMethod();
    }
}