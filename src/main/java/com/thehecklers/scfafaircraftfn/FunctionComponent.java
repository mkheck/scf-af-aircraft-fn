package com.thehecklers.scfafaircraftfn;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.function.Function;

@Component
public class FunctionComponent {
    private Function<Aircraft, Aircraft> ac;

    public FunctionComponent(Function<Aircraft, Aircraft> ac) {
        this.ac = ac;
    }

    @FunctionName("ac")
    public HttpResponseMessage acFunction(@HttpTrigger(name = "req",
            methods = {HttpMethod.GET, HttpMethod.POST},
            authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<Aircraft>> request,
                                          ExecutionContext context) {
        return request.createResponseBuilder(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body(ac.apply(request.getBody().get()))
                .build();
    }
}
