package mingrisoft;
import java.sql.Connection;                          //����Java�������ݿ������ã�
import java.sql.SQLException;				         //����Java�������ݿ������ã�
/**
 * �ļ�����Login.java
 * �ļ�������������¼
 * ����ʱ�䣺2016��7��26��
 * ��˾��ַ��www.mingribook.com
 * ������λ������ʡ���տƼ����޹�˾
 * �����ˣ�bhj
*/
public class Login {

	DBConnection DBConn = new DBConnection();     	//�������ݿ�����
	Function Fun = new Function();                 	//���빦���������֤���롢ҳ����Ⱦ��
	
	/**
     * ��������LoginCheck
     * ��������������Ա��̨��¼ʱ���û���������֤��
     * @param user:�ύ���û�����pwd:�ύ������
     * @return true����ʾ��֤��ȷ;
	 * Created by ���տƼ� on 16/8/22.
    */
	public boolean LoginCheck(String user, String pwd) {
		try {
			Connection Conn = DBConn.getConn();  	// ȡ�����ݿ������״̬
			boolean OK = true;                     	// �½�������ok����ֵΪtrue���������ͣ�
			OK = Fun.CheckLogin(Conn, user, pwd);	// ���ù��ܺ���CheckLogin������ֵ����OK
			return OK;					        	// ��OK��ֵ����
		} catch (SQLException e) {
			return false;  							// ��������쳣������false
		}
	}
}
