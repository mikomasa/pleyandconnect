<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<head>
<meta charset="UTF-8">
<title>Vue.js sample</title>
<script src="https://cdn.jsdelivr.net/npm/vue@2.5.17/dist/vue.js"></script>
</head>
<%@ include file="../header.jsp"%>
<div>
				<label>プラン選択:</label><br> <input type="radio" id="monthly"
					name="plan" value="monthly" checked> <label for="monthly">月額プラン</label><br>
				<input type="radio" id="annual" name="plan" value="annual">
				<label for="annual">年間プラン</label>
			</div>

			<div>
				<label>支払方法:</label><br> <input type="radio" id="paypal"
					name="payment_method" value="paypal" checked> <label
					for="paypal">PayPal</label>
			</div>

<body>
	<div id="app">
		<!-- クリック要素 -->
		<button type="button" v-on:click="open" class="modal_open_btn">次へ</button>
		<!-- モーダルウィンドウ -->
		<div v-show="show" class="modal_contents">
			<!-- モーダルウィンドウの背景 -->
			<div v-on:click="close" class="modal_contents_bg"></div>
			<!-- モーダルウィンドウの中身 -->

			<div class="modal_contents_wrap">
				<label for="password">パスワードを入力してください:</label> <input type="password"id="password" name="password" required>
				<!-- モーダルウィンドウを閉じる -->
				<form action="confirmation.jsp" method="post" v-show="show"
					class="modal_close_btn">
					<button type="submit">確定</button>
				</form>
			</div>
		</div>
	</div>

	<script>
        new Vue({
            el: '#app',
            data() {
                return {
                    show: false
                };
            },
            methods: {
                open() {
                    this.show = true;
                },
                close() {
                    this.show = false;
                }
            }
        });
        app.mount("#app");
    </script>

	<style>
.modal_open_btn {
	display: inline-block;
	cursor: pointer;
	padding-top: 30px;
}

.modal_contents {
	position: absolute;
	top: 0;
	left: 0;
	z-index: 100;
	width: 100%;
	height: 100%;
	width: 100%;
}

.modal_contents_bg {
	background: rgba(0, 0, 0, .8);
	width: 100%;
	height: 100%;
}

.modal_contents_wrap {
	position: absolute;
	top: 50%;
	left: 50%;
	background-color: #fff;
	width: 50%;
	height: 50%;
	margin: auto;
	transform: translate(-50%, -50%);
	padding: 30px;
}

.modal_close_btn {
	display: inline-block;
	cursor: pointer;
	margin-top: 10px;
}
</style>
</body>

<%@ include file="../footer.jsp"%>