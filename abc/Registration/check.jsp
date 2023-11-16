<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.*" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>入力内容確認</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<h2>入力内容の確認</h2>
<%
    // 入力されたデータをリクエストから取得
    String name = request.getParameter("name");
    String dob = request.getParameter("dob");
    String phone = request.getParameter("phone");
    String address = request.getParameter("address");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String secretQuestion = request.getParameter("secret_question");
    String secretAnswer = request.getParameter("secret_answer");
%>
<p>氏名: <%= name %></p>
<p>生年月日: <%= dob %></p>
<p>電話番号: <%= phone %></p>
<p>住所: <%= address %></p>
<p>メールアドレス: <%= email %></p>
<p>秘密の質問: <%= secretQuestion %></p>

<!-- ここで隠しフィールドを使ってデータを送信する -->
<form action="Rconfirmation.jsp" method="post">
    <input type="hidden" name="name" value="<%= name %>">
    <input type="hidden" name="dob" value="<%= dob %>">
    <input type="hidden" name="phone" value="<%= phone %>">
    <input type="hidden" name="address" value="<%= address %>">
    <input type="hidden" name="email" value="<%= email %>">
    <input type="hidden" name="password" value="<%= password %>">
    <input type="hidden" name="secret_question" value="<%= secretQuestion %>">

    <input type="submit" value="登録">
</form>
<%@ include file="../footer.jsp" %>

</body>
</html>
