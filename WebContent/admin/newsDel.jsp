<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="mingrisoft.*"%>
<%
	News news = new News();
	String NewsID = request.getParameter("NewsID");    				//获取新闻记录唯一主键
	if (news.DelNews(NewsID))										//将数据提交给后台，获取返回值
		out.print("<script>alert('删除新闻成功!');location.href='news.jsp';</script>");
	else {
		out.print("<script>alert('删除新闻失败!');location.href='news.jsp';</script>");
	}
%>
