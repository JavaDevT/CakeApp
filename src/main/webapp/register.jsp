 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



 <html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>JSP</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">


  <link href="../resources/css/style.css" type="text/css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">

   <script src="../resources/js/script.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
    crossorigin="anonymous"></script>


</head>

<body>

  <script>

  </script>

  <div class="col-lg-12">

    <div class="col-lg-5 col-md-5 col-sm-8 col-xs-10  logincontainer" style="float: none;
     margin: 0 auto; margin-top: 50px;margin-bottom: 20px;">
      <div class="row" style=" margin-bottom: 50px;">
        <h1 style="margin-top: 50px;  text-align: center;
">User Register</h1>
<form name="register" action="\user_register"  onsubmit="return checkUserAvailablity()" method="post" novalidate>


        <div class="col-lg-8 border-bottom-0 centercontent" style="margin-left:20px;
">

          <h5 style="margin-top: 20px;
          padding: 0px;
          margin-bottom: 5px;
      ">Username</h5>
          <div class="col-lg-1" style="padding:0px; margin-top: 3px;
"><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person"
              viewBox="0 0 16 16">
              <path
                d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
            </svg>
          </div>
          <div class="col-lg-11" style="padding:0px"><input type="text"
              style="font-size: medium; width: 100%;border: 0px;" name="username" id="username" oninput="removeUserError()" class="no-outline"
              placeholder="Please enter your name"></div>
          <div class="col-lg-12" id="usernameline"style="height: 1px;
          background: gray;"> </div><br><br>



          <h5 style="margin-top: 20px;
          padding: 0px;
          margin-bottom: 5px;
      ">Password</h5>
          <div class="col-lg-1" style="padding:0px; margin-top: 3px;
"><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person"
              viewBox="0 0 16 16">
              <path
                d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
            </svg>
          </div>
          <div class="col-lg-11" style="padding:0px"><input   name="password" type="password" id="userpassword" oninput="removePassError()"
              style="font-size: medium; width: 100%;border: 0px;" class="no-outline"
              placeholder="Please enter your password"></div>
          <div class="col-lg-12" id ="passwordline" style="height: 1px;
          background: #8d8c8c;"> </div>


<br><br>



          <h5 style="margin-top: 20px;
          padding: 0px;
          margin-bottom: 5px;
      ">Confirm Password</h5>
          <div class="col-lg-1" style="padding:0px; margin-top: 3px;
"><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person"
              viewBox="0 0 16 16">
              <path
                d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
            </svg>
          </div>
          <div class="col-lg-11" style="padding:0px"><input type="password" id="cpassword" oninput="removeCpassError()"
              style="font-size: medium; width: 100%;border: 0px;" class="no-outline"
              placeholder="Please enter your confirm password"></div>
          <div class="col-lg-12" id ="cpasswordline" style="height: 1px;
          background: gray;"> </div>

<br><br>



<h5 style="margin-top: 20px;
padding: 0px;
margin-bottom: 5px;
">Address Line 1</h5>
<div class="col-lg-1" style="padding:0px; margin-top: 3px;
"><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person"
    viewBox="0 0 16 16">
    <path
      d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
  </svg>
</div>
<div class="col-lg-11" style="padding:0px"><input  name="addressLine1"  type="text" id="address" oninput="removeAddress()"
    style="font-size: medium; width: 100%;border: 0px;" class="no-outline"
    placeholder="Please enter your address line 1"></div>
<div class="col-lg-12" id="addressline"  style="height: 1px;
background: gray;"> </div>

<br><br>

            <h5 style="margin-top: 20px;
padding: 0px;
margin-bottom: 5px;
">Address Line 2</h5>
            <div class="col-lg-1" style="padding:0px; margin-top: 3px;
"><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person"
       viewBox="0 0 16 16">
                <path
                        d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
            </svg>
            </div>
            <div class="col-lg-11" style="padding:0px"><input name="addressLine2"  type="text" id="address-line2" oninput="removeAddressLine()"
                                                              style="font-size: medium; width: 100%;border: 0px;" class="no-outline"
                                                              placeholder="Please enter your address line2"></div>
            <div class="col-lg-12" id="address-line1"  style="height: 1px;
background: gray;"> </div>

            <br><br>

            <h5 style="margin-top: 20px;
padding: 0px;
margin-bottom: 5px;
">Pin code</h5>
            <div class="col-lg-1" style="padding:0px; margin-top: 3px;
"><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person"
       viewBox="0 0 16 16">
                <path
                        d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
            </svg>
            </div>
            <div class="col-lg-11" style="padding:0px"><input   name="pinCode" type="text" id="pin-code" oninput="removePinCode()"
                                                              style="font-size: medium; width: 100%;border: 0px;" class="no-outline"
                                                              placeholder="Please enter your pin code"></div>
            <div class="col-lg-12" id="pin-code-line"  style="height: 1px;
background: gray;"> </div>

            <br><br>

          <h5 style="margin-top: 20px;
          padding: 0px;
          margin-bottom: 5px;
      ">Phone Number</h5>
          <div class="col-lg-1" style="padding:0px; margin-top: 3px;
"><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person"
              viewBox="0 0 16 16">
              <path
                d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
            </svg>
          </div>
          <div class="col-lg-11" style="padding:0px"><input  name="number"  type="number" id="phonenumber" oninput="removePhNumber()"
              style="font-size: medium; width: 100%;border: 0px;" class="no-outline"
              placeholder="Please enter your phone number"></div>
          <div class="col-lg-12" id="phline" style="height: 1px;
          background: gray;"> </div>
 <div class="col-lg-12 padding-empty" style="margin-top: 10px;"><h4 style="color: red;"  id="errormsg"></h4></div>
       <div class="col-lg-12 padding-empty  " style="margin-top: 20px;">
       <h4 id="error-msg">${message}</h4>
       </div>
          <div class="col-lg-12 padding-empty  " style="margin-top: 20px;">

            <div class="col-lg-6 centercontent"><button type="submit" class="btn btn-primary" style="width: 100%;
    height: 35px;font-size: 15px;">Register</button> </a></div>

          </div>

        </div>
      </form>

      </div>
    </div>
  </div>







</body>

</html>