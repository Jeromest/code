const boxDOM = document.querySelector('.box')

boxDOM.addEventListener('drag', function(e) {
    console.log(e.offsetX, e.offsetY);
})