<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Play&Connect</title>
    <style>
        header {
            display: flex;
            align-items: center;
            justify-content: space-around;
            border-bottom: 1px solid #000;
            padding: 10px 0;
        }
        header img {
            max-height: 40px; /* Adjust the size to fit into your header */
        }
        /* ここに他のスタイルを追加する */
    </style>
</head>
<body>
    <header>
        <a href="<%= request.getContextPath() %>/top.jsp">
            <img src="<%= request.getContextPath() %>/abc/images/pnc-logo.png" alt="P&C Logo">
        </a>
        <a href="<%= request.getContextPath() %>/abc/others/board.jsp">掲示板</a>
        <a href="<%= request.getContextPath() %>/abc/log/login.jsp">ログイン</a>
        <a href="<%= request.getContextPath() %>/abc/Registration/Registratiom.jsp">新規登録</a>
    </header>
    <!-- header.jspの内容はここで終わります -->
