package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TransferAmount;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

/**
 * TransferBody
 */
@Validated

public class TransferBody   {
  @JsonProperty("cardFromNumber")
  @Size(min = 16, max = 16)
  private String cardFromNumber = null;

  @JsonProperty("cardFromValidTill")
  private String cardFromValidTill = null;

  @Size(min = 3, max = 3)
  @JsonProperty("cardFromCVV")
  private String cardFromCVV = null;

  @Size(min=16, max = 16)
  @JsonProperty("cardToNumber")
  private String cardToNumber = null;

  @JsonProperty("amount")
  private TransferAmount amount = null;

  public TransferBody cardFromNumber(String cardFromNumber) {
    this.cardFromNumber = cardFromNumber;
    return this;
  }

  /**
   * Get cardFromNumber
   * @return cardFromNumber
   **/
  @Schema(description = "")
      @NotNull

    public String getCardFromNumber() {
    return cardFromNumber;
  }

  public void setCardFromNumber(String cardFromNumber) {
    this.cardFromNumber = cardFromNumber;
  }

  public TransferBody cardFromValidTill(String cardFromValidTill) {
    this.cardFromValidTill = cardFromValidTill;
    return this;
  }

  /**
   * Get cardFromValidTill
   * @return cardFromValidTill
   **/
  @Schema(description = "")
      @NotNull

    public String getCardFromValidTill() {
    return cardFromValidTill;
  }

  public void setCardFromValidTill(String cardFromValidTill) {
    this.cardFromValidTill = cardFromValidTill;
  }

  public TransferBody cardFromCVV(String cardFromCVV) {
    this.cardFromCVV = cardFromCVV;
    return this;
  }

  /**
   * Get cardFromCVV
   * @return cardFromCVV
   **/
  @Schema(description = "")
      @NotNull

    public String getCardFromCVV() {
    return cardFromCVV;
  }

  public void setCardFromCVV(String cardFromCVV) {
    this.cardFromCVV = cardFromCVV;
  }

  public TransferBody cardToNumber(String cardToNumber) {
    this.cardToNumber = cardToNumber;
    return this;
  }

  /**
   * Get cardToNumber
   * @return cardToNumber
   **/
  @Schema(description = "")
      @NotNull

    public String getCardToNumber() {
    return cardToNumber;
  }

  public void setCardToNumber(String cardToNumber) {
    this.cardToNumber = cardToNumber;
  }

  public TransferBody amount(TransferAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public TransferAmount getAmount() {
    return amount;
  }

  public void setAmount(TransferAmount amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferBody transferBody = (TransferBody) o;
    return Objects.equals(this.cardFromNumber, transferBody.cardFromNumber) &&
        Objects.equals(this.cardFromValidTill, transferBody.cardFromValidTill) &&
        Objects.equals(this.cardFromCVV, transferBody.cardFromCVV) &&
        Objects.equals(this.cardToNumber, transferBody.cardToNumber) &&
        Objects.equals(this.amount, transferBody.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardFromNumber, cardFromValidTill, cardFromCVV, cardToNumber, amount);
  }

  @Override
  public String toString() {
    return
            String.format("cardFrom %s validTill %s CVV", toIndentedString(cardFromNumber), toIndentedString(cardFromValidTill),
                    toIndentedString(cardFromCVV));
    /*StringBuilder sb = new StringBuilder();
    sb.append(toIndentedString(cardFromNumber) + ";" + );
    sb.append(toIndentedString(cardFromValidTill)).append("\n");
    sb.append("    cardFromCVV: ").append(toIndentedString(cardFromCVV)).append("\n");
    sb.append("    cardToNumber: ").append(toIndentedString(cardToNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    return sb.toString();
  }*/
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
