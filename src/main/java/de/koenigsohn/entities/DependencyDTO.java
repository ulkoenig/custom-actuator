package de.koenigsohn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DependencyDTO {
    String name;
    String file;
    List<LicenceDTO> licenses = new ArrayList<>();
}
