package teqnolo.teqnolo.api.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FindSelf200Response
 */

@JsonTypeName("findSelf_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class FindSelf200Response {

  private @Nullable String username;

  private @Nullable String email;

  public FindSelf200Response username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * ユーザー名（Twitterの@XXXのXXXに相当する部分）
   * @return username
   */
  @Pattern(regexp = "^[a-zA-Z0-9]+$") @Size(min = 4, max = 30) 
  @Schema(name = "username", example = "taroden", description = "ユーザー名（Twitterの@XXXのXXXに相当する部分）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public FindSelf200Response email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * ログインや通知に用いるユーザーのメールアドレス
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "taroden@example.com", description = "ログインや通知に用いるユーザーのメールアドレス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(@Nullable String email) {
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
    FindSelf200Response findSelf200Response = (FindSelf200Response) o;
    return Objects.equals(this.username, findSelf200Response.username) &&
        Objects.equals(this.email, findSelf200Response.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindSelf200Response {\n");
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

