@import exercise.dto.users.UsersPage
@param UsersPage page


@template.layout.page(
    content = @`
        <form action="/users" method="get">
        <input type="search" name="term" value="${page.getTerm()}" />
        <input type="submit" value="Search" />
        </form>

        <h3>Пользователи</h3>
                    @for(var user : page.getUsers())
                                   <div>
                                       <h4>${user.getFirstName()} ${user.getLastName()}</h4>
                                   </div>
                    @endfor
    `
)