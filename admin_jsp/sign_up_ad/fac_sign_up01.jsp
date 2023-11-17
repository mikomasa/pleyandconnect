<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="addform.js"></script>
<title>新規施設登録</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<h2>新規施設登録</h2>
	<p>以下のフォームを入力してください</p>
	<form action="facsignup01" method="get">
		<label>施設名:<input type="text" name="fac_name"></label><br>
		<label>施設住所:<input type="text" name="fac_address"></label><br>
		<label>アクセス:<textarea name="access" ></textarea></label><br>
		<label>利用可能種目:<textarea name="sport_kind" ></textarea></label><br>
		<div id="form_area">
		</div><br>
		<input type="button" value="フォーム追加" onclick="addForm()">
		<br><label>営業開始時間:<input type="time" name="fac_open"></label><br>
		<label>営業終了時間:<input type="time" name="fac_end"></label><br>
		<label>最大利用時間:<input type="time" name="max_use"></label><br>
		<label>最低利用時間:<input type="time" name="min_use"></label><br>
		<label>定休日:<input type="text" name="holi"></label><br>
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
		<label><a href="rule.jsp" target="_blank" rel="noopener noreferrer">利用規約</a>(別タブで開きます)</label><br>
		<label><input type="checkbox" name="rule"><span class="bold">同意しました。</span></label><br>
		<input type="submit" name="submit" id="submit" value="確定">
	</form>
</body>
</html>
<%@include file="../footer.html" %>