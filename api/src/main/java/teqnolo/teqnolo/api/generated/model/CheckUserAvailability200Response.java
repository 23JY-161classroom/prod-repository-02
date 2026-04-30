package teqnolo.teqnolo.api.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import teqnolo.teqnolo.api.generated.model.CheckUserAvailability200ResponseEmail;
import teqnolo.teqnolo.api.generated.model.CheckUserAvailability200ResponseUsername;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CheckUserAvailability200Response
 */

@JsonTypeName("checkUserAvailability_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class CheckUserAvailability200Response {

  private @Nullable CheckUserAvailability200ResponseUsername username;

  private @Nullable CheckUserAvailability200ResponseEmail email;

  public CheckUserAvailability200Response username(@Nullable CheckUserAvailability200ResponseUsername username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @Valid 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable CheckUserAvailability200ResponseUsername getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(@Nullable CheckUserAvailability200ResponseUsername username) {
    this.username = username;
  }

  public CheckUserAvailability200Response email(@Nullable CheckUserAvailability200ResponseEmail email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @Valid 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable CheckUserAvailability200ResponseEmail getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(@Nullable CheckUserAvailability200ResponseEmail email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckUserAvailability200Response checkUserAvailability200Response = (CheckUserAvailability200Response) o;
    return Objects.equals(this.username, checkUserAvailability200Response.username) &&
        Objects.equals(this.email, checkUserAvailability200Response.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckUserAvailability200Response {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

