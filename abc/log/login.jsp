<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<form action="" method="post">
<p>ログインID<input type="number" name="user_id"></p>
<p>パスワード<input type="password" name="password"></p>
<p><input type="submit" value="ログイン"></p>
</form>
<hr>
<p>利用会員登録がまだの方は<a href="<%= request.getContextPath() %>/abc/Registration/Registratiom.jsp">こちら</a>から</p><br>
<p>施設登録がまだの施設管理者の方は<a href="<%= request.getContextPath() %>/abc/others/sisetutouroku.jsp">こちら</a>から</p>
<%@ include file="../footer.jsp" %>

