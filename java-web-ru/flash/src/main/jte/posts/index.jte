@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
    page = page,
    content = @`

        @for(var post : page.getPosts())
               <div>
                   <h2><a href="/posts/${post.getId()}">${post.getName()}</a></h2>
                   <p>${post.getBody()}</p>
               </div>
        @endfor
    `,
)
