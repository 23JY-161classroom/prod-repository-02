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
 * ChangeEmailRequest
 */

@JsonTypeName("changeEmail_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class ChangeEmailRequest {

  private String password;

  private String newEmail;

  public ChangeEmailRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChangeEmailRequest(String password, String newEmail) {
    this.password = password;
    this.newEmail = newEmail;
  }

  public ChangeEmailRequest password(String password) {
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

  public ChangeEmailRequest newEmail(String newEmail) {
    this.newEmail = newEmail;
    return this;
  }

  /**
   * 新しく設定するメールアドレス
   * @return newEmail
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "new_email", example = "taroden@example.com", description = "新しく設定するメールアドレス", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_email")
  public String getNewEmail() {
    return newEmail;
  }

  @JsonProperty("new_email")
  public void setNewEmail(String newEmail) {
    this.newEmail = newEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeEmailRequest changeEmailRequest = (ChangeEmailRequest) o;
    return Objects.equals(this.password, changeEmailRequest.password) &&
        Objects.equals(this.newEmail, changeEmailRequest.newEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, newEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeEmailRequest {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    newEmail: ").append(toIndentedString(newEmail)).append("\n");
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

