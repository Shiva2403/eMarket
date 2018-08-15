package p;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class DBConn {
    Connection con;
    public DBConn() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva_market","root","root");
//            InitialContext ctx=new InitialContext();
//            DataSource ds=(DataSource) ctx.lookup("market");
//            con=ds.getConnection();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public ResultSet login(User u) {
        ResultSet rs=null;
        try {
            String str1="select * from reg where email=? and pass=?";
            PreparedStatement s1=con.prepareStatement(str1);
            s1.setString(1, u.getEmail());
            s1.setString(2, u.getPass());
            rs=s1.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int signup(User u) {
        int a=0,i=0,b=0;
        ResultSet rs1=null;
        try {
            String str1="insert into reg values(0,?,?,?)";
            PreparedStatement st1=con.prepareStatement(str1);
            st1.setString(1, u.getName());
            st1.setString(2, u.getEmail());
            st1.setString(3, u.getPass());
            a=st1.executeUpdate();
            String str2="select id from reg where email=?";
            PreparedStatement st2=con.prepareStatement(str2);
            st2.setString(1, u.getEmail());
            rs1=st2.executeQuery();
            while(rs1.next()){
                i=rs1.getInt(1);
            }
            String str3="insert into cartmap values(0,?)";
            PreparedStatement st3=con.prepareStatement(str3);
            st3.setInt(1, i);
            b=st3.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return b;
    }

    public int addpro(Product pro, String fn) throws IOException {
        InputStream in=null;
        int a=0;
//        String fp = sp + File.separator + fn;
        try{
            String str="insert into product values(?,?,?,?,?,?,?,?,0)";
            PreparedStatement s=con.prepareStatement(str);
            s.setString(1, pro.getP_name());
            s.setString(2, pro.getC_name());
            s.setString(3, pro.getCategory());
            s.setString(4, pro.getSubcategory());
            s.setFloat(5, pro.getPrice());
            s.setString(6, pro.getExtra());
            s.setInt(7, pro.getNo());
            s.setString(8,fn);
            a=s.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        return a;
    }

    public int rempro(int i) {
        int a=0,f=0;
        try {
            String str1="delete from product where p_id=?";
            PreparedStatement s1=con.prepareStatement(str1);
            s1.setInt(1,i);
            a=s1.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return a;
    }

    public ResultSet seapro(int i) {
        ResultSet rs=null;
        try {
            String str1="select * from product where p_id=?";
            PreparedStatement s1=con.prepareStatement(str1);
            s1.setInt(1,i);
            rs=s1.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int updpro(Product pro) {
        int a=0;
        try {
            String str="update product set p_name=?,p_company=?,p_category=?,p_subcat=?,p_price=?,p_extra=?,p_count=? where p_id=?";
            PreparedStatement s=con.prepareStatement(str);
            s.setString(1, pro.getP_name());
            s.setString(2, pro.getC_name());
            s.setString(3, pro.getCategory());
            s.setString(4, pro.getSubcategory());
            s.setInt(5, pro.getPrice());
            s.setString(6, pro.getExtra());
            s.setInt(7, pro.getNo());
            s.setInt(8, pro.getId());
            a=s.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return a;
    }
    
    public ResultSet viewexp(){
        ResultSet rs=null;
        try {
            String str="select * from product where p_count<10";
            PreparedStatement s=con.prepareStatement(str);
            rs=s.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet viewm(String cat){
        ResultSet rs=null;
        try {
            String str="select * from product where p_category=?";
            PreparedStatement s=con.prepareStatement(str);
            s.setString(1, cat);
            rs=s.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet viewm(int id){
        ResultSet rs=null;
        try {
            String str="select * from product where p_id=?";
            PreparedStatement s=con.prepareStatement(str);
            s.setInt(1, id);
            rs=s.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public ResultSet getC(int a) {
        ResultSet rs=null;
        try {
            String str="select * from cartmap where c_rid=?";
            PreparedStatement st=con.prepareStatement(str);
            st.setInt(1, a);
            rs=st.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public int carno(int cid){
        ResultSet rs=null;
        int a=0;
        try {
            String str="select * from cart where cid=?";
            PreparedStatement st=con.prepareStatement(str);
            st.setInt(1, cid);
            rs=st.executeQuery();
            while(rs.next()){
                a++;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return a;
    }

    public int addcart(int c, int p, int n) {
        int a=0;
        try {
            String str="insert into cart values(?,?,?)";
            PreparedStatement st=con.prepareStatement(str);
            st.setInt(1, c);
            st.setInt(2, p);
            st.setInt(3, n);
            a=st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return a;
    }
    
    public ResultSet viewcart(int c){
        ResultSet rs=null;
        try {
            String str="select p.p_id,p.p_name,p.p_company,p.p_category,p.p_subcat,p.p_extra,p.p_price,c.c_no from cart c inner join product p on c.c_pid=p.p_id and c.cid=?";
            PreparedStatement st=con.prepareStatement(str);
            st.setInt(1,c);
            rs=st.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int remcart(int c, int p) {
        int a=0;
        try {
            String str="delete from cart where cid=? and c_pid=?";
            PreparedStatement st=con.prepareStatement(str);
            st.setInt(1,c);
            st.setInt(2, p);
            a=st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return a;
    }
    
    public ResultSet search(String n){
        ResultSet rs=null;
        try {
            String str="select * from product where p_name=? or p_company=? or p_category=? or p_subcat=?";
            PreparedStatement st=con.prepareStatement(str);
            st.setString(1, n);
            st.setString(2, n);
            st.setString(3, n);
            st.setString(4, n);
            rs=st.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public int update(HashMap h,int c) throws SQLException{
        Set set = h.entrySet();
        Iterator it = set.iterator();
        ResultSet rs=null;
        int b=0,a=0,pc=0;
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            String str1="select p_count from product where p_id=?";
            PreparedStatement st1=con.prepareStatement(str1);
            int k=(int) e.getKey();
            int v=(int) e.getValue();
            st1.setInt(1, k);
            rs=st1.executeQuery();
            while(rs.next()){
                pc=rs.getInt(1);
            }
            pc-=v;
            String str2="update product set p_count=? where p_id=?";
            PreparedStatement st2=con.prepareStatement(str2);
            st2.setInt(1, pc);
            st2.setInt(2, k);
            a=st2.executeUpdate();
            String str4="insert into orders values(?,?,?)";
            PreparedStatement st4=con.prepareStatement(str4);
            st4.setInt(1, c);
            st4.setInt(2, k);
            st4.setInt(3, v);
            c=st4.executeUpdate();
            String str3="delete from cart where cid=? and c_pid=?";
            PreparedStatement st3=con.prepareStatement(str3);
            st3.setInt(1, c);
            st3.setInt(2, k);
            b=st3.executeUpdate();
        }
        return b;
    }
    
    public ResultSet vieworders(int c){
        ResultSet rs=null;
        try {
            String str="select p.p_id,p.p_name,p.p_company,p.p_category,p.p_subcat,p.p_extra,p.p_price,o.o_no from orders o inner join product p on o.o_pid=p.p_id and o.o_cid=?";
            PreparedStatement st=con.prepareStatement(str);
            st.setInt(1, c);
            rs=st.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }
}
