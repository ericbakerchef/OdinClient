package foo.starred.odinclient.events.dispatcher

import foo.starred.odinclient.events.TickStartEvent
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents

object FabricEventDispatcher {
    init {
        ClientTickEvents.START_CLIENT_TICK.register {
            TickStartEvent.postAndCatch()
        }
    }
}
