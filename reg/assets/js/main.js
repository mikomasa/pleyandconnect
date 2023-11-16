$(function() {
    // 今日の日付を取得
    var today = new Date();
    var todayString = today.getFullYear() + '-' + ('0' + (today.getMonth() + 1)).slice(-2) + '-' + ('0' + today.getDate()).slice(-2);

    // datepicker表示イベント
    $('#date').pickadate({
        min: todayString // 今日以前の日付を選択できないようにする
    });

    // 利用開始時間表示イベント
    var startTimePicker = $('#start-time').pickatime({
        format: 'HH:i', // 24時間表記
        interval: 30,   // 表示間隔
        min: [10, 00],  // 利用開始の最小時間
        max: [20, 00],  // 利用開始の最大時間
        editable: false, // ユーザーが手入力できないようにする
        onClose: function() {
            // 利用開始時間が変更されたときに、利用終了時間の制約を更新
            var selectedStart = startTimePicker.get('select');
            var selectedEnd = endTimePicker.get('select');

            if (selectedEnd && selectedStart.pick > selectedEnd.pick) {
                endTimePicker.set('select', selectedStart);
            }
        }
    });

    // 利用終了時間表示イベント
    var endTimePicker = $('#end-time').pickatime({
        format: 'HH:i', // 24時間表記
        interval: 30,   // 表示間隔
        min: [10, 00],  // 利用終了の最小時間
        max: [20, 00],  // 利用終了の最大時間
        editable: false  // ユーザーが手入力できないようにする
    });

    // 設備選択部分の折り畳み表示
    $('.facility-section').click(function (e) {
        e.stopPropagation(); // クリックイベントが親要素に伝播しないように

        // クリックされた設備セクションの下にあるコート選択部分を切り替える
        var courtSelection = $(this).find('.court-selection');
        courtSelection.slideToggle();

        // アコーディオンメニューの▼／▶アイコンを切り替える
        $(this).toggleClass('opened');

        // 他の施設を選択した場合は他のコート選択部分を閉じ、▼アイコンを▶に戻す
        $('.court-selection').not(courtSelection).slideUp();
        $('.facility-section').not(this).removeClass('opened');
    });

    // コート名部分をクリックした際にもチェックボックスにチェックを入れる
    $('.court-selection label').click(function (e) {
        e.stopPropagation(); // クリックイベントが親要素に伝播しないように

        var checkbox = $(this).prev('input[type="checkbox"]');
        checkbox.prop('checked', !checkbox.prop('checked'));
    });

    // コートのチェックボックスをクリックしたときに、親のアコーディオンメニューが閉じないようにする
    $('.court-selection input[type="checkbox"]').click(function (e) {
        e.stopPropagation(); // イベントの伝播を止める
    });

    // 予約ボタンバインド
    $('#submit').click(onClickSubmit);

    // 予約ボタン押下処理
    function onClickSubmit() {
        // ... (前回のコードと同じ)
    }

    // タイトルクリックできないように
    $('.fieldset__wrapper label').click(function(e) {
        e.preventDefault();
    });
});