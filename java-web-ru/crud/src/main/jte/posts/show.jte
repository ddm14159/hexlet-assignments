@import exercise.util.NamedRoutes
@import exercise.dto.posts.PostPage
@param PostPage page

@template.layout.page(
    content = @`
        <div class="mx-auto p-4 py-md-5">
            <a href="${NamedRoutes.posts()}">Все посты</a>
            <main>
                  <h3>${page.getPost().getName()}</h3>
                  <h4>${page.getPost().getBody()}</h4>
            </main>
        </div>
    `
)