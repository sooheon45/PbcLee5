package springsaga.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "OverseasDelivery", url = "${api.url.OverseasDelivery}")
public interface OverseasDeliveryService {
    @RequestMapping(method = RequestMethod.POST, path = "/overseasDeliveries")
    public void startOverseasDelivery(
        @RequestBody OverseasDelivery overseasDelivery
    );
}
