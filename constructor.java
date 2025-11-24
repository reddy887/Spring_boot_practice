public class constructor{
    String name;
    int age;
    String course;
    constructor(String n,int a,String c){
        this.name=n;
        this.age=a;
        this.course=c;
    }
    public static void main(String[] args){
        constructor con=new constructor("reddybabu",23,"bca");
        System.out.println(con.name);
    }

}