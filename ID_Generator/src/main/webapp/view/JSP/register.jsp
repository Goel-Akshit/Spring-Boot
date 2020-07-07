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
            Generate Id Card
        </h1>
            <div class="container">
               <div class="row ">
                    <div class="col-5">
                        <form:form action="/ID" onsubmit="return validation()" class="form-group bg-mute " method="post" enctype="multipart/form-data" modelAttribute="formModel">
                           <div class="form-group">
                               <form:label path="name" for="user" class="font-weight-bold"> Name: </form:label>
                               <form:input path="name" type="text" name="user" class="form-control" id="user" autocomplete="off"/>
                               <span id="username" class="text-danger font-weight-bold"> </span>
                           </div>
                           <div class="form-group">
                               <form:label path="department" class="font-weight-bold"> Department: </form:label>
                               <form:input path="department" type="text" name="department" class="form-control" id="department" autocomplete="off"/>
                               <span id="depart" class="text-danger font-weight-bold"> </span>
                           </div>
                           <div class="form-group">
                               <form:label path="phoneNo" class="font-weight-bold"> Mobile Number: </form:label>
                               <form:input path="phoneNo" type="text" name="mobile" class="form-control" id="mobileNumber" autocomplete="off"/>
                               <span id="mobileno" class="text-danger font-weight-bold"> </span>
                           </div>
                           <div class="form-group">
                               <form:label path="email" class="font-weight-bold"> Email: </form:label>
                               <form:input path="email" type="text" name="email" class="form-control" id="emails" autocomplete="on"/>
                               <span id="emailids" class="text-danger font-weight-bold"> </span>
                           </div>
                           <div class="form-group">
                                <form:input path="fileName" type="hidden" id= "filename" name="filename"/>
                               <form:label path="image" class="font-weight-bold"> Image: </form:label>
                               <form:input path="image" class="btn" type="file" id="img" name="img" accept="image/*" onchange="checkFileExtension()"/>
                               <br><span id="imageId" class="text-danger font-weight-bold">MAX SIZE: 2MB</span>
                              
                           </div>
                           <input type="submit" name="submit" value="GenerateID" class="btn btn-primary"/>
                       </form:form>
                    </div>
                </div>
            </div>

                <script type="text/javascript" src="js/script.js"></script>
                    <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
                <script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    </body>
</html>
