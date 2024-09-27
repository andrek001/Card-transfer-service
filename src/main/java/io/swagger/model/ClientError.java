package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * InlineResponse400
 */
@Validated


public class ClientError {
    @JsonProperty("message")
    @NotNull
    private String message = null;

    @JsonProperty("id")
    private Integer id = null;

    public ClientError message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Error customer message
     *
     * @return message
     **/
    @Schema(description = "Error customer message")
    @NotNull
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ClientError id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @Schema(description = "")
    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
}
