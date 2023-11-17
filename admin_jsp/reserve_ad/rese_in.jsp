<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<form action="Reservation.action" method="post">
<p>予約番号 <input type="text" name="resenum"></p>
<p>ユーザーID <input type="text" name="userid"></p>
<p>コートID <input type="text" name="cid"></p>
<p>予約ステータス <input type="text" name="resesta"></p>
<p>利用人数 <input type="text" name="numpeop"></p>
<p>利用開始時間 <input type="datetime-local" name="start"></p>
<p>利用終了時間 <input type="datetime-local" name="end"></p>
<p>利用目的 <input type="text" name="memo"></p>
<p><input type="submit" value="予約を確定"></p>
</form>

<%@include file="../footer.html" %>
