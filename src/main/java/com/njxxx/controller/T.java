package com.njxxx.controller;//package com.njxxx.controller;
//
//import com.njxxx.DaoConfig;
//import oracle.jdbc.pool.OracleDataSource;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// * Created by 陈亚兰 on 2018/6/4.
// */
//public class T {
//
//    private static String url="jdbc:oracle:thin:@192.168.2.85:1521:agile9";
//
//    private static String username="plmforip";
//
//    private static String password="plm1234";
//    public static void main(String[]args) throws SQLException, ClassNotFoundException {
//        Class.forName("oracle.jdbc.driver.OracleDriver");
//
//        DataSource o=T.getDataSource();
//        Connection connection=o.getConnection();
//        PreparedStatement preparedStatement=connection.prepareStatement(" select * from agile.CTTQ_USERGROUPINFO_FOR_IP ");
//        ResultSet rs=preparedStatement.executeQuery();
//        while(rs.next()){
//            System.out.println(rs.getObject("NAME"));
//        }
//    }
//    public static DataSource getDataSource(){
//        OracleDataSource datasource;
//        try {
//            datasource = new OracleDataSource();
//            datasource.setURL(url);
//            datasource.setUser(username);
//            datasource.setPassword(password);
//
//            return datasource;
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoConfig.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//}
