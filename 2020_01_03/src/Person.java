public class Person {
//    public String name = "张三";
//    public int age = 18;
//    private String name = "张三";
//    private int age = 18;
//
//    public void show(){
//        System.out.println("我叫" + name +",今年" + age + "岁");
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return this.name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//    private String name;
//    private int age;
//    private String sex;
//    public Person(){
//        this.name = "nihao";
//        this.age = 1;
//        this.sex = "男";
//    }
//    public Person(String name, int age, String sex){
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//    public void show(){
//        System.out.println("name: " + name + "age: " + age + "sex: " + sex);
//    }
//    private String name;
//    private int age;
//    private String sex;

//    public Person(String name, int age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//    public Person(){
//        System.out.println("I am Person init()!");
//    }
    //代码块 普通代码块 构造块 静态块 同步代码块
//    {
//        this.name = "keke";
//        this.age = 20;
//        this.sex = "man";
//        System.out.println("I am instance init()!");
//    }
//    public void show(){
//        System.out.println("name: " + name + "age: " + age + "sex: " + sex);
//    }
    //静态代码块 使用static定义的代码块 一般用于初始化静态成员属性
//    private String name;
//    private int age;
//    private String sex;
//    private static int count = 0;
//    public Person(){
//        System.out.println("I an person init()!");
//    }
//    {
//        this.name = "xiaoke";
//        this.age = 20;
//        this.sex = "man";
//        System.out.println("I am instance init()!");
//    }
//    static{
//        count = 10;//只能访问静态数据成员
//        System.out.println("I am static init()!");
//    }
//    public void show(){
//        System.out.println("name: " + name + "age: " + age + "sex: " + sex);
//    }
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("name: " + name + " " + "age: " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

