<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <div class="container" style="margin-top: 30px">
        <form method="post" action="save">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" required id="name" name="name" aria-describedby="emailHelp" placeholder="Name">
            </div>
            <div class="form-group">
                <label for="wage">Wage</label>
                <input type="text" class="form-control" required id="wage" name="wage" placeholder="Wage">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>
