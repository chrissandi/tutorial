<%@taglib prefix="t" tagdir="/WEB-INF/tags/master" %>
<%@taglib prefix ="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<t:default title="List of user">
<jsp:body>
    <div class="row news-add">
        <c:if test="${newsCreated eq false}">
            <div class="alert alert-danger" role="alert">
                <p>Error add news</p>
            </div>
        </c:if>

        <div class="col-lg-12">
            <div class="row">
                <h3>Add News Form</h3>
                <form:form method="post" modelAttribute="newsForm" action="/news/add">
                    <div class="form-group">
                        <label for="title">Title</label>
                        <form:input type="text" class="form-control" id="title" path="title"/>
                    </div>
                    <div class="form-group">
                        <label for="content">Content</label>
                        <form:textarea class="form-control" rows="5" id="content" path="content"/>
                    </div>
                    <div class="form-group">
                        <label for="author">Author</label>
                        <form:input type="text" class="form-control" id="author" path="author"/>
                    </div>
                    <div class="form-group">
                        <label for="publishedDate">Published Date</label>
                        <form:input type="date" class="form-control" id="publishedDate" path="publishedDate"/>
                    </div>
                  <form:button type="submit" class="btn btn-primary">Submit</form:button>
                </form:form>
            </div>
         </div>
    </div>
</jsp:body>
</t:default>