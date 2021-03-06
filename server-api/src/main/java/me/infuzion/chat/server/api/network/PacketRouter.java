/*
 * Copyright 2018 Srikavin Ramkumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.infuzion.chat.server.api.network;

import infuzion.chat.common.network.packet.NetworkPacket;
import me.infuzion.chat.server.api.IChatClient;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.function.BiConsumer;

public interface PacketRouter {
    <T extends NetworkPacket> void registerNetworkPacketHandler(Class<T> packet, BiConsumer<T, IChatClient> method);

    <T extends NetworkPacket> void registerNetworkPacketHandler(Class<T> packet, BiConsumer<T, IChatClient> method, Class<? extends NetworkSource> source);

    <T extends NetworkPacket> void registerNetworkPacketHandler(short signature, BiConsumer<T, IChatClient> method);

    void sendNetworkPacket(ClientConnection connection, NetworkPacket packet) throws IOException;

    NetworkPacket parseBuffer(ByteBuffer packetBuffer);

    void handleNetworkPacket(ByteBuffer packetBuffer, IChatClient client);

    void handleNetworkPacket(NetworkPacket packet, IChatClient client);

    void handleNetworkPacket(NetworkPacket packet, IChatClient client, Class<? extends NetworkSource> source);
}
