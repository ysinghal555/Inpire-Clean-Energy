<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center" style="margin-top: 100px">
            <form action="EditServlet" method="post" enctype="multipart/form-data">
                Add File : 
                <input name="excelfile" type="file" >
                <input type="submit" value="Add File">
            </form>
        </div>
    </body>
</html>
