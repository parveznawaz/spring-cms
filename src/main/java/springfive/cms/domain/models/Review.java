package springfive.cms.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author parvez
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {
    String userId;
    String status;
}
