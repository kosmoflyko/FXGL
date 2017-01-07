package com.almasb.ents;

/**
 * Listener for component related events.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public interface ComponentListener {

    /**
     * Called after a component is added to an entity.
     *
     * @param component the component
     */
    void onComponentAdded(Component component);

    /**
     * Called before a component is removed from an entity.
     *
     * @param component the component
     */
    void onComponentRemoved(Component component);
}