package de.koenigsohn.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.koenigsohn.entities.DependencyDTO;
import de.koenigsohn.entities.LicenceDTO;
import de.koenigsohn.entities.LicensesDTO;
import de.koenigsohn.utils.FileReader;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


@Component
@Endpoint(id = "licenses")
public class LicenseController {

    ObjectMapper objectMapper = new ObjectMapper();

    @ReadOperation
    public Set<String> getLicences() throws IOException {
        String data = FileReader.readFileInputStream("dependency-license.json");
        LicensesDTO licensesDTO = objectMapper.readValue(data, LicensesDTO.class);
        Set<String> licenceDTOMap = new HashSet<>();
        licensesDTO.getDependencies().forEach( item -> item.getLicenses().forEach(l-> licenceDTOMap.add(l.getName())));

        return licenceDTOMap;
    }

}
