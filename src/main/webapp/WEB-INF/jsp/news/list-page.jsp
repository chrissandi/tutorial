<%@taglib prefix="t" tagdir="/WEB-INF/tags/master" %>
<%@taglib prefix ="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix ="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<t:default title="List of user">
<jsp:body>
    <div class="row news-list">
        <c:if test="${newsNotFound}">
            <div class="alert alert-info" role="alert">
                <p>No news found</p>
            </div>
        </c:if>

        <c:if test="${param.newsCreated != null}">
            <div class="alert alert-success" role="alert">
                <p>Add news success</p>
            </div>
        </c:if>

        <div class="col-lg-12">
             <c:forEach items="${newsList}" var="news">
                <div class="row news-item">
                    <h3><a href="/news/${news.id}">${news.title}</a></h3>
                    <p>${fn:substring(news.content, 0, 120)}...</p>
                    <p class="text-muted small">
                        <strong>${news.author}</strong>, ${news.publishedDate}
                    </p>
                </div>
            </c:forEach>
        </div>
    </div>
</jsp:body>
</t:default>