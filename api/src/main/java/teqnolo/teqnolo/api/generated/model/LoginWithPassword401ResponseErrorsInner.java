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
 * API 利用者に対して、問題の詳細を明示的に提供するためのオブジェクト。
 */

@Schema(name = "loginWithPassword_401_response_errors_inner", description = "API 利用者に対して、問題の詳細を明示的に提供するためのオブジェクト。")
@JsonTypeName("loginWithPassword_401_response_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class LoginWithPassword401ResponseErrorsInner {

  private String detail;

  private @Nullable String pointer;

  private @Nullable String parameter;

  private @Nullable String header;

  private @Nullable String code;

  public LoginWithPassword401ResponseErrorsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoginWithPassword401ResponseErrorsInner(String detail) {
    this.detail = detail;
  }

  public LoginWithPassword401ResponseErrorsInner detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * リクエストボディのプロパティ、クエリパラメータ、 パスパラメータ、またはヘッダーに関連する具体的なエラー内容の説明。 
   * @return detail
   */
  @NotNull @Size(max = 4096) 
  @Schema(name = "detail", description = "リクエストボディのプロパティ、クエリパラメータ、 パスパラメータ、またはヘッダーに関連する具体的なエラー内容の説明。 ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  @JsonProperty("detail")
  public void setDetail(String detail) {
    this.detail = detail;
  }

  public LoginWithPassword401ResponseErrorsInner pointer(@Nullable String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * エラーの原因となったリクエストボディ内のプロパティを指す JSON Pointer。
   * @return pointer
   */
  @Size(max = 1024) 
  @Schema(name = "pointer", description = "エラーの原因となったリクエストボディ内のプロパティを指す JSON Pointer。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointer")
  public @Nullable String getPointer() {
    return pointer;
  }

  @JsonProperty("pointer")
  public void setPointer(@Nullable String pointer) {
    this.pointer = pointer;
  }

  public LoginWithPassword401ResponseErrorsInner parameter(@Nullable String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * エラーの原因となったクエリパラメータまたはパスパラメータの名前。
   * @return parameter
   */
  @Size(max = 1024) 
  @Schema(name = "parameter", description = "エラーの原因となったクエリパラメータまたはパスパラメータの名前。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter")
  public @Nullable String getParameter() {
    return parameter;
  }

  @JsonProperty("parameter")
  public void setParameter(@Nullable String parameter) {
    this.parameter = parameter;
  }

  public LoginWithPassword401ResponseErrorsInner header(@Nullable String header) {
    this.header = header;
    return this;
  }

  /**
   * エラーの原因となった HTTP ヘッダーの名前。
   * @return header
   */
  @Size(max = 1024) 
  @Schema(name = "header", description = "エラーの原因となった HTTP ヘッダーの名前。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public @Nullable String getHeader() {
    return header;
  }

  @JsonProperty("header")
  public void setHeader(@Nullable String header) {
    this.header = header;
  }

  public LoginWithPassword401ResponseErrorsInner code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * エラーの文脈を識別するための、プロバイダー固有の追加コード。
   * @return code
   */
  @Size(max = 50) 
  @Schema(name = "code", description = "エラーの文脈を識別するための、プロバイダー固有の追加コード。", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWithPassword401ResponseErrorsInner loginWithPassword401ResponseErrorsInner = (LoginWithPassword401ResponseErrorsInner) o;
    return Objects.equals(this.detail, loginWithPassword401ResponseErrorsInner.detail) &&
        Objects.equals(this.pointer, loginWithPassword401ResponseErrorsInner.pointer) &&
        Objects.equals(this.parameter, loginWithPassword401ResponseErrorsInner.parameter) &&
        Objects.equals(this.header, loginWithPassword401ResponseErrorsInner.header) &&
        Objects.equals(this.code, loginWithPassword401ResponseErrorsInner.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, pointer, parameter, header, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithPassword401ResponseErrorsInner {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

