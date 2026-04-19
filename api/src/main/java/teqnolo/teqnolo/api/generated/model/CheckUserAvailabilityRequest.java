package teqnolo.teqnolo.api.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CheckUserAvailabilityRequest
 */

@JsonTypeName("checkUserAvailability_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class CheckUserAvailabilityRequest {

  private @Nullable String email;

  private @Nullable String username;

  /**
   * 有効性チェックを行うコンテキスト。updateの場合は自身のユーザーIDを検索対象から除外する
   */
  public enum ContextEnum {
    REGISTER("register"),
    
    UPDATE("update");

    private final String value;

    ContextEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContextEnum fromValue(String value) {
      for (ContextEnum b : ContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContextEnum context;

  public CheckUserAvailabilityRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CheckUserAvailabilityRequest(ContextEnum context) {
    this.context = context;
  }

  public CheckUserAvailabilityRequest email(@Nullable String email) {
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

  public CheckUserAvailabilityRequest username(@Nullable String username) {
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

  public CheckUserAvailabilityRequest context(ContextEnum context) {
    this.context = context;
    return this;
  }

  /**
   * 有効性チェックを行うコンテキスト。updateの場合は自身のユーザーIDを検索対象から除外する
   * @return context
   */
  @NotNull 
  @Schema(name = "context", description = "有効性チェックを行うコンテキスト。updateの場合は自身のユーザーIDを検索対象から除外する", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("context")
  public ContextEnum getContext() {
    return context;
  }

  @JsonProperty("context")
  public void setContext(ContextEnum context) {
    this.context = context;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckUserAvailabilityRequest checkUserAvailabilityRequest = (CheckUserAvailabilityRequest) o;
    return Objects.equals(this.email, checkUserAvailabilityRequest.email) &&
        Objects.equals(this.username, checkUserAvailabilityRequest.username) &&
        Objects.equals(this.context, checkUserAvailabilityRequest.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, username, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckUserAvailabilityRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

