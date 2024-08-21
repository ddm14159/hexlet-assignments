@import exercise.dto.MainPage
@import exercise.util.NamedRoutes
@param MainPage page

@template.layout.page(
    content = @`
        @if(page.getName() != null)
            <div class="mb-3">
                ${String.valueOf(page.getName().toString())}
                <a href="${NamedRoutes.logoutPath()}">Выйти</a>
            </div>
        @endif

        @if(page.getName() == null)
            <div class="mb-3">
                <a href="${NamedRoutes.buildSessionPath()}">Войти</a>
            </div>
        @endif
    `
)
