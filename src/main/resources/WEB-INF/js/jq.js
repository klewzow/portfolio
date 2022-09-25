
const text = "<div class='field' > " +
  "<label for='files'>Name</label>" +
  "<input id='nameField' type='text' value='summa'> " +
  "<label for='files'>Value</label>" +
  "<input id='valueField' type='text'value='1000.02'> " +
  "  <img id='add_field' class='image__addDel__class' src='../image/add_field.png' alt=''> " +
  " <img id='del_field' class='image__addDel__class' src='../image/del_field.png' alt=''> " +
  "  <img id='setText' class='image__addDel__class' src='../image/add.png' alt=''  onfocus='false' > "
  + "</div>" +
  "<div class='field' > " +
  "<label for='files'>Name</label>" +
  "<input id='nameField'    type='text' value='volume'> " +
  "<label for='files'>Value</label>" +
  "<input id='valueField' type='text'value='52.00'> " +
  "<img id='add_field' class='image__addDel__class' src='../image/add_field.png' alt=''> " +
  "<img id='del_field' class='image__addDel__class' src='../image/del_field.png' alt=''> " +
  "<img id='setText' class='image__addDel__class' src='../image/add.png' alt=''  onfocus='false' > "
  + "</div>";

$(document).ready(function () {

  var ready = document.querySelector(".p__generator");


  ready.addEventListener('click', (event) => {
 
    if (event.target.id === 'add_field') {
      options.insertAdjacentHTML('beforeend', text);
    }

    if (event.target.id === 'del_field') {
      event.target.parentNode.remove();
    }

    if (event.target.id === 'setText') {

      let string = document.getElementById('editorText') ;
       
      let start = string.selectionStart;
      let end = string.selectionEnd;
      alert(start+ " " +end);
      if (start != end) {
        
        document.querySelector('editorText').value = string.replace(window.getSelection().toString(), '@{' + event.target.parentNode.querySelector("#nameField").value + '}');
        
      }
      bodyAppEnd(end + " -> " + start);
    }
  });
  var func = false;
  ready.addEventListener('keypress', (event) => {

    if (event.code == 'NumpadEnter' || event.code == 'Enter') {
      event.preventDefault();
      return false;
    }
  });
  ready.addEventListener('keyup', (event) => {

    if (event.target.value.toString().charAt(0) === '=' && event.target.id === 'valueField') {
      func = true;
    };

  });



  function bodyAppEnd(text) {
    var body = document.querySelector('body');
    body.append( text );
       ;
  }

});

