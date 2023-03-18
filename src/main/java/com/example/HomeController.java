package com.example;
import com.example.model.EnversEntity;
import com.example.repository.EnversEntityRepositoryIfc;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private final EnversEntityRepositoryIfc enversEntityRepositoryIfc;

    public HomeController(EnversEntityRepositoryIfc enversEntityRepositoryIfc) {
        this.enversEntityRepositoryIfc = enversEntityRepositoryIfc;
    }

    @Get
    public Map<String, Object> index() {
        logger.info("Home Index");
        EnversEntity enversEntity = new EnversEntity();
        enversEntityRepositoryIfc.save(enversEntity);
        return Collections.singletonMap("message", "Created Entity: " + enversEntity.getId());
    }
}
