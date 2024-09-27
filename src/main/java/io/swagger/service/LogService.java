package io.swagger.service;

import io.swagger.model.TransferBody;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    public void writeLog(TransferBody transferBody) {
        System.out.println(transferBody);
    }
}
