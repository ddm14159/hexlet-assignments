@import exercise.util.NamedRoutes;
@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
    content = @`
        <div class="mx-auto p-4 py-md-5">
            <main>
                  <h3>Все посты</h3>
                  <table class="table table-striped">
                                      @for(var post : page.getPosts())
                                          <a href="${NamedRoutes.post(post.getId())}">${post.getName()}</a><br>
                                      @endfor
                                  </table>

                  <a href="?page=${page.getPageNum() == 1 ? 1 : page.getPageNum() - 1}">Назад</a>
                  <a href="?page=${page.getPageNum() + 1}">Вперед</a>

            </main>
        </div>
    `
)