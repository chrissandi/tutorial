<%@taglib prefix="t" tagdir="/WEB-INF/tags/master" %>
<t:default title="List of user">
<jsp:body>
    <div class="row news-details">
        <div class="col-lg-12">
            <div class="row news-item">
                <h2>${news.title}</h2>
                <p class="text-muted">
                    Written by <strong>${news.author}</strong>, ${news.publishedDate}
                </p>
                <p>${news.content}</p>
            </div>
        </div>
    </div>
</jsp:body>
</t:default>