package springfive.cms.domain.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    String id;
    String identity;
    String name;
    Role role;
}
