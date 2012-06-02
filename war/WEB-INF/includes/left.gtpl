<div class="right" id="sidebar">
    <div id="sidebar_content">
        <%
        def originalURI = request.getAttribute('originalURI')
        if (user && users.isUserLoggedIn() && users.isUserAdmin() && (originalURI.contains('admin') || originalURI.contains('live'))) {
        %>
        <div class="box">
            <div class="box-title">Administration</div>
            <div class="box-content">
                <ul class="nice-list">
                    <li><a href="/admin/posts/create">Create new content <img src="/images/add.png" alt="New content" align="right"></a></li>
                    <li><a href="/admin/posts">Drafts, Posts, and pages</a></li>
                    <li><a href="/admin/categories">Categories</a></li>
                    <li><a href="/admin/media">Media</a></li>
                    <li><a href="/admin/clearCache">Clear cached content</a></li>
                    <li><a href="${users.createLogoutURL("/")}">Logout</a></li>
                </ul>
            </div>
        </div>
        <% } %>


        <div class="box">
            <div class="box_title">Categories</div>
            <div class="box_content">
                <ul>
                <% datastore.execute{ from categories sort asc by name }.each { category -> %>
                    <li>
                        <a href="/category/${category.name}" alt="${category.description}">${category.name}</a>
                    </li>
                <% } %>
                </ul>
            </div>
        </div>

        <div class="box">
            <div class="box_title">Resources</div>
            <div class="box_content">
                <ul>
                    <li><a href="http://groovy.codehaus.org">Groovy</a></li>
                    <li><a href="http://www.grails.org/">Grails</a></li>
                    <li><a href="http://www.scala-lang.org/">Scala</a></li>
                    <li><a href="http://akka.io">Akka</a></li>
                    <li><a href="http://gaelyk.appspot.com">Gaelyk</a> lightweight toolkit for GAE</li>
                    <li><a href="http://www.gradle.org">Gradle</a> project automation</li>
                </ul>
            </div>
        </div>


        <div class="box">
            <div class="box_title">About</div>
            <div class="box_content">
                Mauro Schneider and Alan Vidotti Prando.
            </div>
        </div>
 
   </div>
</div>


<div class="clearer">&nbsp;</div>
