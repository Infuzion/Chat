/*
 *
 *  *  Copyright 2016 Infuzion
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package infuzion.chat.server.event.connection;

import infuzion.chat.server.IChatClient;
import infuzion.chat.server.event.Event;

public abstract class ConnectionEvent extends Event {
    private final IChatClient client;

    public ConnectionEvent(IChatClient client) {
        this.client = client;
    }

    public IChatClient getClient() {
        return client;
    }
}
