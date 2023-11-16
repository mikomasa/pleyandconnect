<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>pickadate.js デモ</title>

    <!-- 最新 -->
    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="assets/css/default.css">
    <link rel="stylesheet" href="assets/css/default.date.css">
    <link rel="stylesheet" href="assets/css/default.time.css">

    <script src="http://code.jquery.com/jquery-1.10.0.min.js"></script>
    <script src="assets/pickadate/picker.js"></script>
    <script src="assets/pickadate/picker.date.js"></script>
    <script src="assets/pickadate/picker.time.js"></script>
    <script src="assets/pickadate/legacy.js"></script>
    <script src="assets/pickadate/lang-ja.js"></script>  <!-- 日本語化 -->
    <script src="assets/js/main.js"></script>

    <style>
        /* 以下は先に提供されたdefault.cssの内容です */
        /* ... */
        .facility-section {
            cursor: pointer;
        }
        .court-selection {
            display: none;
        }
    </style>
</head>
<body>
    <section class="section">
        <div class="section__block section__block--scoped">
            <h3>pickadate.js 予約ページデモ</h3>
            <form action="your_submit_action.jsp" method="post">
                <fieldset class="fieldset fieldset--demo">
                    <div class="fieldset__wrapper">
                        <label> ■予約日 </label>
                        <input id="date" name="date" class="fieldset__input js__datepicker" type="text" placeholder="試してみてください...">

                        <!-- 施設の折り畳み表示 -->
                        <div class="facility-section" data-facility="gym">
                            <label> ■施設 </label>
                            <p>体育館</p>
                            <div class="court-selection" id="gym-court-selection">
                                <!-- 体育館のコート選択 -->
                                <label> ■コート選択 </label>
                                <div>
                                    <input id="gym-court1" name="court" type="checkbox" value="体育館のコート1">
                                    <label for="gym-court1">コート1</label>
                                </div>
                                <div>
                                    <input id="gym-court2" name="court" type="checkbox" value="体育館のコート2">
                                    <label for="gym-court2">コート2</label>
                                </div>
                                <!-- 他の体育館のコート選択を追加 -->
                                <!-- ... -->
                            </div>
                        </div>

                        <div class="facility-section" data-facility="tennis-court">
                            <p>テニスコート</p>
                            <div class="court-selection" id="tennis-court-court-selection">
                                <!-- テニスコートのコート選択 -->
                                <label> ■コート選択 </label>
                                <div>
                                    <input id="tennis-court1" name="court" type="checkbox" value="テニスコートのコート1">
                                    <label for="tennis-court1">コート1</label>
                                </div>
                                <div>
                                    <input id="tennis-court2" name="court" type="checkbox" value="テニスコートのコート2">
                                    <label for="tennis-court2">コート2</label>
                                </div>
                                <!-- 他のテニスコートのコート選択を追加 -->
                                <!-- ... -->
                            </div>
                        </div>

                        <!-- 他の施設を追加 -->
                        <!-- ... -->

                        <label> ■利用開始時間 </label>
                        <input id="start-time" name="start-time" class="fieldset__input js__timepicker picker--time" type="text" placeholder="試してみてください...">

                        <label> ■利用終了時間 </label>
                        <input id="end-time" name="end-time" class="fieldset__input js__timepicker picker--time" type="text" placeholder="試してみてください...">

                        <label> ■利用人数 </label>
                        <input id="num-people" name="num-people" class="fieldset__input" type="number" placeholder="人数を入力してください">

                        <label> ■利用目的 </label>
                        <input id="purpose" name="purpose" class="fieldset__input" type="text" placeholder="利用目的を入力してください">

                        <button type="submit" class="fieldset__button button button--small">予約</button>
                    </div>
                    <div id="result"></div>
                </fieldset>
            </form>
        </div>
    </section>
</body>
</html>
