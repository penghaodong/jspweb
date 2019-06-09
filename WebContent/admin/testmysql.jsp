<%@ page import=“com.lucene.abms.util.ConnectionManager” %>
<%@ page import=“java.sql.Connection” %>
<body>

<%
ConnectionManager connectionManager = new ConnectionManager();
Connection connection =connectionManager.getConnection();

if(connection!=null)
{
out.println("数据库链接成功");	

}
else{
	
	out.println("数据库链接失败");
}

%>
</body>