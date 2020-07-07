<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <title>GenerateID</title>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css">

    </head>
    <body>
        <h1 class="text-dark text-center font-weight-bold" style="font-size: 60px;">
            Update Here!
        </h1>
            <div class="container">
               <div class="row ">
                    <div class="col-5">
  						 <form action="/updateUser" onsubmit="return validation()" class="form-group bg-mute " method="post" enctype="multipart/form-data">
                           <div class="form-group">
                               <label class="font-weight-bold"> ID: </label>
                               <input type="text" name="id" class="form-control" value="${user.id}" readonly/>
                           </div>
                           <div class="form-group">
                               <label class="font-weight-bold"> Email: </label>
                               <input type="text" name="email" class="form-control" id="emails" value="${user.email}" readonly/>
                           </div> 
                           <div class="form-group">
                               <label for="user" class="font-weight-bold"> Name: </label>
                               <input type="text" name="name" class="form-control" id="user" value="${user.name}" autocomplete="off"/>
                               <span id="username" class="text-danger font-weight-bold"> </span>
                           </div>
                           <div class="form-group">
                               <label class="font-weight-bold"> Department: </label>
                               <input type="text" name="department" class="form-control" id="department" value="${user.department}" autocomplete="off"/>
                               <span id="depart" class="text-danger font-weight-bold"> </span>
                           </div>
                           <div class="form-group">
                               <label class="font-weight-bold"> Mobile Number: </label>
                               <input type="text" name="phoneNo" class="form-control" id="mobileNumber" value="${user.phoneNo}" autocomplete="off"/>
                               <span id="mobileno" class="text-danger font-weight-bold"> </span>
                           </div>
                           
                           <div class="form-group">
                                <input type="hidden" id= "filename" name="filename"/>
                               <label class="font-weight-bold"> Image: </label>
                               <input class="btn" type="file" id="img" name="image" accept="image/*" onchange="checkFileExtension()"/>
                               <br><span id="imageId" class="text-danger font-weight-bold">MAX SIZE: 2MB</span>

                           </div>
                           <input type="submit" name="submit" value="GenerateID" class="btn btn-info"/>
                       </form>
                   </div>
                </div>
            </div>

                <script type="text/javascript" src="js/updaterScript.js"></script>
                    <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
                <script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    </body>
</html>
