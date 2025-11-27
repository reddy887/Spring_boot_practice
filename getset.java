class gt {
    private String name;
    private int age;
    private int phoneno;
    String course;
    String getname(){
        return name;
    }
    gt(String name,int age,int phoneno){
        this.age=age;
        this.name=name;
        this.phoneno=phoneno;
        this.course="bca-ml";
    }
} 
public class getset{
    public static void main(String[] args){
        gt g=new gt("reddybabu",34,9014583);
        System.out.println(g.getname());
    }

}

