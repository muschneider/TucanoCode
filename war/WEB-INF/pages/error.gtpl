<!DOCTYPE html>
<html>

<head>
	<% include '/WEB-INF/includes/meta.gtpl' %>
	<title>An error occured -- Tucano Code Blog</title>
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

						<div class="post-title"><h1>An error occured</h1></div>

						<div class="post-body">
                        <% if (request.getAttribute('code')) { %>
                            <dt><strong>Error code:</strong></dt>
                            <dd>${request.getAttribute('code')}</dd>
                        <% } else if (request.getAttribute('ex')) { %>
                            <dt><strong>Exception:</strong></dt>
                            <dd>${request.getAttribute('ex')}</dd>
                        <% } %>
                            <dt><strong>Message:</strong></dt>
                            <dd>${request.getAttribute('msg')}</dd>
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
