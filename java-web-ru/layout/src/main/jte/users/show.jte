@import exercise.dto.users.UserPage;
@param UserPage page

@template.layout.page(
content = @`
    <div>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</div>
    <div>${page.getUser().getEmail()}</div>
`,
footer = @`
        <p>Thanks for visiting, come again soon!</p>
    `,
header = @`
            <a href="/">main</a>
            <a href="/users">users</a>
        `
)