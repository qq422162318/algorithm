package 反射;

public class User {
    public User(){}
    private User(String username){
       this.username=username;
    }
    private String username;
    public String sayHello(String msg){
        return "hello"+msg;
    }
    public static void sum(Integer...args){
   int sum=0;
   for (int s:args){
       sum+=s;
   }
        System.out.println(sum);
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
