<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/admin/components/head.jsp"/>

<body>
<div class="wrapper">
    <jsp:include page="/admin/components/sidebar.jsp"/>
    <div class="main">
        <jsp:include page="/admin/components/navbar.jsp"/>
        <main class="content">
            <div class="container-fluid p-0">
                <div class="row">
                    <div class="col-6">
                        <div class="card">
                            <div class="card-header">
                                <h5 class="card-title mb-0">Input</h5>
                            </div>
                            <div class="card-body">
                                <form action="/admin/category/create" method="post">
                                    <input type="text" name="name" class="form-control mb-3" placeholder="Input">
                                    <label class="form-check mb-3">
                                        <input class="form-check-input" type="checkbox"  name="status"
                                               checked>
                                        <span class="form-check-label">
                                        Active
                                    </span>
                                    </label>
                                    <button type="submit" class="btn btn-primary">Submit</button>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </main>
        <jsp:include page="/admin/components/footer.jsp"/>
    </div>
</div>
<jsp:include page="/admin/components/scripts.jsp"/>
</body>
</html>