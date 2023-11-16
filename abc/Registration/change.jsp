<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>会員情報更新</title>
    <script>
        function validateForm() {
            var email = document.getElementById('email').value;
            var confirmEmail = document.getElementById('confirm_email').value;
            var password = document.getElementById('password').value;
            var confirmPassword = document.getElementById('confirm_password').value;

            if (email !== confirmEmail) {
                alert("メールアドレスが一致しません。");
                return false;
            }
            if (password !== confirmPassword) {
                alert("パスワードが一致しません。");
                return false;
            }
            // 追加の形式検証が必要であればここで行います。
            return true;
        }
    </script>
</head>
<body>
<%@ include file="../header.jsp" %>
    <h2>会員情報更新</h2>
    <form name="updateForm" action="check.jsp" method="post" onsubmit="return validateForm();">
        <div>
            <label for="name">氏名:</label>
            <input type="text" id="name" name="name" value="${member.name}" required><br>
        </div>
        <div>
            <label for="dob">生年月日:</label>
            <input type="date" id="dob" name="dob" value="${member.dob}" required><br>
        </div>
        <div>
            <label for="phone">電話番号:</label>
            <input type="tel" id="phone" name="phone" value="${member.phone}" required pattern="\d{10,11}" title="電話番号は10-11桁の数字で入力してください"><br>
        </div>
        <div>
            <label for="address">住所:</label>
            <input type="text" id="address" name="address" value="${member.address}" required><br>
        </div>
        <div>
            <label for="email">メールアドレス:</label>
            <input type="email" id="email" name="email" value="${member.email}" required><br>
        </div>
        <div>
            <label for="confirm_email">メールアドレス（確認）:</label>
            <input type="email" id="confirm_email" name="confirm_email" required><br>
        </div>
        <div>
            <label for="password">パスワード:</label>
            <input type="password" id="password" name="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="パスワードは8文字以上で、少なくとも1つの数字と1つの大文字を含む必要があります。"><br>
        </div>
        <div>
            <label for="confirm_password">パスワード（確認）:</label>
            <input type="password" id="confirm_password" name="confirm_password" required><br>
        </div>
        <div>
            <label for="secret_question">秘密の質問:</label>
            <input type="text" id="secret_question" name="secret_question" value="${member.secretQuestion}" required><br>
        </div>
        <div>
            <label for="secret_answer">秘密の質問の答え:</label>
            <input type="text" id="secret_answer" name="secret_answer" value="${member.secretAnswer}" required><br>
        </div>
        <input type="submit" value="確認">
    </form>
<%@ include file="../footer.jsp" %>
</body>
</html>
