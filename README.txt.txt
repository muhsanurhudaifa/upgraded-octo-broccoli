This app based on person management or more likely payroll system to manage salary or reward

By the time I can only made some simple get mapping API
Because of lacking knowledge of java type declaration and casting

API Docs

get all developer

curl --location 'http://127.0.0.1:8080/api/v1/management/developers/' \
--data ''

get developer by id
curl --location 'http://127.0.0.1:8080/api/v1/management/developers/1' \
--data ''

get reward summary (same as developer by name)

curl --location 'http://127.0.0.1:8080/api/v1/management/developers/reward/Alida Kalkofen' \
--data ''

Thank you