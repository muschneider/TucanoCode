<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr">

<head>
	<title>Tucano Code</title>
    <% include '/WEB-INF/includes/syntaxHighlighting.gtpl' %>
    <% include '/WEB-INF/includes/meta.gtpl' %>
    <meta name="robots" content="noindex,follow" />
</head>

<body id="top">

<% include '/WEB-INF/includes/header.gtpl' %>
<% include '/WEB-INF/includes/navigation.gtpl' %>


<div id="main_wrapper_outer">
	<div id="main_wrapper_inner">
		<div class="center_wrapper">

			<div class="left" id="main">
				<div id="main_content">

                    <% if (!request.posts) { %>
                        <h1>No more posts</h1>
                    <% } %>
                    <% request.posts.each { post -> %>
					
					<div class="post">
						<div class="post-title"><h1><a href="/article/${post.key.name}">${post.title}</a></h1></div>
						<div class="post-date">
                            <% if (user && users.isUserLoggedIn() && users.isUserAdmin()) { %>
                            <form action="/admin/posts/edit/${post.key.name}" method="post">
                                <input type="image" src="/images/pencil.png" alt="Edit" align="right">
                            </form>
                            <% } %>
                            Posted on ${post.created.format('dd MMMM, yyyy')} (${post.created.pretty()})
                        </div>

						<div class="post-body">
                            ${post.content}
						</div>

                        <% if (post.categories) { %>
                        <div class="post-meta" style="margin-top:5px;">
							In categories:
                            <% post.categories.each { category -> %>
                                <a href="/category/${category}">${category}</a>
                            <% } %>
                        </div>
                        <% } %>
                    </div>
                <% } %>

                    <div class="post-meta archive-pagination">

                    <%
                        int page = request.page
                        if (request.posts && request.posts.size() == 5) {
                    %>
                        <div class="left"><a href="/p${page+1}">&#171; Previous page</a></div>
                    <%
                        }
                        if (page) {
                            
                    %>
                        <div class="right"><a href="${(page-1) ? ('/p' + (page-1)) : '/'}">Next page &#187;</a></div>
                    <%
                        }
                    %>
                        <div class="clearer">&nbsp;</div>

                    </div>

				</div>
			</div>

            <% include '/WEB-INF/includes/left.gtpl' %>
		</div>

	</div>
</div>

<% include '/WEB-INF/includes/footer.gtpl' %>
<% include '/WEB-INF/includes/bottom.gtpl' %>

</body>
</html>
