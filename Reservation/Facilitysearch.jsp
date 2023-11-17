<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.jsp" %>

<p>キーワードを入力してください。</p>
<form action="search" method="post">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>
<hr>
<h3>施設一覧</h3>
<div style=" color: white; background: #f98289; padding: 20px; border: 2px dashed rgba(255 , 255 , 255 , 0.5);-moz-border-radius: 6px; -moz-box-shadow: 0 0 0 5px #f98289 , 0 2px 3px 5px rgba(0 , 0 , 0 , 0.5); -webkit-border-radius: 6px; -webkit-box-shadow: 0 0 0 5px #f98289 , 0 2px 3px 5px rgba(0 , 0 , 0 , 0.5); border-radius: 6px; box-shadow: 0 0 0 5px #f98289 , 0 2px 3px 5px rgba(0 , 0 , 0 , 0.5); font-size: 100%; ">
<table style="border-collapse:separate;border-spacing:10px;">
<c:forEach var="product" items="${list}">
	<tr>
	<td>${product.id}</td>
	<td><img src="image/${product.id}.jpg" height="64"></td>
	<td>${product.price}なんちゃら施設<br></td>
	<td>${product.add}住所</td>
	<td><link href="CartAdd.action?id=${product.id}"></link></td>
	</tr>
</c:forEach>
</table>
</div>
<%@include file="../footer.jsp" %>
