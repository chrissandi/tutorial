<%@tag description="Default Page template" pageEncoding="UTF-8"%>
<%@attribute name="title" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>${title}</title>
        <link href="/css/bootstrap.min.css" rel="stylesheet">
        <link href="/css/main.css" rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <jsp:include page="/WEB-INF/jsp/common/navigation.jsp"/>
            <jsp:doBody/>
            <jsp:include page="/WEB-INF/jsp/common/footer.jsp"/>
        </div>
    </body>
</html>