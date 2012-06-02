<!DOCTYPE html>
<html>

<head>
	<% include '/WEB-INF/includes/meta.gtpl' %>
	<title>Not allowed -- Tucano Code Blog</title>
</head>

<body id="top">

<% include '/WEB-INF/includes/header.gtpl' %>
<% include '/WEB-INF/includes/navigation.gtpl' %>


<div id="layout_body">
	<div id="main_wrapper_outer">
		<div id="main_wrapper_inner">
			<div class="center_wrapper">
				<div class="left" id="main">
					<div id="main_content">

					<div class="post">
						<div class="post-title"><h1>Access not allowed</h1></div>
						<div class="post-body">
                            <p>You must be administrator to be able to administer this weblog.</p>
                            <p>Please <a href="${users.createLoginURL('/admin/posts')}">sign-in</a> back with an administrator account </p>
                        </div>
                    </div>
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
