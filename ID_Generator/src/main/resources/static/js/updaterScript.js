function validation() {
    var elements = {
    username: document.getElementById("user").value,
    department: document.getElementById("department").value,
    mobileNumber: document.getElementById("mobileNumber").value,
    email: document.getElementById("emails").value,
    image: document.getElementById("img"),
    spanUser:document.getElementById("username"),
    spanDepartment: document.getElementById("depart").value,
    spanmobileNo:document.getElementById("mobileno"),
    spanEmail:document.getElementById("emailids"),
    spanImage: document.getElementById("imageId"),
    hiddenField: document.getElementById("filename"),
    }

    if(elements.username === ""){
        elements.spanUser.innerHTML = "** Please Enter a User Name";
        return false;
    }
    if((elements.username.length <= 2) || (elements.username.length > 20)) {
        elements.spanUser.innerHTML =" ** Username lenght must be between 2 and 20";
        return false;
    }
    if(!isNaN(elements.username)){
        elements.spanUser.innerHTML =" ** only characters are allowed";
        return false;
    }

//-----------------------------------------------------------------------------------------------------------
    if(elements.department === ""){
        elements.spanDepartment.innerHTML = "** Please Enter a Department";
        return false;
    }

//---------------------------------------------------------------------------------------------------------------------

    if(elements.mobileNumber == ""){
        elements.spanmobileNo.innerHTML =" ** Please fill the mobile NUmber field";
        return false;
    }
    if(isNaN(elements.mobileNumber)){
        elements.spanmobileNo.innerHTML =" ** user must write digits only not characters";
        return false;
    }
    if(elements.mobileNumber.length!=10){
        elements.spanmobileNo.innerHTML =" ** Mobile Number must be 10 digits only";
        return false;
    }

//----------------------------------------------------------------------------------------------------------------------

    if(elements.email == ""){
        elements.spanEmail.innerHTML =" ** Please fill the email idx` field";
        return false;
    }
    if(elements.email.indexOf('@') <= 0 ){
        elements.spanEmail.innerHTML =" ** @ Invalid Position";
        return false;
    }

    if((elements.email.charAt(emails.length-3) === '.') && (elements.email.charAt(emails.length-2) === '.')){
        elements.spanEmail.innerHTML =" ** . Invalid Position";
        return false;
    }   
    
}

//--------------------------------------------------------------------------------------------------------------------
function checkFileExtension() { 
	var image = document.getElementById('img');
	var fileName = image.value;
    fileName = fileName.replace(/\\/g,"\\\\");
    document.getElementById('filename').value = fileName;
}
//-------------------------------------------------------------------------------------------------------------------------


