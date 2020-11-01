import java.sql.*;
public class MysqlJdbc {
    public static void main(String args[]) throws Exception{
//     DriverManager.registerDriver("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");//静态代码快完成数据库驱动注册
        String url="jdbc:mysql://localhost:3306/sms1";
        String use="root";
        String pwd="123456";
        Connection con=DriverManager.getConnection(url,use,pwd);
        Statement stmt=con.createStatement();
        stmt.executeUpdate("insert into boys set id=7,boyName=123,userCP=1000");
        String sql="select * from boys";
        ResultSet rs=stmt.executeQuery(sql);
        while (rs.next()){
            String id=rs.getString("id");
            String boyName=rs.getString("boyName");
            String userCP=rs.getString("userCP");
            System.out.println(id+boyName+userCP);
        }
        rs.close();

    }
    
}
