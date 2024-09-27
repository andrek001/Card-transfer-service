package io.swagger.api;

import io.swagger.model.Response;
import io.swagger.model.TransferBody;
import io.swagger.service.LogService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping()
public class TransferApiController {
    private final LogService logService;

    public TransferApiController(LogService logService) {
        this.logService = logService;
    }

    @CrossOrigin
    @PostMapping("/transfer")
    public ResponseEntity<Response> transferPost(@Valid @RequestBody TransferBody body)
    {
        logService.writeLog(body);
        Response response = new Response();
        response.setOperationId(UUID.randomUUID().toString());
        return ResponseEntity.ok(response);
    }

}
