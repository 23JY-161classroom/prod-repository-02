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
 * RegisterUserRequest
 */

@JsonTypeName("registerUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class RegisterUserRequest {

  private String email;

  private String username;

  private String password;

  private String passwordVerify;

  public RegisterUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegisterUserRequest(String email, String username, String password, String passwordVerify) {
    this.email = email;
    this.username = username;
    this.password = password;
    this.passwordVerify = passwordVerify;
  }

  public RegisterUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * 新しく設定するメールアドレス
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "taroden@example.com", description = "新しく設定するメールアドレス", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  public RegisterUserRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * ユーザー名（Twitterの@XXXのXXXに相当する部分）
   * @return username
   */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9]+$") @Size(min = 4, max = 30) 
  @Schema(name = "username", example = "taroden", description = "ユーザー名（Twitterの@XXXのXXXに相当する部分）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }

  public RegisterUserRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 新しく設定するパスワード（確認用）
   * @return password
   */
  @NotNull @Pattern(regexp = "^[!-~]+$") @Size(min = 8, max = 100) 
  @Schema(name = "password", example = "p@ss0rd123!v", description = "新しく設定するパスワード（確認用）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  public RegisterUserRequest passwordVerify(String passwordVerify) {
    this.passwordVerify = passwordVerify;
    return this;
  }

  /**
   * 確認用のパスワード。基本はクライアントサイドでチェックするが、サーバーサイドでもチェックする。
   * @return passwordVerify
   */
  @NotNull @Pattern(regexp = "^[!-~]+$") @Size(min = 8, max = 100) 
  @Schema(name = "password_verify", example = "p@ss0rd123!v", description = "確認用のパスワード。基本はクライアントサイドでチェックするが、サーバーサイドでもチェックする。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password_verify")
  public String getPasswordVerify() {
    return passwordVerify;
  }

  @JsonProperty("password_verify")
  public void setPasswordVerify(String passwordVerify) {
    this.passwordVerify = passwordVerify;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterUserRequest registerUserRequest = (RegisterUserRequest) o;
    return Objects.equals(this.email, registerUserRequest.email) &&
        Objects.equals(this.username, registerUserRequest.username) &&
        Objects.equals(this.password, registerUserRequest.password) &&
        Objects.equals(this.passwordVerify, registerUserRequest.passwordVerify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, username, password, passwordVerify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterUserRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordVerify: ").append(toIndentedString(passwordVerify)).append("\n");
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

