package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * ConfirmOperationBody
 */
@Validated

public class ConfirmOperationBody   {
  @JsonProperty("operationId")
  private String operationId = null;

  @JsonProperty("code")
  private String code = null;

  public ConfirmOperationBody operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Operation id
   * @return operationId
   **/
  @Schema(description = "Operation id")
      @NotNull

    public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public ConfirmOperationBody code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Verification code
   * @return code
   **/
  @Schema(description = "Verification code")
      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmOperationBody confirmOperationBody = (ConfirmOperationBody) o;
    return Objects.equals(this.operationId, confirmOperationBody.operationId) &&
        Objects.equals(this.code, confirmOperationBody.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmOperationBody {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
