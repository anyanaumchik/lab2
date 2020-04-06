<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Temperature</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/mainstyle.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/" method="post">
    <div class="container">
        <div class="form-group">
            <label for="tNumber">TicketNumber:</label><br/>
            <input type="text" id="tNumber" name="tNumber"><br/>

            <button type="submit" class="btn btn-default">Submit</button>
            <br/>
            Result: ${result}
            <br/>
            Win: ${resultWin}
            <br/>
            Chance: ${resultChance}
        </div>
    </div>
</form>

</body>
</html>