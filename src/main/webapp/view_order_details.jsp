<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html;
                    charset=ISO-8859-1">
            <title>JSP</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width,
                    initial-scale=1">


            <link href="../css/style.css" type="text/css" rel="stylesheet">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
            <script src="../js/script.js"></script>

            <link href="../resources/static/css/style.css" type="text/css" rel="stylesheet">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
                crossorigin="anonymous">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
                crossorigin="anonymous"></script>


        </head>

        <body>

            <div class="col-lg-12">
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-lg-12 " style="height: 70px; ">


                            <div class="col-lg-4 center-div " style="height: 70px; justify-content: right;
                                    float: right; text-align: right; ">

                                <a class="col-lg-4   footer-menu"
                                                                                              href="/order_list">Order List</a>
                                                                                      <a class="col-lg-4   footer-menu"
                                                                                              href="addproducts"> Add
                                                                                              Product</a>

                                <a class="col-lg-3 footer-menu" href="#">Logout</a>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-11  
                            logincontainer" style="float: none;
                            margin: 0 auto; margin-top: 50px;margin-bottom:
                            20px;">

                            <div class="col-lg-12" style="text-align: center; font-size: 19px;">Order Info</div>
                            <div class="col-lg-12"
                                style="text-align: center;background: gainsboro; font-size: 19px;border: 1px; margin-top: 10px;">
                                <h4 style="text-align: left; font-weight:bold; font-size: 20px;">Customer Details
                                    </h4>
                                </h4>
                                <h4 style="text-align: left;">Name:Thavaselvan</Details>
                                </h4>
                                <h4 style="text-align: left;">Email: thavam@gmail.com</Details>
                                </h4>
                                <h4 style="text-align: left;">Phone: 9629044299</Details>
                                </h4>
                                <h4 style="text-align: left;">Address :Chennai</Details>
                                </h4>
                                <h4 style="text-align: left; font-weight:bold; font-size: 20px;">Order Summary
                                </h4>
                                <h4 style="text-align: left;">Order Id : cs001</Details>
                                </h4>
                                <h4 style="text-align: left;">Tranaction Id : 100010001134</Details>
                                </h4>
                               <h4 style="text-align: left;">Total Amount : 100 INR </Details>
                                </h4> 
                                
                            </div>
                            <div class="col-lg-12 " style="padding: 0px;">
                                <table style="width:100%;text-align: center; margin-top: 10px; ">
                                    <tr>
                                        <th style="width: 20%;border: 1px solid black;">Code</th>
                                        <th style="width: 20%; border: 1px solid black;">Name</th>
                                        <th style="width: 20%; border: 1px solid black;">Quantity</th>
                                        <th style="width: 20%; border: 1px solid black;">Price</th>
                                        <th style="width: 20%; border: 1px solid black;">Amount</th>
                                    </tr>
                                    <tr>
                                        <td>Emil</td>
                                        <td>Tobias</td>
                                        <td>Linus</td>
                                        <td>Tobias</td>
                                        <td>Linus</td>
                                    </tr>

                                </table>
                            </div>
                        </div>
                    </div>
                </div>


        </body>

        </html>