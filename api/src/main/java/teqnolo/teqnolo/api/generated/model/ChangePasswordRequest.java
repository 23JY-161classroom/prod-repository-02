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
 * ChangePasswordRequest
 */

@JsonTypeName("changePassword_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class ChangePasswordRequest {

  private @Nullable String currentPassword;

  private @Nullable String newPassword;

  private @Nullable String newPasswordVerify;

  public ChangePasswordRequest currentPassword(@Nullable String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  /**
   * 現在のパスワード
   * @return currentPassword
   */
  
  @Schema(name = "current_password", example = "old", description = "現在のパスワード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_password")
  public @Nullable String getCurrentPassword() {
    return currentPassword;
  }

  @JsonProperty("current_password")
  public void setCurrentPassword(@Nullable String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public ChangePasswordRequest newPassword(@Nullable String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * 新しく設定するパスワード（確認用）
   * @return newPassword
   */
  @Pattern(regexp = "^[!-~]+$") @Size(min = 8, max = 100) 
  @Schema(name = "new_password", example = "p@ss0rd123!v", description = "新しく設定するパスワード（確認用）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_password")
  public @Nullable String getNewPassword() {
    return newPassword;
  }

  @JsonProperty("new_password")
  public void setNewPassword(@Nullable String newPassword) {
    this.newPassword = newPassword;
  }

  public ChangePasswordRequest newPasswordVerify(@Nullable String newPasswordVerify) {
    this.newPasswordVerify = newPasswordVerify;
    return this;
  }

  /**
   * 新しく設定するパスワード（確認用）
   * @return newPasswordVerify
   */
  @Pattern(regexp = "^[!-~]+$") @Size(min = 8, max = 100) 
  @Schema(name = "new_password_verify", example = "p@ss0rd123!v", description = "新しく設定するパスワード（確認用）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_password_verify")
  public @Nullable String getNewPasswordVerify() {
    return newPasswordVerify;
  }

  @JsonProperty("new_password_verify")
  public void setNewPasswordVerify(@Nullable String newPasswordVerify) {
    this.newPasswordVerify = newPasswordVerify;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) o;
    return Objects.equals(this.currentPassword, changePasswordRequest.currentPassword) &&
        Objects.equals(this.newPassword, changePasswordRequest.newPassword) &&
        Objects.equals(this.newPasswordVerify, changePasswordRequest.newPasswordVerify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword, newPasswordVerify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordRequest {\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    newPasswordVerify: ").append(toIndentedString(newPasswordVerify)).append("\n");
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

