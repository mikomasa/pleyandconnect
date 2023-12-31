<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../header.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="addform.js"></script>
<title>施設情報変更</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<h2>施設情報変更</h2>
	<p>変更したい項目のフォームを書き換えてください</p>
	<form action ="">
		<label>施設名:<input type="text" name="fac_name" value=""></label><br>
		<label>施設住所:<input type="text" name="fac_address" value=""></label><br>
		<label>アクセス:<textarea name="access" value=""></textarea></label><br>
		<label>利用可能種目:<textarea name="sport_kind" value=""></textarea></label><br>
		<div id="form_area">
		</div><br>
		<input type="button" value="フォーム追加" onclick="addForm()">
		<br><label>営業開始時間:<input type="time" name="fac_open"></label><br>
		<label>営業終了時間:<input type="time" name="fac_end"></label><br>
		<label>最大利用時間:<input type="time" name="max_use"></label><br>
		<label>最低利用時間:<input type="time" name="min_use"></label><br>
		<label>定休日:<input type="" name="holi"></label><br>
		<label>利用条件:<textarea name="condi"></textarea></label><br>
		<label>
		予約方法：
		<select name="book_meth">
			<option>先着予約</option>
			<option>抽選予約</option>
		</select>
		</label><br>
		<label>
		抽選日時：
		<select name="lot_day">
			<option>利用月の1か月前の最終日</option>
			<option>利用月の1か月前の15日</option>
			<option>利用月の2か月前の最終日</option>
		</select>
		</label><br>
		<label>
		予約締め切り日時：
		<select name="dead_day">
			<option>利用月の1か月前の最終日</option>
			<option>利用月の1か月前の15日</option>
			<option>利用月の2か月前の最終日</option>
		</select>
		</label><br>
		<label>管理者氏名:<input type="text" name="name"></label><br>
		<label>メールアドレス:<input type="email" name="mail"></label><br>
		<label>メールアドレス確認:<input type="email" name="mail02"></label><br>
		<label>電話番号:<input type="tel" name="phone"></label><br>
		<label>パスワード:<input type="password" name="password"></label><br>
		<label>パスワード確認:<input type="password" name="password02"></label><br>
		<label>
		秘密の質問:
		<select name="secret_ques">
			<option>昔買ってた犬の名前は?</option>
			<option>出身小学校の名前は？</option>
			<option>母親の旧姓は?</option>
			<option>好きな食べ物は?</option>
		</select>
		</label><br>
		<label>答え:<input type="text" name="secret_ans"></label><br>
		<label>備考欄:<textarea name="note" ></textarea></label><br>


		<input type="submit" value="送信">
	</form>
</body>
</html>
<%@include file="../footer.html" %>