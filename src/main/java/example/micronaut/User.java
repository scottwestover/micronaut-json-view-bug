package example.micronaut;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.Valid;
import lombok.ToString;
import io.micronaut.core.annotation.Introspected;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@ToString
@JsonView
@Valid
@Introspected
public class User {
    @JsonView(value = {Views.CreateView.class, Views.ResponseView.class })
    private String loginName;

    @JsonView(value = {Views.CreateView.class, Views.ResponseView.class })
    private String firstName;

    @JsonView(value = {Views.CreateView.class, Views.ResponseView.class })
    private String lastName;

    @JsonView(value = {Views.PatchView.class, Views.ResponseView.class })
    private String mobileNo;

    @JsonView(value = {Views.ResponseView.class })
    private String id;

    @JsonView(value = {Views.InternalView.class })
    private String secretId;
}
