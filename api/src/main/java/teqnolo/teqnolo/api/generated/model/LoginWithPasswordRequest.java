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
 * LoginWithPasswordRequest
 */

@JsonTypeName("loginWithPassword_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class LoginWithPasswordRequest {

  private String username;

  private String password;

  public LoginWithPasswordRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoginWithPasswordRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public LoginWithPasswordRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * ログイン時に用いるユーザーの識別子。現状は仕様通りメールアドレスを用いるが、将来拡張される可能性がある。
   * @return username
   */
  @NotNull 
  @Schema(name = "username", example = "user01@example.com", description = "ログイン時に用いるユーザーの識別子。現状は仕様通りメールアドレスを用いるが、将来拡張される可能性がある。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }

  public LoginWithPasswordRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 再認証用のパスワード
   * @return password
   */
  @NotNull 
  @Schema(name = "password", example = "old", description = "再認証用のパスワード", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWithPasswordRequest loginWithPasswordRequest = (LoginWithPasswordRequest) o;
    return Objects.equals(this.username, loginWithPasswordRequest.username) &&
        Objects.equals(this.password, loginWithPasswordRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithPasswordRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

