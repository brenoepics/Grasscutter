package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketSetPlayerNameRsp;

@Opcodes(PacketOpcodes.SetPlayerNameReq)
public class HandlerSetPlayerNameReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        // Auto template
        SetPlayerNameReq req = SetPlayerNameReq.parseFrom(payload);

        if (req.getNickName() != null && !req.getNickName().isEmpty()) {
            session.getPlayer().setNickname(req.getNickName());
            session.send(new PacketSetPlayerNameRsp(session.getPlayer()));
        }
    }
}
