<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>会員情報更新確認</title>
</head>
<body>
<%@ include file="../header.jsp" %>
    <h2>会員情報更新確認</h2>
    <p>以下の情報で更新します。よろしいですか？</p>
    <form name="confirmUpdateForm" action="complete.jsp" method="post">
        <p>住所: <%= request.getParameter("address") %></p>
        <p>電話番号: <%= request.getParameter("phone") %></p>
        <p>メールアドレス: <%= request.getParameter("email") %></p>
        <!-- 確認用の隠しフィールド -->
        <input type="hidden" name="address" value="<%= request.getParameter("address") %>">
        <input type="hidden" name="phone" value="<%= request.getParameter("phone") %>">
        <input type="hidden" name="email" value="<%= request.getParameter("email") %>">
        <input type="hidden" name="password" value="<%= request.getParameter("password") %>">

        <!-- 確認画面では、通常、パスワードを表示しないため、パスワードフィールドは含めません -->

        <input type="submit" value="確定">
    </form>
    <button onclick="history.back()">戻る</button>
    <%@ include file="../footer.jsp" %>

</body>
</html>
