package io.swagger.api;

import jakarta.validation.Valid;
import io.swagger.model.ConfirmOperationBody;
import io.swagger.model.Response;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfirmOperationApiController {

    private static final Logger log = LoggerFactory.getLogger(ConfirmOperationApiController.class);
@PostMapping("/confirmOperation")
@CrossOrigin
    public ResponseEntity<Response> confirmOperationPost(@Parameter(in = ParameterIn.DEFAULT, description = "Confirm operation", required = true, schema = @Schema()) @Valid @RequestBody ConfirmOperationBody body
    ) {
        return new ResponseEntity<Response>(HttpStatus.OK);
    }

}
