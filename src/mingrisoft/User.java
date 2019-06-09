package mingrisoft;			

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * 文件名：User.java
 * 文件功能描述：后台管理员查看功能
 * 开发时间：2016年8月22日
 * 公司网址：www.mingribook.com
 * 开发单位：吉林省明日科技有限公司
 * 开发人：bhj
*/
public class User
{

    DBConnection DBConn = new DBConnection();
    Function Fun = new Function(); 
   
    /**
     * 方法名：ListUser
     * 功能描述：后台管理员信息。（查）
     * @param toPage:分页跳转页面地址，pageNum:每页显示记录数量
     * @return 数据库查询，后台管理员信息查询
	 * Created by 明日科技 on 16/8/22.
    */
	public String ListUser(String toPage, String pageNum) {
		try {
			Connection Conn = DBConn.getConn();
			Statement stmt = Conn.createStatement();
			ResultSet rs = null;
			StringBuffer resultData = new StringBuffer();
			String sSql = "select * from Admin order by AdminID desc";
			rs = stmt.executeQuery(sSql);
			resultData = Fun.ListUser(resultData, rs, toPage, pageNum);
			rs.close();
			stmt.close();
			Conn.close();
			return resultData.toString();
		} catch (Exception e) {
			return "No";
		}
	}
    
}