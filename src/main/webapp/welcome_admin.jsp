<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
                <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


                <html>

                <head>
                        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                        <title>JSP</title>
                        <meta charset="utf-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1">


                        <link rel="stylesheet"
                                href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

                        <link rel="stylesheet"
                                href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">

                        <link href="../resources/static/css/style.css" type="text/css" rel="stylesheet">
  <link href="../css/style.css" type="text/css" rel="stylesheet">
                        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
                        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
                                rel="stylesheet"
                                integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
                                crossorigin="anonymous">
                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
                                integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
                                crossorigin="anonymous"></script>


                </head>

                <body>
                        <div class="col-lg-12">
                                <div class="row">
                                        <div class="col-lg-12 " style="height: 70px; ">


                                                <div class="col-lg-4 center-div "
                                                        style="height: 70px; justify-content: right; float: right; text-align: right;  ">

                                                        <a class="col-lg-4   footer-menu"
                                                                href="/order_list">Order List</a>
                                                        <a class="col-lg-4   footer-menu"
                                                                href="addproducts"> Add
                                                                Product</a>

                                                        <a class="col-lg-3  footer-menu" href="#">Logout</a>
                                                </div>
                                        </div>
                                </div>
                                <div class="row">
                                        <div class="col-lg-8 center-div">

                                                <div class="col-lg-12  padding-empty"
                                                        style="height: auto; padding: 20px 0 20px 0; border-radius: 5px; background-color: white; color: white; font-size: 15px;">


                                                        <div class="col-lg-12" style="    margin-top: 20px;">

                                                                <div class="col-lg-9" style="color: black;">Available
                                                                        Products
                                                                </div>
                                                                <div class="col-lg-3" style="height: 40px;">
                                                                        <div class="input-group">
                                                                                <input type="text" class="form-control"
                                                                                        placeholder="Search product">
                                                                                <div class="input-group-append">
                                                                                        <button class="btn btn-secondary"
                                                                                                style="height: 34px;"
                                                                                                stype="button">
                                                                                                <svg xmlns="http://www.w3.org/2000/svg"
                                                                                                        width="16"
                                                                                                        height="16"
                                                                                                        fill="currentColor"
                                                                                                        class="bi bi-search"
                                                                                                        viewBox="0 0 16 16">
                                                                                                        <path
                                                                                                                d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z" />
                                                                                                </svg>
                                                                                        </button>
                                                                                </div>

                                                                        </div>



                                                                </div>
                                                        </div>                                      
                                                                  <div class="col-lg-12" style="background-color: gray; height: 1px;"></div>
<div class="col-lg-12" id="grid-item" style="margin-top: 15px;">
        <div class="col-lg-4" id="grid-item-inner" style="height: 300px; background-color: aquamarine;">
                <img src="../resources/static/image/cake_1.jpg" width="90%" style="margin-top: 5px;" height="60%">
                <div class="col-lg-12">
                        <h5 style="color: blue;float: left;">Product Name</h5>
                </div>
                <div class="col-lg-12">
                        <h5 style="color: blue;float: left;">Product Code</h5>
                </div>
                <div class="col-lg-12">
                        <h5 style="color: blue;float: left;">Available Quantity</h5>
                </div>
                <div class="col-lg-12" style="justify-content: center;
                display: flex;">
                        <a class="col-lg-8  footer-menu"     href="addproducts"> <h5 style="color: blue;margin-top: 5px;">Edit product</h5>
                        </a>
                </div>
        </div>

</div>

</div>
</div>
                                </div>



                        </div>

                </body>

                </html>