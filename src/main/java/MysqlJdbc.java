import java.sql.*;
public class MysqlJdbc {
    public static void main(String args[]) throws Exception{
//     DriverManager.registerDriver("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");//静态代码快完成数据库驱动注册
        String url="jdbc:mysql://47.101.155.13:3306/school";
        String use="root";
        String pwd="123456";
        Connection con=DriverManager.getConnection(url,use,pwd);
        Statement stmt=con.createStatement();
//        stmt.executeUpdate("insert into boys set id=7,boyName=123,userCP=1000");
        String sql="select * from EASYBUY_NEWS";
        ResultSet rs=stmt.executeQuery(sql);
        System.out.println(rs);
//        while (rs.next()){
//            String id=rs.getString("id");
//            String boyName=rs.getString("boyName");
//            String userCP=rs.getString("userCP");
//            System.out.println(id+boyName+userCP);
//        }
        rs.close();

    }
    
}
