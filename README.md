Repo for bug reported here: https://github.com/micronaut-projects/micronaut-core/issues/10383

Issue:
When the `@Introspected` annotation is added to a model that is used as part of a `@JsonView`, the object is not view is not being honored and all fields are being returned on the object.

Example:

If you run the micronaut application as is, and make the following POST request:
```
curl --location 'http://localhost:8080/hello/users' \
--header 'Content-Type: application/json' \
--data '{
    "loginName": "joeS",
    "firstName": "joe",
    "lastName": "Smith",
    "mobileNo": "4749090001",
    "id": "4",
    "secretId": "10"
}'
```
The API will respond with:
```
{
    "loginName": "joeS",
    "firstName": "joe",
    "lastName": "Smith",
    "mobileNo": "4749090001",
    "id": "4"
}
```

Based on the `@JsonView` that is defined on the request body in the `HelloController.createUser` method, the `id` field should be ignored. However, the value is being populated.

In the `application.properties` file, if you set `jackson.bean-introspection-module` to `false`, or if you remove the `@Introspected` annotation from the `User.java` class, and re-run the application and submit the same POST request, the `id` field will be ignored and you will get the following API response:

```
{
    "loginName": "joeS",
    "firstName": "joe",
    "lastName": "Smith",
    "mobileNo": "4749090001",
    "id": "1"
}
```
---

## Micronaut 4.2.3 Documentation

- [User Guide](https://docs.micronaut.io/4.2.3/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.2.3/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.2.3/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Micronaut Maven Plugin documentation](https://micronaut-projects.github.io/micronaut-maven-plugin/latest/)
## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)


## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)


## Feature spotless documentation

- [https://github.com/diffplug/spotless](https://github.com/diffplug/spotless)


https://github.com/micronaut-projects/micronaut-core/discussions
