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

package me.infuzion.chat.server.api.event.chat;

import me.infuzion.chat.server.api.IChatClient;
import me.infuzion.chat.server.api.event.BaseEvent;
import me.infuzion.chat.server.api.event.Cancelable;

@SuppressWarnings("unused")
public abstract class ChatEvent extends BaseEvent implements Cancelable {
    private final IChatClient sender;
    private String message;
    private boolean canceled = false;

    public ChatEvent(IChatClient sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public IChatClient getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isCanceled() {
        return canceled;
    }

    @Override
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
