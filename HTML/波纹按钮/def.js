let box = document.querySelectorAll(".box");
for(let i = 0; i < box.length; i++){
    box[i].onmouseenter = function(event){
        let ripple = box[i].querySelector(".ripple");
        ripple.classList.add("animation");
        ripple.style.width = this.offsetWidth + "px";
        ripple.style.height = this.offsetHeight + "px";
        ripple.style.top = (this.offsetHeight - event.offsetY) + "px";
        ripple.style.left = (this.offsetWidth / 2 - event.offsetX) + "px";

        setTimeout(function(){
            ripple.classList.remove("animation");
        }, 500)
    }

}