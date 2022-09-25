 
   
  document.addEventListener('click',(event)=>{
    const message = document.querySelector('.item-phone');
 if(event.target.className  === 'email'){
   event.preventDefault();
   let text  = "E-mail copied to clipboard"
   message.innerHTML = text;
   showMessage (message,event);
   saveToBufer(document.querySelector("span#mail"));
  }

  if(event.target.className === 'contact__data__info__phone__item' || event.target.className === 'name__link phone'){
    event.preventDefault();
    let text  = "Phone copied to clipboard"
    message.innerHTML = text;
    showMessage (message,event);
    saveToBufer(document.querySelector("span#phone"));
   }
});
 
function showMessage (object,event){
  object.style.left = event.clientX+'px';
  object.style.top = event.clientY+'px';
  object.style.opacity =1;
  let textAll= document.querySelector("span#mail");
  navigator.clipboard.writeText(textAll.innerHTML)
  setTimeout(function(){hideMessage (object);},750);
}
function hideMessage (object){
  document.querySelector('.message').style.opacity = 0;
}
function saveToBufer(obj){
  navigator.clipboard.writeText(obj.innerHTML)
}

 

 