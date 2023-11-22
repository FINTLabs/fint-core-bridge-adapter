package no.fintlabs.utdanning;

import no.fint.event.model.Event;
import no.fint.model.resource.FintLinks;
import no.fint.model.utdanning.elev.ElevActions;

import java.util.Collections;
import java.util.Set;

public class ElevHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {
        // TODO: 22/11/2023 Implement this method
    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(ElevActions.GET_ALL_ELEV.name());
    }

    @Override
    public boolean health() {
        return true;
    }
}
