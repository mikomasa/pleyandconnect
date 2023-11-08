var i = 1 ;

function addForm() {
  var text_input_data = document.createElement('input');
  text_input_data.type = 'text';
  text_input_data.id = 'text_inputform_' + i;
  text_input_data.name = 'equi_name' + i;
  text_input_data.placeholder = '設備名を入力-' + i;

  var number_input_data = document.createElement('input');
  number_input_data.type = 'number';
  number_input_data.id = 'number_inputform_' + i;
  number_input_data.name = 'equi_fee' + i;
  number_input_data.placeholder = '設備の料金を入力-' + i;

  var parent = document.getElementById('form_area');
  parent.appendChild(text_input_data);
  parent.appendChild(number_input_data);

  var button_data = document.createElement('button');
  button_data.id = 'button_' + i;
  button_data.onclick = function(){deleteBtn(this);}
  button_data.innerHTML = '削除';

  parent.appendChild(button_data);


  i++;
}

function deleteBtn(target) {
  var target_id = target.id.substring(7);
  var parent = document.getElementById('form_area');
  var text_ipt_id = document.getElementById('text_inputform_' + target_id);
  var number_ipt_id = document.getElementById('number_inputform_' + target_id);
  var tgt_id = document.getElementById('button_' + target_id);

  parent.removeChild(text_ipt_id);
  parent.removeChild(number_ipt_id);
  parent.removeChild(tgt_id);

}