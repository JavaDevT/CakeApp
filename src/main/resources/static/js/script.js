function checkUserAvailablity(){
     let username = document.forms["register"]["username"].value;
     let phonenumber = document.forms["register"]["phonenumber"].value;
     let address = document.forms["register"]["address"].value;
     let cpassword = document.forms["register"]["cpassword"].value;
     let userpassword = document.forms["register"]["userpassword"].value;
     let pincode = document.forms["register"]["pin-code"].value;
     console.log(username+" cpass "+cpassword+" pass "+userpassword+" address "+address+"  ph number"+phonenumber)
     let status=true;
     if (username == "") {
  var element = document.getElementById("usernameline");
  element.style.backgroundColor = "#FF0000";
  status=false;
}
if (pincode == "") {
    var element = document.getElementById("pin-code-line");
    element.style.backgroundColor = "#FF0000";
    status=false;
   }
if (phonenumber == "") {
    var element = document.getElementById("phline");
    element.style.backgroundColor = "#FF0000";
    status=false;
   }
  if (cpassword == "") {
    var element = document.getElementById("cpasswordline");
    element.style.backgroundColor = "#FF0000";
    status=false;
}if (userpassword == "") {
    var element = document.getElementById("passwordline");
    element.style.backgroundColor = "#FF0000";
    status=false;
}/*if (address == "") {
    var element = document.getElementById("addressline");
    element.style.backgroundColor = "#FF0000";
    status=false;
}*/
  
    if(!status){
     return false;
   }else{

      if (userpassword !== cpassword ) {
        document.getElementById("errormsg").innerHTML="Password and conform password mismatch";
          // element.style.backgroundColor = "#FF0000";
          return false;
      }else {
         return true;
       }
   }
  }

  function removeUserError(){
    var element = document.getElementById("usernameline");
  element.style.backgroundColor = "#8d8c8c";
  }

   function removePinCode(){
    var element = document.getElementById("pin-code-line");
  element.style.backgroundColor = "#8d8c8c";
  }
  function removePassError(){
    var element = document.getElementById("passwordline");
    element.style.backgroundColor = "#8d8c8c";
    document.getElementById("errormsg").innerHTML="";


  } 
  function removeCpassError(){
    document.getElementById("errormsg").innerHTML="";

    var element = document.getElementById("cpasswordline");
  element.style.backgroundColor = "#8d8c8c";
  }
   function removeAddress(){
    var element = document.getElementById("addressline");
  element.style.backgroundColor = "#8d8c8c";
  }
   function removePhNumber(){
    var element = document.getElementById("phline");
  element.style.backgroundColor = "#8d8c8c";

}
function loginValidation(){
 let username = document.forms["login"]["username"].value;
     let password = document.forms["login"]["password"].value;
        if (username == "") {
       var element = document.getElementById("usernameLine");
       element.style.backgroundColor = "#FF0000";
       return false;
     }
       if (password == "") {
             var element = document.getElementById("passLine");
       element.style.backgroundColor = "#FF0000";
      return false;
     }

}
 function removeLoginUserName(){
        var element = document.getElementById("usernameLine");
  element.style.backgroundColor = "#8d8c8c";
     document.getElementById("error-msg").innerHTML="";

}
 function removeLoginPass(){
    var element = document.getElementById("passLine");
     document.getElementById("error-msg").innerHTML="";
  element.style.backgroundColor = "#8d8c8c";

}

function callApi(){
    fetch('https://api.example.com/endpoint', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ key: 'value' })
      })
          .then(response => response.json())
          .then(data => console.log(data))
          .catch(error => console.error(error))
}