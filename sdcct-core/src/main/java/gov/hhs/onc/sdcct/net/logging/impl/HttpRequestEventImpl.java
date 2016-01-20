package gov.hhs.onc.sdcct.net.logging.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.hhs.onc.sdcct.logging.impl.SdcctMarkerBuilder;
import gov.hhs.onc.sdcct.net.logging.HttpRequestEvent;
import gov.hhs.onc.sdcct.utils.SdcctStringUtils;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class HttpRequestEventImpl extends AbstractHttpEvent implements HttpRequestEvent {
    private String authType;
    private String contextPath;
    private String localName;
    private Integer localPort;
    private String method;
    private Map<String, List<String>> params;
    private String pathInfo;
    private String protocol;
    private String queryString;
    private String remoteAddr;
    private String remoteHost;
    private Integer remotePort;
    private String scheme;
    private boolean secure;
    private String serverName;
    private Integer serverPort;
    private String servletPath;
    private String uri;
    private String url;
    private String userPrincipal;

    @Override
    protected SdcctMarkerBuilder buildMarkerInternal() {
        String msgPrefix = String.format("HTTP %s request", this.endpointType.name().toLowerCase());

        return super.buildMarkerInternal().appendMessage(
            (msgPrefix + String.format(" (txId=%s, method=%s, uri=%s, headers=%s, localName=%s, localPort=%d, remoteAddr=%s, remoteHost=%s, remotePort=%d).",
                this.txId, this.method, this.uri, this.headers, this.localName, this.localPort, this.remoteAddr, this.remoteHost, this.remotePort)),
            (msgPrefix + SdcctStringUtils.PERIOD_CHAR));
    }

    @Override
    public boolean hasAuthType() {
        return (this.authType != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public String getAuthType() {
        return this.authType;
    }

    @Override
    public void setAuthType(@Nullable String authType) {
        this.authType = authType;
    }

    @Override
    public boolean hasContextPath() {
        return (this.contextPath != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public String getContextPath() {
        return this.contextPath;
    }

    @Override
    public void setContextPath(@Nullable String contextPath) {
        this.contextPath = contextPath;
    }

    @Override
    public boolean hasLocalName() {
        return (this.localName != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public String getLocalName() {
        return this.localName;
    }

    @Override
    public void setLocalName(@Nullable String localName) {
        this.localName = localName;
    }

    @Override
    public boolean hasLocalPort() {
        return (this.localPort != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public Integer getLocalPort() {
        return this.localPort;
    }

    @Override
    public void setLocalPort(@Nullable Integer localPort) {
        this.localPort = localPort;
    }

    @JsonProperty
    @Override
    public String getMethod() {
        return this.method;
    }

    @Override
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty
    @Override
    public Map<String, List<String>> getParameters() {
        return this.params;
    }

    @Override
    public void setParameters(Map<String, List<String>> params) {
        this.params = params;
    }

    @JsonProperty
    @Override
    public String getPathInfo() {
        return this.pathInfo;
    }

    @Override
    public void setPathInfo(String pathInfo) {
        this.pathInfo = pathInfo;
    }

    @JsonProperty
    @Override
    public String getProtocol() {
        return this.protocol;
    }

    @Override
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonProperty
    @Override
    public String getQueryString() {
        return this.queryString;
    }

    @Override
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    @Override
    public boolean hasRemoteAddr() {
        return (this.remoteAddr != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public String getRemoteAddr() {
        return this.remoteAddr;
    }

    @Override
    public void setRemoteAddr(@Nullable String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    @JsonProperty
    @Override
    public String getRemoteHost() {
        return this.remoteHost;
    }

    @Override
    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    @JsonProperty
    @Override
    public Integer getRemotePort() {
        return this.remotePort;
    }

    @Override
    public void setRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
    }

    @JsonProperty
    @Override
    public String getScheme() {
        return this.scheme;
    }

    @Override
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @JsonProperty
    @Override
    public boolean isSecure() {
        return this.secure;
    }

    @Override
    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    @Override
    public boolean hasServerName() {
        return (this.serverName != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public String getServerName() {
        return this.serverName;
    }

    @Override
    public void setServerName(@Nullable String serverName) {
        this.serverName = serverName;
    }

    @Override
    public boolean hasServerPort() {
        return (this.serverPort != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public Integer getServerPort() {
        return this.serverPort;
    }

    @Override
    public void setServerPort(@Nullable Integer serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public boolean hasServletPath() {
        return (this.servletPath != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public String getServletPath() {
        return this.servletPath;
    }

    @Override
    public void setServletPath(@Nullable String servletPath) {
        this.servletPath = servletPath;
    }

    @JsonProperty
    @Override
    public String getUri() {
        return this.uri;
    }

    @Override
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty
    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean hasUserPrincipal() {
        return (this.userPrincipal != null);
    }

    @JsonProperty
    @Nullable
    @Override
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

    @Override
    public void setUserPrincipal(@Nullable String userPrincipal) {
        this.userPrincipal = userPrincipal;
    }
}