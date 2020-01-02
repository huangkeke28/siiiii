public class Test {
    public static void main(String[] args) {
//        Person person = new Person();//通过new实例化对象
//        person.eat();
//        person.sleep();
//        System.out.println(person.sex);
//        person.show();
//        Person person2 = new Person();
//        person2.name = "李四";
//        person2.age = 20;
//        person2.show();
//        TestDemo t1 = new TestDemo();
//        t1.a++;
//        TestDemo.count++;
//        System.out.println(t1.a);
//        System.out.println(TestDemo.count);
//        System.out.println("=============");
//        TestDemo t2 = new TestDemo();
//        t2.a++;
//        TestDemo.count++;
//        System.out.println(t2.a);
//        System.out.println(TestDemo.count);
        //count被static所修饰，所有类共享。且不属于对象
//        TestDemo.chang();
//        System.out.println(TestDemo.count);
//        Person person = new Person();// 实例化对象
//        System.out.println(person.age);
//        System.out.println(person.name);
////        System.out.println(person.count);//会有警告
//        System.out.println(Person.count);
//        System.out.println(Person.COUNT);
//        Person.staticTest();
//        person.eat();
//        person.sleep();
        Person person = new Person();
//        System.out.println("我叫" + person.name +",今年" + person.age + "岁");
        person.setName("曹操");
        String name = person.getName();
        System.out.println(name);
        person.show();


    }
}
