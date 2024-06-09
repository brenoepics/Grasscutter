package emu.grasscutter.utils.objects;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.encoder.Encoder;
import emu.grasscutter.server.event.internal.ServerLogEvent;
import lombok.Getter;

import java.nio.charset.StandardCharsets;

@Getter
public final class ServerLogEventAppender<E> extends AppenderBase<E> {
    private Encoder<E> encoder;

    @Override
    protected void append(E event) {
        byte[] byteArray = this.encoder.encode(event);
        ServerLogEvent sle =
                new ServerLogEvent((ILoggingEvent) event, new String(byteArray, StandardCharsets.UTF_8));
        sle.call();
    }

    public void setEncoder(Encoder<E> encoder) {
        this.encoder = encoder;
    }
}
