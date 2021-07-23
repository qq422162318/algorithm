import java.sql.*;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class MysqlJdbc {
    public static void main(String args[]) throws Exception {
//     DriverManager.registerDriver("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://2bzqlelz.shenzhuo.vip:30158/school";
        String use = "root";
        String pwd = "123456";
        Connection con = DriverManager.getConnection(url, use, pwd);
        insert(con);
//        Statement stmt=con.createStatement();
//        stmt.executeUpdate("insert into boys set id=7,boyName=123,userCP=1000");
//        String sql="select * from EASYBUY_NEWS";
//        ResultSet rs=stmt.executeQuery(sql);
//        System.out.println(rs.next());
//        while (rs.next()){
//            String id=rs.getString("id");
//            String boyName=rs.getString("boyName");
//            String userCP=rs.getString("userCP");
//            System.out.println(id+boyName+userCP);
//        }
//        rs.close();
    }

    public static void insert(Connection conn) {
        // 开始时间
        Long begin = new java.util.Date().getTime();
        Random random = new Random();
        // sql前缀
        String prefix = "INSERT INTO goodss (goodsname,goodstype,goodssn,goodsprice,goodsnumber) VALUES ";
        try {
            // 保存sql后缀
            StringBuffer suffix = new StringBuffer();
            // 设置事务为非自动提交
            conn.setAutoCommit(false);
            // 比起st，pst会更好些
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("");//准备执行语句
            // 外层循环，总提交事务次数
            for (int i = 1; i <= 100; i++) {
                suffix = new StringBuffer();
                // 第j次提交步长
                for (int j = 1; j <= 100000; j++) {
                    // 构建SQL后缀
                    UUID uuid = UUID.randomUUID();
                    String s = String.valueOf(uuid);
                    s=s.substring(0,8);
                    suffix.append("('" + s+ "','" + "人" + "','"+random.nextInt(192301)+"','"+random.nextInt(500)+"','"+random.nextInt(100)+"'),");
                }
                // 构建完整SQL
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // 添加执行SQL
                pst.addBatch(sql);
                // 执行操作
                pst.executeBatch();
                // 提交事务
                conn.commit();
                // 清空上一次添加的数据
                suffix = new StringBuffer();
            }
            // 头等连接
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 结束时间
        Long end = new Date().getTime();
        // 耗时
        System.out.println("1000万条数据插入花费时间 : " + (end - begin) / 1000 + " s");
        System.out.println("插入完成");
    }

}
