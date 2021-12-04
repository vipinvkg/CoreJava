function validate (abc){
    var flag =true;
    if(abc.login.value==''){
    document.getElementById("lcheck").innerHTML= "Login ID is required"
    flag = false;
}
if (abc.pass.value==''){
document.getElementById("pcheck").innerHTML = "Password required"
flag = false;
}
return flag;
}