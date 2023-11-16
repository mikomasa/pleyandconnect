<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>パスワード入力</title>
</head>
<body>

<%@ include file="../header.jsp" %>
<%
String plan = request.getParameter("plan");
String paymentMethod = request.getParameter("payment_method");
// 必要に応じて受け取ったパラメータの検証や処理をここで行う
%>
<form action="confirmation.jsp" method="post">
    <input type="hidden" name="plan" value="<%= plan %>">
    <input type="hidden" name="payment_method" value="<%= paymentMethod %>">

    <div>
        <label for="password">パスワードを入力してください:</label>
        <input type="password" id="password" name="password" required>
    </div>

    <div>
        <input type="submit" value="確定">
    </div>
</form>
<%@ include file="../footer.jsp" %>

</body>
</html>
