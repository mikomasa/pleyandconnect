<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>有料会員登録</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<h2>有料会員登録フォーム</h2>

<form action="password_input.jsp" method="post">
    <div>
        <label>プラン選択:</label><br>
        <input type="radio" id="monthly" name="plan" value="monthly" checked>
        <label for="monthly">月額プラン</label><br>
        <input type="radio" id="annual" name="plan" value="annual">
        <label for="annual">年間プラン</label>
    </div>

    <div>
        <label>支払方法:</label><br>
        <input type="radio" id="paypal" name="payment_method" value="paypal"checked>
        <label for="paypal">PayPal</label>
    </div>

    <div>
        <input type="submit" value="次へ">
    </div>
</form>
<%@ include file="../footer.jsp" %>

</body>
</html>
