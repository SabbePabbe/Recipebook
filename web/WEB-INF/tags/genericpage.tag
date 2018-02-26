<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Recipebook</title>
        <link rel="stylesheet" href="/../../resources/CSS/header.css" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.0/semantic.min.css"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.0/semantic.min.js"></script>
    </head>
    <body>
    <div id="pageheader">
        <div class="ui inverted menu" style="margin-bottom: 0; border-radius: 0; justify-content: center">
            <a class="active item">
                Home
            </a>
            <a class="item">
                Messages
            </a>
            <a class="item">
                Friends
            </a>
        </div>
        <div class="ui segment" style="background-image: url('/../../resources/img/welcome_banner.jpg');margin: 0;border-radius: 0; background-repeat: no-repeat; background-size: cover; height: 50%">
            <Container text style>
                <div class="ui header">
                    This is a title
                </div>
                <div class="ui sub header">
                    This is a subtitle
                </div>
            </Container>
        </div>
    </div>
    <div id="body">
        <jsp:doBody/>
    </div>
    <div id="pagefooter">
        <jsp:invoke fragment="footer"/>
    </div>
    </body>
</html>