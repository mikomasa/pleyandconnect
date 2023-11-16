<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>サブスク退会画面</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<h2>サブスク退会画面</h2>

<form action="Cconfirmation.jsp" method="post" onsubmit="return confirm('本当に退会しますか？');">
    <div>
        <input type="checkbox" id="confirmUnsubscribe" name="confirm_unsubscribe" onchange="document.getElementById('unsubscribeButton').disabled = !this.checked;">
        <label for="confirmUnsubscribe">退会に関する確認をしました。</label>
    </div>
    <div>
        <input type="submit" id="unsubscribeButton" value="退会する" disabled>
    </div>
</form>

<%@ include file="../footer.jsp" %>

</body>
</html>
