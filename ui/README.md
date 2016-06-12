# zf-framework
base spring boot and angular. frontend mvc and backend mvc framework...
# how to run
optional import to idea, `gradle idea`

run: `gradle build & gradle bootRun`

# oauth test
use curl:

get token:

`curl localhost:8090/oauth/token -d "grant_type=password&scope=read write&username=xxx1&password=111x" -H "Authorization:Basic c2FtcGxlQ2xpZW50SWQ6Y2xpZW50U2VjcmV0S2V5"`
> param:
grant_type, scope, username, password

`Authorization:Basic c2FtcGxlQ2xpZW50SWQ6Y2xpZW50U2VjcmV0S2V5` is SHA1 of `client_id` and `client_secret`
you can get token like this:
>`{"access_token":"ef66bdda-d674-4a13-b491-9a20e075823c","token_type":"bearer","refresh_token":"c4ada304-a654-4189-838f-1d49f61245a5","expires_in":42422,"scope":"read write"}`

and second you can get resource from secured API like:
> `curl localhost:8090/api/user/name -H "Authorization:bearer ef66bdda-d674-4a13-b491-9a20e075823c"`

# use SpringLoaded in idea
1. auto make or make project
2. gradle bootRun...
