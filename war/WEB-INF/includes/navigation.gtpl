<div id="navigation">
	<div class="center_wrapper">
	
		<ul>
            <%
                def homeStyle = ''
                def categoriesStyle = ''
                def postsStyle = ''
                def mediaStyle = ''
                def archivesStyle = ''
                def searchStyle = ''
                def socialStyle = ''

                def originalURI = request.getAttribute('originalURI')
                if (originalURI.contains('posts')) {
                    postsStyle = 'current_page_item'
                } else if (originalURI.contains('categories')) {
                    categoriesStyle = 'current_page_item'
                } else if (originalURI.contains('media')) {
                    mediaStyle = 'current_page_item'
                } else if (originalURI.contains('social')) {
                    socialStyle = 'current_page_item'
                } else if (originalURI.contains('search')) {
                    searchStyle = 'current_page_item'
                } else if (originalURI.contains('archives') || originalURI.contains('category')) {
                    archivesStyle = 'current_page_item'
                } else {
                    homeStyle = 'current_page_item'
                }

            %>
            <li class="${homeStyle}"><a href="/">Home</a></li>
            <li class="${archivesStyle}"><a href="/archives">Archives</a></li>
            <% if (1 == 2) { %>
            <li class="${socialStyle}"><a href="/social">Social</a></li>
            <li class="${searchStyle}"><a href="/search">Search</a></li>
            <% } %>
            <% if (user && users.isUserLoggedIn() && users.isUserAdmin() && originalURI.contains('admin')) { %>
                <li><span style="color: white; font-size: 2.2em; position: relative; top: 4px; margin-left: 10px; margin-right: 10px;">|</span></li>
                <li class="${postsStyle}"><a href="/admin/posts">Posts</a></li>
                <li class="${categoriesStyle}"><a href="/admin/categories">Categories</a></li>
                <li class="${mediaStyle}"><a href="/admin/media">Media</a></li>
            <% } %>
		</ul>

		<div class="clearer">&nbsp;</div>

	</div>
</div>
