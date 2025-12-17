public class constructor{
    String name;
    int age;
    String course;
    constructor(String n,int a,String c){
        this.name=n;
        this.age=a;
        this.course=c;
    }
    constructor(){
        System.out.println("default constructor");
    }
    public static void main(String[] args){
        constructor con=new constructor("reddybabu",23,"bca");
        System.out.println(con.name);
        constructor con1=new constructor();
        con1.age=45;
        con1.name="kumar";
    }

}