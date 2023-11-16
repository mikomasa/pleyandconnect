<%@ page language="java" pageEncoding="UTF-8"%>
<style>
    body, html {
        height: 100%;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
    }

    .content-wrapper {
        flex: 1;
        padding-bottom: 40px; /* フッターの高さ以上のパディングを追加 */
    }

    footer {
        display: flex;
        justify-content: space-around;
        border-top: 1px solid #000;
        padding: 10px 0;
        position: relative;
        bottom: 0;
        width: 100%;
    }
</style>
<body>
    <div class="content-wrapper">
        <!-- ページのコンテンツ -->
    </div>
    <footer>
        <a href="<%= request.getContextPath() %>/abc/others/TOS.jsp">利用規約</a>
        <a href="<%= request.getContextPath() %>/abc/others/info.jsp">お問い合わせ</a>
    </footer>
</body>
