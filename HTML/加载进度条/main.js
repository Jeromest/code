function progress(){
  let progr = document.getElementById(elementid:"progress");
  let text = document.getElementById(elementid:"countText");
  let count = 5;
  let progresss = 25;
  let id = setInterval(handler:function()){
    if(progresss == 500 && counter == 100){
      clearInterval(id)
    }else{
      progresss += 5;
      counter += 1；
      progr.style.width = progresss + "px";
      text.innerHTML = counter + "%";
    }
  }, timeout: 50)
}
progress();
