package io.slingr.endpoints.kubernetes;

import io.slingr.endpoints.HttpEndpoint;
import io.slingr.endpoints.framework.annotations.EndpointProperty;
import io.slingr.endpoints.framework.annotations.SlingrEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Kubernetes endpoint
 *
 * <p>Created by dgaviola on 08/22/15.
 */
@SlingrEndpoint(name = "kubernetes")
public class KubernetesEndpoint extends HttpEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(KubernetesEndpoint.class);

    @EndpointProperty
    private String apiUrl;

    @EndpointProperty
    private String apiVersion;

    @Override
    public String getApiUri() {
        return String.format("%s/%s", apiUrl, apiVersion);
    }
}