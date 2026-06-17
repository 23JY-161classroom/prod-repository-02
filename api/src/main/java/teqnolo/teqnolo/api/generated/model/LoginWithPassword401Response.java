package teqnolo.teqnolo.api.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import teqnolo.teqnolo.api.generated.model.LoginWithPassword401ResponseErrorsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LoginWithPassword401Response
 */

@JsonTypeName("loginWithPassword_401_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class LoginWithPassword401Response {

  private @Nullable URI type;

  private @Nullable Integer status;

  private @Nullable String title;

  private String detail;

  private @Nullable String instance;

  private @Nullable String code;

  @Valid
  private List<@Valid LoginWithPassword401ResponseErrorsInner> errors = new ArrayList<>();

  public LoginWithPassword401Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoginWithPassword401Response(String detail) {
    this.detail = detail;
  }

  public LoginWithPassword401Response type(@Nullable URI type) {
    this.type = type;
    return this;
  }

  /**
   * 問題の種別を識別する URI 参照。
   * @return type
   */
  @Valid @Size(max = 1024) 
  @Schema(name = "type", description = "問題の種別を識別する URI 参照。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable URI getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable URI type) {
    this.type = type;
  }

  public LoginWithPassword401Response status(@Nullable Integer status) {
    this.status = status;
    return this;
  }

  /**
   * この問題の発生時にオリジンサーバーが生成した HTTP ステータスコード。
   * minimum: 100
   * maximum: 599
   * @return status
   */
  @Min(value = 100) @Max(value = 599) 
  @Schema(name = "status", description = "この問題の発生時にオリジンサーバーが生成した HTTP ステータスコード。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable Integer getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable Integer status) {
    this.status = status;
  }

  public LoginWithPassword401Response title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * 問題の種別を簡潔に表した人間可読な要約。 ローカライズを除き、同一の問題種別では内容が変わるべきではありません。 
   * @return title
   */
  @Size(max = 1024) 
  @Schema(name = "title", description = "問題の種別を簡潔に表した人間可読な要約。 ローカライズを除き、同一の問題種別では内容が変わるべきではありません。 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public LoginWithPassword401Response detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * この問題の発生状況に固有の、人間可読な詳細説明。
   * @return detail
   */
  @NotNull @Size(max = 4096) 
  @Schema(name = "detail", description = "この問題の発生状況に固有の、人間可読な詳細説明。", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  @JsonProperty("detail")
  public void setDetail(String detail) {
    this.detail = detail;
  }

  public LoginWithPassword401Response instance(@Nullable String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * 問題の具体的な発生事例を識別する URI 参照。 参照先が追加情報を返す場合も、返さない場合もあります。 
   * @return instance
   */
  @Size(max = 1024) 
  @Schema(name = "instance", description = "問題の具体的な発生事例を識別する URI 参照。 参照先が追加情報を返す場合も、返さない場合もあります。 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public @Nullable String getInstance() {
    return instance;
  }

  @JsonProperty("instance")
  public void setInstance(@Nullable String instance) {
    this.instance = instance;
  }

  public LoginWithPassword401Response code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * プロバイダー独自のエラー分類やレジストリに基づく API 固有のエラーコード。
   * @return code
   */
  @Size(max = 50) 
  @Schema(name = "code", description = "プロバイダー独自のエラー分類やレジストリに基づく API 固有のエラーコード。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public LoginWithPassword401Response errors(List<@Valid LoginWithPassword401ResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public LoginWithPassword401Response addErrorsItem(LoginWithPassword401ResponseErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Problem Details レスポンスに付随する詳細エラー情報の配列。
   * @return errors
   */
  @Valid @Size(max = 1000) 
  @Schema(name = "errors", description = "Problem Details レスポンスに付随する詳細エラー情報の配列。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid LoginWithPassword401ResponseErrorsInner> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid LoginWithPassword401ResponseErrorsInner> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWithPassword401Response loginWithPassword401Response = (LoginWithPassword401Response) o;
    return Objects.equals(this.type, loginWithPassword401Response.type) &&
        Objects.equals(this.status, loginWithPassword401Response.status) &&
        Objects.equals(this.title, loginWithPassword401Response.title) &&
        Objects.equals(this.detail, loginWithPassword401Response.detail) &&
        Objects.equals(this.instance, loginWithPassword401Response.instance) &&
        Objects.equals(this.code, loginWithPassword401Response.code) &&
        Objects.equals(this.errors, loginWithPassword401Response.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, title, detail, instance, code, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithPassword401Response {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

