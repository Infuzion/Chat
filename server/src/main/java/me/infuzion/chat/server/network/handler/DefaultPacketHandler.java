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

package me.infuzion.chat.server.network.handler;

import me.infuzion.chat.server.api.IChatRoomManager;
import me.infuzion.chat.server.api.command.ICommandManager;
import me.infuzion.chat.server.api.event.IEventManager;
import me.infuzion.chat.server.network.DefaultPacketRouter;

public class DefaultPacketHandler {
    private final IEventManager eventManager;
    private final IChatRoomManager chatRoomManager;
    private final ICommandManager commandManager;

    public DefaultPacketHandler(IEventManager eventManager, IChatRoomManager chatRoomManager, ICommandManager commandManager, DefaultPacketRouter router) {
        this.eventManager = eventManager;
        this.chatRoomManager = chatRoomManager;
        this.commandManager = commandManager;
    }
}
