const wrapper = document.querySelectorAll(".input-wrapper"),
textInput = document.querySelector("input[type='text']");
passInput = document.querySelector("input[type='password']");

textInput.addEventListener("keyup", event => {
    wrapper[0].setAttribute("data-text", event.target.value);
});
passInput.addEventListener('keyup', event => {
    wrapper[1].setAttribute('data-text', event.target.value);
})