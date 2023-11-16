<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>新規登録</title>
    <script type="text/javascript">
        // ここにJavaScriptバリデーションコードを追加できます。
    </script>
</head>
<body>
<%@ include file="../header.jsp" %>
    <h2>新規登録フォーム</h2>
    <form name="registrationForm" action="check.jsp" method="post">
        <div>
            <label for="name">氏名:</label>
            <input type="text" id="name" name="name" required><br>
        </div>
        <div>
            <label for="dob">生年月日:</label>
            <input type="date" id="dob" name="dob" required><br>
        </div>
        <div>
            <label for="phone">電話番号:</label>
            <input type="tel" id="phone" name="phone" required><br>
        </div>
        <div>
            <label for="address">住所:</label>
            <input type="text" id="address" name="address" required><br>
        </div>
        <div>
            <label for="email">メールアドレス:</label>
            <input type="email" id="email" name="email" required><br>
        </div>
        <div>
            <label for="confirm_email">メールアドレス(確認用):</label>
            <input type="email" id="confirm_email" name="confirm_email" required oninput="checkEmail(this)"><br>
        </div>
        <div>
            <label for="password">パスワード:</label>
            <input type="password" id="password" name="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="パスワードは8文字以上で、少なくとも1つの数字と1つの大文字を含む必要があります。"><br>
        </div>
        <div>
            <label for="confirm_password">パスワード(確認用):</label>
            <input type="password" id="confirm_password" name="confirm_password" required oninput="checkPassword(this)"><br>
        </div>
        <div>
            <label for="secret_question">秘密の質問:</label>
            <input type="text" id="secret_question" name="secret_question" required><br>
        </div>
        <div>
            <label for="secret_answer">秘密の質問の答え:</label>
            <input type="text" id="secret_answer" name="secret_answer" value="${member.secretAnswer}" required><br>
        </div>
        <div>
            <input type="submit" value="確認">
        </div>
    </form>

    <script>
        function checkEmail(input) {
            if (input.value != document.getElementById('email').value) {
                input.setCustomValidity('メールアドレスが一致しません。');
            } else {
                // input is valid -- reset the error message
                input.setCustomValidity('');
            }
        }

        function checkPassword(input) {
            if (input.value != document.getElementById('password').value) {
                input.setCustomValidity('パスワードが一致しません。');
            } else {
                // input is valid -- reset the error message
                input.setCustomValidity('');
            }
        }
    </script>
    <%@ include file="../footer.jsp" %>

</body>
</html>
