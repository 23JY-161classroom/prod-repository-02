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
 * CheckUserAvailability200ResponseUsername
 */

@JsonTypeName("checkUserAvailability_200_response_username")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public class CheckUserAvailability200ResponseUsername {

  private @Nullable Boolean available;

  public CheckUserAvailability200ResponseUsername available(@Nullable Boolean available) {
    this.available = available;
    return this;
  }

  /**
   * ユーザー名に重複がなければ `true`
   * @return available
   */
  
  @Schema(name = "available", description = "ユーザー名に重複がなければ `true`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("available")
  public @Nullable Boolean getAvailable() {
    return available;
  }

  @JsonProperty("available")
  public void setAvailable(@Nullable Boolean available) {
    this.available = available;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckUserAvailability200ResponseUsername checkUserAvailability200ResponseUsername = (CheckUserAvailability200ResponseUsername) o;
    return Objects.equals(this.available, checkUserAvailability200ResponseUsername.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckUserAvailability200ResponseUsername {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

