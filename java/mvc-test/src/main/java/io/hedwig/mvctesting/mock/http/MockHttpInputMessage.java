package io.hedwig.mvctesting.mock.http;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.util.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by patrick on 15/12/4.
 */
public class MockHttpInputMessage implements HttpInputMessage{

    private final HttpHeaders headers = new HttpHeaders();

    private final InputStream body;

    public MockHttpInputMessage(byte[] contents) {
        this.body = (contents != null) ? new ByteArrayInputStream(contents) : null;
    }

    public MockHttpInputMessage(InputStream body) {
        Assert.notNull(body, "'body' must not be null");
        this.body = body;
    }

    @Override
    public InputStream getBody() throws IOException {
        return this.body;
    }

    @Override
    public HttpHeaders getHeaders() {
        return this.headers;
    }
}
