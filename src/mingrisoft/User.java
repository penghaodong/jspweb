package mingrisoft;			

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * �ļ�����User.java
 * �ļ�������������̨����Ա�鿴����
 * ����ʱ�䣺2016��8��22��
 * ��˾��ַ��www.mingribook.com
 * ������λ������ʡ���տƼ����޹�˾
 * �����ˣ�bhj
*/
public class User
{

    DBConnection DBConn = new DBConnection();
    Function Fun = new Function(); 
   
    /**
     * ��������ListUser
     * ������������̨����Ա��Ϣ�����飩
     * @param toPage:��ҳ��תҳ���ַ��pageNum:ÿҳ��ʾ��¼����
     * @return ���ݿ��ѯ����̨����Ա��Ϣ��ѯ
	 * Created by ���տƼ� on 16/8/22.
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