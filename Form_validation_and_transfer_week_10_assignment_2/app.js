const form = document.querySelector('#create-account-form');
const usernameInput= document.querySelector('#username');
const emailInput = document.querySelector('#email');
const passwordInput=document.querySelector('#password'); 
const confirmPassword=document.querySelector('#confirm-password'); 


form.addEventListener('submit',(e) => {
    
    validateForm();
    
    if(isFormValid() == true){
        form.submit();
    }else{ 
        e.preventDefault();
     }
} )

function isFormValid(){
    const inputContainers = form.querySelectorAll(".input-group");
    let result=true;
    
    inputContainers.forEach((container)=> {
        if(container.classList.contains('error')){
            result = false; 
        }
    });
    return result;
}

function validateForm(){
    //username
    if(usernameInput.value.trim()== '' ){
        setError(usernameInput, "Name can not be empty")
    }else if (usernameInput.value.trim().length <5 || usernameInput.value.trim.length > 15){
        setError(usernameInput, 'Name must be a min of 5 characters,and a max of 15');
    } else {setSuccess(usernameInput)}
    //email
    if(emailInput.value.trim() == ''){
        setError(emailInput, 'provide an email address'); 
    }else if (isEmailValid(emailInput)){
        setSuccess(emailInput);
    }
    else{
        setError(emailInput, 'provide a valid email address')
    }
    //password
    if(passwordInput.value.trim() == ''){
        setError(passwordInput, "provide a password ")
    }else if(passwordInput.value.trim().length <6 || passwordInput.value.trim().length >25){
        setError(passwordInput, "please provide a password of at least 6 characters, and less than 25");
    
    }else{
        setSuccess(passwordInput); 
    }
    //confirm password
    if(confirmPassword.value.trim()==''){
        setError(confirmPassword, "please confirm your password");
    }else if (confirmPassword.value != passwordInput.value){
        setError(confirmPassword, "your password does not match what you've entered")
    } else{
        setSuccess(confirmPassword); 
    }
}


function setError(element, errorMessage){
const parent = element.parentElement;
if(parent.classList.contains('success')){
    parent.classList.remove('success');
}

parent.classList.add('error');

const paragraph = parent.querySelector('p'); 

paragraph.textContent =errorMessage;
}

function setSuccess(element){
    const parent = element.parentElement;
    if(parent.classList.contains('error')){
        parent.classList.remove('error');
    }

    parent.classList.add('success'); 
}

function isEmailValid(email) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email.value))
  {
    return (true)
  }
    return (false)
}