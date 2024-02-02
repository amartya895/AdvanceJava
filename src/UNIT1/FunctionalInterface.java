package UNIT1;

@java.lang.FunctionalInterface

public interface FunctionalInterface {

    void say(String msg);
    interface MyFunInterface{
        public  String sayHello();
    }

    class Demo implements FunctionalInterface{
        public  void  say(String msg)
        {
            System.out.println(msg);
        }
    }

    public  static  void main(String[] args)
    {
        Demo d = new Demo();
        d.say("Good Morning Sir");
        MyFunInterface msg = ()->{return "hello Student";};

        System.out.println(msg.sayHello());
    }
}
