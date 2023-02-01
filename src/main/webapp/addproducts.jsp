<%@page import="java.util.Optional"%>
 <%@page import="com.cakeshop.org.model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


 <html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>JSP</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">


     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
  <script src="../resources/js/script.js"></script>

    <link href="../resources/css/style.css" type="text/css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
            crossorigin="anonymous"></script>


</head>

<body>

<div class="col-lg-12">
    <div class="row">
        <div class="col-lg-12 " style="height: 70px; ">


                                                <div class="col-lg-5 center-div "
                                                        style="height: 70px; justify-content: right; float: right; text-align: right;  ">
                                                        <a class="col-lg-3   footer-menu"
                                                           href="/welcome_admin">Product List</a>
                                                        <a class="col-lg-3   footer-menu"
                                                                href="/order_list">Order List</a>
                                                        <a class="col-lg-3   footer-menu"
                                                                href="addproducts"> Add
                                                                Product</a>

                                                        <a class="col-lg-3  footer-menu" href="#">Logout</a>
            </div>
        </div>
    </div>
      <%!  AddProducts  addProducts;boolean isEditProduct=false; %>         
    <%  if(request.getAttribute("editData")!=null){
    	 addProducts=(AddProducts)request.getAttribute("editData");
    	 isEditProduct=true;
 
    }else {
    	 System.out.println("ans going ");
    	 addProducts=new AddProducts();
    	 addProducts.setCakeImage(""); addProducts.setCakeName(""); addProducts.setPrice("") ;
    	 addProducts.setQuantity(0); addProducts.setEggLess(false);
    	 addProducts.setId(0);
    	 
    }
     %>
    <div class="col-lg-5 col-md-5 col-sm-8 col-xs-10  logincontainer" style="float: none;
     margin: 0 auto; margin-top: 50px;margin-bottom: 20px;">
        <div class="row" style=" margin-bottom: 50px;">
            <h1 style="margin-top: 50px;  text-align: center;
">Add new cake</h1>
          <form:form  name="cake_details" onsubmit="return cake()"  modelAttribute="products"  action="/add_product" method="post">

           <div class="col-lg-8 border-bottom-0 centercontent" style="margin-left:20px;
">

                <h5 style="margin-top: 20px;
          padding: 0px;
          margin-bottom: 5px;
      ">Cakename</h5>
                <div class="col-lg-1" style="padding:0px; margin-top: 3px;
">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor"
                         class="bi bi-person"
                         viewBox="0 0 16 16">
                        <path
                                d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
                    </svg>
                </div>
                <div class="col-lg-11" style="padding:0px"><input id="username" name="cakeName"  path="cakeName" type="text"  value="<%=Optional.of(addProducts.getCakeName()).orElse("")%>" oninput="removeLoginUserName()"
                                                                  style="font-size: medium; width: 100%;border: 0px;"
                                                                  class="no-outline"
                                                                  placeholder="Please enter cake name"></div>
                <div class="col-lg-12" id="usernameLine" style="height: 1px;
          background: gray;"></div>
                <br><br>


                <h5 style="margin-top: 20px;
          padding: 0px;
          margin-bottom: 5px;
      ">Price / KG</h5>
                <div class="col-lg-1" style="padding:0px; margin-top: 3px;
">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor"
                         class="bi bi-person"
                         viewBox="0 0 16 16">
                        <path
                                d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
                    </svg>
                </div>
                <div class="col-lg-11" style="padding:0px"><input  path="price" value=<%=Optional.of(addProducts.getPrice()).orElse("")%> oninput="removeLoginPass()" id ="password" name ="price" type="number"
                                                                  style="font-size: medium; width: 100%;border: 0px;"
                                                                  class="no-outline"
                                                                  placeholder="Please enter price"></div>
                <div class="col-lg-12" id="passLine"style="height: 1px;
          background: gray;"></div>
<br><br>


<h5 style="margin-top: 20px;
padding: 0px;
margin-bottom: 5px;
">Cake Image</h5>
      <div class="col-lg-1" style="padding:0px; margin-top: 3px;
">
          <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor"
               class="bi bi-person"
               viewBox="0 0 16 16">
              <path
                      d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
          </svg>
      </div>
      <div class="col-lg-11" style="padding:0px">
        <input  path="cakeImage" oninput="removeLoginPass()" id ="password" value=<%=Optional.of(addProducts.getCakeImage()).orElse("")%>  name ="eggImage" type="file"
                                                        style="font-size: medium; width: 100%;border: 0px;"
                                                        class="no-outline"
                                                        ></div>
      <div class="col-lg-12"  id="passLine"style="height: 1px;
background: gray;margin-top: 5px;;"></div>

<br><br>

<h5 style="margin-top: 20px;
padding: 0px;
margin-bottom: 5px;
">Available Quantity</h5>
      <div class="col-lg-1" style="padding:0px; margin-top: 3px;
">
          <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor"
               class="bi bi-person"
               viewBox="0 0 16 16">
              <path
                      d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
          </svg>
      </div>
      <div class="col-lg-11" style="padding:0px"><input  path="quantity" oninput="removeLoginPass()" value=<%=Optional.of(addProducts.getQuantity()).orElse(0)%> id ="password" name ="quantity" type="number" max="100"
                                                        style="font-size: medium; width: 100%;border: 0px;"
                                                        class="no-outline"
                                                        placeholder="Please enter quantity"></div>
      <div class="col-lg-12" id="passLine"style="height: 1px;
background: gray;"></div>
<br><br> 

<br>

<input type="checkbox"  path="eggLess" name="eggLess"  va value="Boat"  <%=Optional.of(addProducts.isEggLess()).orElse(false)%>>
<label for="vehicle3" style="font-size: 13px; padding-left: 5px;">   Egg less</label><br>

          <div> <h4 id="error-msg">${userData}</h4></div>
          <input type="hidden" id="custId" name="isEditProduct" value=<%= isEditProduct %> >
          <input type="hidden" id="custId" name="proID" value=<%= addProducts.getId() %> >

                <div class="col-lg-12 padding-empty" style="margin-top: 20px; ">
                    <div class="col-lg-6" style="margin: 0 auto;
                    float: none;">
                        <button type="submit" class="btn btn-primary" style="width: 100%;
    height: 35px;font-size: 15px;">Add Cake
                        </button>
                    </div>
                     

                </div>

            </div></form:form>


        </div>
    </div>
</div>


</body>

</html>