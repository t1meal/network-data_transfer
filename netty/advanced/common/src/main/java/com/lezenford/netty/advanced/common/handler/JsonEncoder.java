package com.lezenford.netty.advanced.common.handler;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.lezenford.netty.advanced.common.message.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;


import java.util.List;

public class JsonEncoder extends MessageToMessageEncoder<Message> {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    protected void encode(ChannelHandlerContext ctx, Message msg, List<Object> out) throws Exception {
        String value = OBJECT_MAPPER.writeValueAsString(msg);
        out.add(value);
    }
}
