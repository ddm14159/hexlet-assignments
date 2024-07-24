@import gg.jte.Content

@param Content content
@param Content header = null
@param Content footer = null

<head>
</head>
<body>
    @if (header != null)
        <div class="header">
            ${header}
        </div>
    @endif

    <div class="content">
        ${content}
    </div>

    @if (footer != null)
        <div class="footer">
            ${footer}
        </div>
    @endif
</body>